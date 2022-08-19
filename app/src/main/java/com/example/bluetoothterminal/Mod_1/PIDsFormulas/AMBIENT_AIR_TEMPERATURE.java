package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class AMBIENT_AIR_TEMPERATURE {
    public static String read(String firstHex){
        String response = null;

        int firstDecimal = Integer.parseInt(firstHex, 16);
        int temperature =  firstDecimal - 40;

        response = "Ambient air temperature: " + Integer.toString(temperature) + " °C \n";

        return response;
    }
}
