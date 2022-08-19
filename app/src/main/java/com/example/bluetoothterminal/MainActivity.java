package com.example.bluetoothterminal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bluetoothterminal.Mod_1.Mod1Activity;
import com.example.bluetoothterminal.Mod_2.Mod2Activity;
import com.example.bluetoothterminal.Mod_3.Mod3Activity;
import com.example.bluetoothterminal.Mod_4.Mod4Activity;
import com.example.bluetoothterminal.Mod_5.Mod5Activity;
import com.example.bluetoothterminal.Mod_6.Mod6Activity;
import com.example.bluetoothterminal.Mod_7.Mod7Activity;
import com.example.bluetoothterminal.Mod_9.Mod9Activity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Button button1 = (Button) findViewById(R.id.buttonMod1);
        Button button2 = (Button) findViewById(R.id.buttonMod2);
        Button button3 = (Button) findViewById(R.id.buttonMod3);
        Button button4 = (Button) findViewById(R.id.buttonMod4);
        Button button5 = (Button) findViewById(R.id.buttonMod5);
        Button button6 = (Button) findViewById(R.id.buttonMod6);
        Button button7 = (Button) findViewById(R.id.buttonMod7);
        Button button9 = (Button) findViewById(R.id.buttonMod9);
        Button buttonTerminal = (Button) findViewById(R.id.buttonTerminal);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openMod1Activity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openMod2Activity();
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openMod3Activity();
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openMod4Activity();
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openMod5Activity();
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openMod6Activity();
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openMod7Activity();
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openMod9Activity();
            }
        });
        buttonTerminal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openTerminalActivity();
            }
        });

    }
    public void openMod1Activity(){
        Intent intent = new Intent(this, Mod1Activity.class);
        startActivity(intent);
    }
    public void openMod2Activity(){
        Intent intent = new Intent(this, Mod2Activity.class);
        startActivity(intent);
    }
    public void openMod3Activity(){
        Intent intent = new Intent(this, Mod3Activity.class);
        startActivity(intent);
    }
    public void openMod4Activity(){
        Intent intent = new Intent(this, Mod4Activity.class);
        startActivity(intent);
    }
    public void openMod5Activity(){
        Intent intent = new Intent(this, Mod5Activity.class);
        startActivity(intent);
    }
    public void openMod6Activity(){
        Intent intent = new Intent(this, Mod6Activity.class);
        startActivity(intent);
    }
    public void openMod7Activity(){
        Intent intent = new Intent(this, Mod7Activity.class);
        startActivity(intent);
    }
    public void openMod9Activity(){
        Intent intent = new Intent(this, Mod9Activity.class);
        startActivity(intent);
    }
    public void openTerminalActivity(){
        Intent intent = new Intent(this, TerminalActivity.class);
        startActivity(intent);
    }
}
