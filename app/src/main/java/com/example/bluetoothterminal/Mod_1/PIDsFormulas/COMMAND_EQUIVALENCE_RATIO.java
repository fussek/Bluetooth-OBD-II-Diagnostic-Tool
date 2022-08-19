package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class COMMAND_EQUIVALENCE_RATIO {

    public static String read(String firstHex, String secondHex) {
        String response = null;

        float firstDecimal = Integer.parseInt(firstHex, 16);
        float secondDecimal = Integer.parseInt(secondHex, 16);

        float ratio = 2*((256 * firstDecimal) + secondDecimal) / 65536;

        response = "Fuel-Air commanded equivalence ratio: " + Float.toString(ratio) +" \n ";
        return response;
    }


}
