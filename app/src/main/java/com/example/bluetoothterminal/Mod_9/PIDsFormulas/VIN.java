package com.example.bluetoothterminal.Mod_9.PIDsFormulas;

public class VIN {
    public static String read(String hexLine) {
        String response = null;

        if (hexLine.length() % 2 != 0) {
            response = "\n Invalid VIN number. \n";
        } else {
            /**
             *              17 CHARACTER VIN NUMBER
             *    _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _
             *   |_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_|
             */
            StringBuilder VIN_builder = new StringBuilder();

            for (int i = 0; i < hexLine.length(); i = i + 2) {
                String character = hexLine.substring(i, i + 2);
                int value = Integer.valueOf(character, 16);
                VIN_builder.append((char) value);
            }
            String VIN = VIN_builder.toString();
            response = "\n This car's VIN Number: " + VIN + " \n";
        }
        return response;
    }}
