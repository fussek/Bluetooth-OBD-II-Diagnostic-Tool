package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class CONTROL_MODULE_VOLTAGE {
    public static String read(String firstHex, String secondHex) {
        String response = null;

        float firstDecimal = Integer.parseInt(firstHex, 16);
        float secondDecimal = Integer.parseInt(firstHex, 16);
        float voltage = (256 * firstDecimal + secondDecimal) / 1000;

        response = "Control module voltage : " + Float.toString(voltage) + " V \n";
        return response;
    }
}
