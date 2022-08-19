package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class DISTANCE_TRAVELLED_WITH_MIL_ON {
    public static String read(String firstHex, String secondHex){
        String response = null;

        int firstDecimal = Integer.parseInt(firstHex, 16);
        int secondDecimal = Integer.parseInt(secondHex, 16);

        int distance = (256 * firstDecimal) + secondDecimal;

        response = "Distance traveled with MIL malfunction indicator lamp on: " + Integer.toString(distance) + " km";
        return response;
    }
}
