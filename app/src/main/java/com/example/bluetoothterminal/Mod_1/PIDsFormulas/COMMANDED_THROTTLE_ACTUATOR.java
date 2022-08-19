package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class COMMANDED_THROTTLE_ACTUATOR {
    public static String read(String firstHex) {
        String response = null;

        float firstDecimal = Integer.parseInt(firstHex, 16);
        float ThrottActu = 100 * firstDecimal / 255;

        response = "Commanded throttle actuator: " + Float.toString(ThrottActu) + " % \n";
        return response;
    }
}
