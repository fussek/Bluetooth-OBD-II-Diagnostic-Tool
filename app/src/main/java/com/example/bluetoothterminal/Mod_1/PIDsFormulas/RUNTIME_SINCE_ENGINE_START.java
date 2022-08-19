package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class RUNTIME_SINCE_ENGINE_START {
    public static String read(String firstHex, String secondHex) {
        String response = null;

        int firstDecimal = Integer.parseInt(firstHex, 16);
        int secondDecimal = Integer.parseInt(secondHex, 16);

        int time = (256 * firstDecimal) + secondDecimal;

        response = "Run time since engine start = " + Integer.toString(time) +" sec \n";
        return response;
    }


}
