package com.example.bluetoothterminal.Mod_9.PIDsFormulas;

public class ECU_NAME {
    public static String read(String ECUhexline)    {
        String response = null;

        if (ECUhexline.length()%2!=0){
            response = "\n Invalid ECU name. \n";
        }

        /**
         *              20 CHARACTER ECU NAME
         *    _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _
         *   |_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_|
         *
         */

        StringBuilder ECU_builder = new StringBuilder();

        for (int i = 0; i < ECUhexline.length(); i = i + 2) {
            String character = ECUhexline.substring(i, i + 2);
            int value = Integer.valueOf(character, 16);
            ECU_builder.append((char) value);

        }
        String ECU = ECU_builder.toString();
        response = "\n This car's ECU name: " + ECU + " \n";
        return response;
    }
}
