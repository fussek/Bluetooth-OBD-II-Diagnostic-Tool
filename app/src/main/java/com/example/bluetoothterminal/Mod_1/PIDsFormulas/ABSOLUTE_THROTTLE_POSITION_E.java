package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class ABSOLUTE_THROTTLE_POSITION_E {
    public static String read(String firstHex) {
        String response = null;

        float firstDecimal = Integer.parseInt(firstHex, 16);
        float position = 100 * firstDecimal / 255;

        response = "Absolute throttle position 'E' : " + Float.toString(position) + " % \n";
        return response;
    }
}
