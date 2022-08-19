package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class ABSOLUTE_LOAD_VALUE {
    public static String read(String firstHex, String secondHex) {
        String response = null;

        float firstDecimal = Integer.parseInt(firstHex, 16);
        float secondDecimal = Integer.parseInt(firstHex, 16);
        float load = 100 * (256*firstDecimal + secondDecimal) / 255;

        response = "Absolute load value : " + Float.toString(load) + " % \n";
        return response;
    }
}
