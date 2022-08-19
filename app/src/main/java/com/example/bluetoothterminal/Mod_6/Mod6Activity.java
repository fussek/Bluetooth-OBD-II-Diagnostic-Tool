package com.example.bluetoothterminal.Mod_6;


import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bluetoothterminal.PIDsEnums.SixthModeRequestEnums;
import com.example.bluetoothterminal.R;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;

public class Mod6Activity extends AppCompatActivity {

    private final String DEVICE_ADDRESS = "00:00:00:00:11:11";
    private final UUID PORT_UUID = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");//Serial Port Service ID
    private final String MOD_6_PREFIX = "46";
    private BluetoothDevice device;
    private BluetoothSocket socket;
    private OutputStream outputStream;
    private InputStream inputStream;
    Button startButton, sendButton, clearButton, stopButton;
    TextView textView;
    Spinner MOD_6_LIST;
    boolean deviceConnected = false;
    Thread thread;
    byte buffer[];
    int bufferPosition;
    boolean stopThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mod_6_activity);
        startButton = (Button) findViewById(R.id.buttonStart);
        sendButton = (Button) findViewById(R.id.buttonSend);
        clearButton = (Button) findViewById(R.id.buttonClear);
        stopButton = (Button) findViewById(R.id.buttonStop);
        textView = (TextView) findViewById(R.id.textView);
        MOD_6_LIST = (Spinner) findViewById(R.id.mod6list);

        ArrayAdapter<SixthModeRequestEnums> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, SixthModeRequestEnums.values());
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        MOD_6_LIST.setAdapter(myAdapter);

        setupUserInterface(false);
    }

    public void setupUserInterface(boolean bool) {
        startButton.setEnabled(!bool);
        sendButton.setEnabled(bool);
        stopButton.setEnabled(bool);
        textView.setEnabled(bool);
    }

    public boolean initializeBluetoothAdapter() {
        boolean found = false;
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null) {
            Toast.makeText(getApplicationContext(), "Bluetooth not supported", Toast.LENGTH_SHORT).show();
        }
        if (!bluetoothAdapter.isEnabled()) {
            Intent enableAdapter = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableAdapter, 0);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
        if (bondedDevices.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Device is not paired", Toast.LENGTH_SHORT).show();
        } else {
            for (BluetoothDevice deviceIterator : bondedDevices) {
                if (deviceIterator.getAddress().equals(DEVICE_ADDRESS)) {
                    device = deviceIterator;
                    found = true;
                    break;
                }
            }
        }
        return found;
    }

    public boolean initializeBluetoothConnection() {
        boolean connected = true;
        try {
            socket = device.createRfcommSocketToServiceRecord(PORT_UUID);
            socket.connect();
        } catch (IOException e) {
            e.printStackTrace();
            connected = false;
        }
        if (connected) {
            try {
                outputStream = socket.getOutputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream = socket.getInputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        return connected;
    }


    public void onClickStart(View view) {

        if (initializeBluetoothAdapter()) {
            if (initializeBluetoothConnection()) {
                setupUserInterface(true);
                deviceConnected = true;
                dataListening();
                textView.append("\nConnection Opened!\n");
            }
        }
    }

    void dataListening() {
        final Handler handler = new Handler();
        stopThread = false;
        buffer = new byte[1024];
        Thread thread = new Thread(new Runnable() {
            public void run() {
                while (!Thread.currentThread().isInterrupted() && !stopThread) {
                    try {
                        int byteCount = inputStream.available();
                        if (byteCount > 0) {
                            byte[] rawBytes = new byte[byteCount];
                            inputStream.read(rawBytes);
                            final String rawResponse = new String(rawBytes, "UTF-8");

                            if (rawResponse.startsWith(MOD_6_PREFIX)) {
                                final String response = MOD6ResponseCalculator.MOD6ResponseCalculator(rawResponse);
                                handler.post(new Runnable() {
                                    public void run() { textView.append(response); }});
                            } else {
                                handler.post(new Runnable() {
                                    public void run() { textView.append(rawResponse); }});
                            }
                        }
                    } catch (IOException ex) {
                        stopThread = true;
                    }
                }
            }
        });

        thread.start();
    }

    /**    REQUEST FORMAT
     *       ____   ____
     *      | 06 | |PID |
     *      |____| |____|
     */
    public void onClickSend(View view) {
        String PID = MOD_6_LIST.getSelectedItem().toString();
        String requestPID = "06" + SixthModeRequestEnums.valueOf(PID).getValue();
        requestPID.concat("\n");
        try {
            outputStream.write(requestPID.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        textView.append("\nRequest:" + PID + "\n");

    }

    public void onClickStop(View view) throws IOException {
        stopThread = true;
        outputStream.close();
        inputStream.close();
        socket.close();
        setupUserInterface(false);
        deviceConnected = false;
        textView.append("\nConnection Closed!\n");
    }

    public void onClickClear(View view) {
        textView.setText("");
    }
}
