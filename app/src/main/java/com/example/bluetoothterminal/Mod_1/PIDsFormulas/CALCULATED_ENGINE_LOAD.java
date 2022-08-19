package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class CALCULATED_ENGINE_LOAD {
    public static String read(String firstHex) {
        String response = null;

        float firstDecimal = Integer.parseInt(firstHex, 16);
        float engineLoad = 100 * firstDecimal / 255;

        response = "Calculated engine load: " + Float.toString(engineLoad) + " %";
        return response;
    }
}
