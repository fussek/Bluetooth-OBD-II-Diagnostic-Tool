package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class SHORT_TERM_FUEL_TRIM_BANK_2 {
    public static String read(String firstHex) {
        String response = null;
        int percentage = Integer.parseInt(firstHex, 16);
        response = "Short term fuel trim bank 2: " + Integer.toString(percentage) + " %.";
        return response;
    }
}
