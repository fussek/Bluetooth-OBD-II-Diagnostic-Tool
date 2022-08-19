    package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

    public class ENGINE_RPM {

        public static String read(String firstHex, String secondHex) {
            String response = null;

            int firstDecimal = Integer.parseInt(firstHex, 16);
            int secondDecimal = Integer.parseInt(secondHex, 16);

            int RPM = ((256 * firstDecimal) + secondDecimal) / 4;

            response = "Current RPM value: " + Integer.toString(RPM) +" rpm ";
            return response;
        }
    }



