package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class DISTANCE_TRAVELED_SINCE_CODES_CLEARED {
    public static String read(String firstHex, String secondHex){
        String response = null;

        int firstDecimal = Integer.parseInt(firstHex, 16);
        int secondDecimal = Integer.parseInt(secondHex, 16);

        int distance = (256 * firstDecimal) + secondDecimal;

        response = "Distance traveled since codes cleared: " + Integer.toString(distance) + " km";
        return response;
    }
}
