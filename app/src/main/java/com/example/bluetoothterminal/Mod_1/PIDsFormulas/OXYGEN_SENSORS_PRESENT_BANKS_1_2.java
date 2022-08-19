package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

import java.util.HashSet;
import java.util.Set;

public class OXYGEN_SENSORS_PRESENT_BANKS_1_2 {
    private static final String BANK_1_SENSOR_1 = "Bank 1: Oxygen sensor no. 1.";
    private static final String BANK_1_SENSOR_2 = "Bank 1: Oxygen sensor no. 2.";
    private static final String BANK_1_SENSOR_3 = "Bank 1: Oxygen sensor no. 3.";
    private static final String BANK_1_SENSOR_4 = "Bank 1: Oxygen sensor no. 4.";
    private static final String BANK_2_SENSOR_1 = "Bank 2: Oxygen sensor no. 1.";
    private static final String BANK_2_SENSOR_2 = "Bank 2: Oxygen sensor no. 2.";
    private static final String BANK_2_SENSOR_3 = "Bank 2: Oxygen sensor no. 3.";
    private static final String BANK_2_SENSOR_4 = "Bank 2: Oxygen sensor no. 4.";
    private static Set<String> OxygenSensorsList = new HashSet<String>();

    public static String read(String firstHex){
        String bitsLine = Integer.toBinaryString(Integer.parseInt(firstHex, 16));

        if (bitsLine.substring(0,1).equals("1")){
            OxygenSensorsList.add(BANK_1_SENSOR_1);
        }else if (bitsLine.substring(1,2).equals("1")){
            OxygenSensorsList.add(BANK_1_SENSOR_2);
        }else if (bitsLine.substring(2,3).equals("1")){
            OxygenSensorsList.add(BANK_1_SENSOR_3);
        }else if (bitsLine.substring(3,4).equals("1")){
            OxygenSensorsList.add(BANK_1_SENSOR_4);
        }else if (bitsLine.substring(4,5).equals("1")){
            OxygenSensorsList.add(BANK_2_SENSOR_1);
        }else if (bitsLine.substring(5,6).equals("1")){
            OxygenSensorsList.add(BANK_2_SENSOR_2);
        }else if (bitsLine.substring(6,7).equals("1")){
            OxygenSensorsList.add(BANK_2_SENSOR_3);
        }else if (bitsLine.substring(7,8).equals("1")){
            OxygenSensorsList.add(BANK_2_SENSOR_4);
        }


        String response = "List of oxygen sensors present in Bank 1 and Bank 2 (if present): \n" + OxygenSensorsList.toString();
        return response;
    }
}
