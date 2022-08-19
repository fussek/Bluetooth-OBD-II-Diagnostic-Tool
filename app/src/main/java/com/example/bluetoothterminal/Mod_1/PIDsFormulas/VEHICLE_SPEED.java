package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class VEHICLE_SPEED {
    public static String read(String firstHex){
        String response = null;

        int speed = Integer.parseInt(firstHex, 16);
        response = "Current vehicle speed: " + Integer.toString(speed) + " km/h.";

        return response;
    }
}
