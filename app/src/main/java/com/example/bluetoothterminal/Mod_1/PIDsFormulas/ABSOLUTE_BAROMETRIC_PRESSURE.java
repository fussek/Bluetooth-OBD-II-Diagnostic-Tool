package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class ABSOLUTE_BAROMETRIC_PRESSURE {
    public static String read(String firstHex){
        String response = null;

        int pressure = Integer.parseInt(firstHex, 16);
        response = "Absolute barometric pressure: " + Integer.toString(pressure) + " kPa. \n";

        return response;
    }
}
