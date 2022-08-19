package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class COMMANDED_EVAPORATIVE_PURGE {
    public static String read(String firstHex) {
        String response = null;

        float firstDecimal = Integer.parseInt(firstHex, 16);
        float EvapPurge = 100 * firstDecimal / 255;

        response = "Commanded Evaporative Purge: " + Float.toString(EvapPurge) + " % \n";
        return response;
    }
}
