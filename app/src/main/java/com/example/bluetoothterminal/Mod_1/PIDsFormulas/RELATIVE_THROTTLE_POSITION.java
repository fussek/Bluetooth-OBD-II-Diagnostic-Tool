package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class RELATIVE_THROTTLE_POSITION {
    public static String read(String firstHex) {
        String response = null;

        float firstDecimal = Integer.parseInt(firstHex, 16);
        float position = 100 * firstDecimal / 255;

        response = "Relative throttle position : " + Float.toString(position) + " % \n";
        return response;
    }
}
