package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class OXYGEN_SENSOR_2_SHORT_TERM_FUEL_TRIM {
    public static String read(String firstHex, String secondHex){

        /**
         *              Byte A: Voltage
         *              Byte B: Short term fuel trim
         */
        String response = null;
        float firstDecimal;
        float secondDecimal;

        if (!secondHex.equals("FF")) {
            firstDecimal = Integer.parseInt(firstHex, 16);
            secondDecimal = Integer.parseInt(secondHex, 16);
            float Voltage = firstDecimal / 200;
            float ShortTermFuelTrim = (100 * secondDecimal / 128) - 100;
            response = "Calculated voltage = " + Float.toString(Voltage) + " V \n" +
                       "Calculated short term fuel trim = " + Float.toString(ShortTermFuelTrim) + " % \n";
        } else {
            firstDecimal = Integer.parseInt(firstHex, 16);
            float Voltage = firstDecimal / 200;
            response = "Calculated voltage = " + Float.toString(Voltage) + " V \n" +
                       "This oxygen sensor is not used in trim calculations. \n";
        }

        return response;
    }
}
