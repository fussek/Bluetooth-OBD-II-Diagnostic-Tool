package com.example.bluetoothterminal.Mod_9.PIDsFormulas;

public class CVN {
    public static String read(String firstHex, String secondHex, String thirdHex, String fourthHex){
        String response = null;

        /**
         *                4 HEX CVN NUMBER
         *       _  _     _  _     _  _     _  _
         *      |_||_| - |_||_| - |_||_| - |_||_|
         *
         */

        String CVN = firstHex + " - " + secondHex + " - " + thirdHex + " - " + fourthHex;
        response = "\n This car's CVN Number: " + CVN + " \n";
        return response;
    }
}
