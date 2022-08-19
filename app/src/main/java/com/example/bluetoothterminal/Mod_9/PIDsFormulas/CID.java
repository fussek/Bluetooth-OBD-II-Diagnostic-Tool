package com.example.bluetoothterminal.Mod_9.PIDsFormulas;

public class CID {
    public static String read(String hexLine){
        String response = null;

        if (hexLine.length()%2!=0){
            response = "\n Invalid CID number. \n";
        }

        /**
         *                16 CHARACTER CID NUMBER
         *       _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _
         *      |_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_|
         *
         */

        StringBuilder CID_builder = new StringBuilder();

        for (int i = 0; i < hexLine.length(); i = i + 2) {
            String character = hexLine.substring(i, i + 2);
            int value = Integer.valueOf(character, 16);
            CID_builder.append((char) value);

        }
        String CID = CID_builder.toString().replaceAll("[^\\p{ASCII}]","0");
        response = "\n This car's CID Number: " + CID + " \n";
        return response;
    }

}
