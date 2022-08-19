package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class TIMING_ADVANCE {
    public static String read(String firstHex){
        String response = null;

        float firstDecimal = Integer.parseInt(firstHex, 16);
        float timingAdvance = (firstDecimal / 2) - 64;

        response = "Calculated timing advance : " + Float.toString(timingAdvance) + " ° before TDC \n(degrees before Top Dead Centre).";

        return response;
    }
}
