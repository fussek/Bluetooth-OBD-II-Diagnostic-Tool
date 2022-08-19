package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class COMMANDED_EGR {
    public static String read(String firstHex){
        String response = null;

        float firstDecimal = Integer.parseInt(firstHex, 16);
        float EGR = 100 * firstDecimal / 255;

        response = "Commanded Exhaust Gas Recirculation (EGR): " + Float.toString(EGR)+ "% \n";
        return response;
    }
}
