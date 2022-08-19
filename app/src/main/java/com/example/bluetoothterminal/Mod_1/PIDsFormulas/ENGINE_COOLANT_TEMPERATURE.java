package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class ENGINE_COOLANT_TEMPERATURE {
    public static String read(String firstHex){
        String response = null;

        int firstDecimal = Integer.parseInt(firstHex, 16);
        int temperature =  firstDecimal - 40;

        response = "Current Engine coolant temperature: " + Integer.toString(temperature) + " °C";
      return response;
    }
}
