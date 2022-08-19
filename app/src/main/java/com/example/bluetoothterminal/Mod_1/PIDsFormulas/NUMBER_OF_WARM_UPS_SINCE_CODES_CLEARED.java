package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class NUMBER_OF_WARM_UPS_SINCE_CODES_CLEARED {
    public static String read(String firstHex){
        String response = null;

        int number = Integer.parseInt(firstHex, 16);
        response = "Number of warm-ups since codes cleared: " + Integer.toString(number) + " \n";

        return response;
    }
}
