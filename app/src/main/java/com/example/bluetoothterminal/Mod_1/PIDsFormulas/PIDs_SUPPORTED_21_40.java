package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

import java.util.HashSet;
import java.util.Set;

public class PIDs_SUPPORTED_21_40 {
    private static final String DISTANCE_TRAVELLED_WITH_MIL_ON = "DISTANCE_TRAVELLED_WITH_MIL_ON   \n";
    private static final String FUEL_RAIL_PRESSURE = "FUEL_RAIL_PRESSURE   \n";
    private static final String FUEL_RAIL_PRESSURE_DIESEL_OR_GASOLINE_DIRECT_INJECTION = "FUEL_RAIL_PRESSURE_DIESEL_OR_GASOLINE_DIRECT_INJECTION   \n";
    private static final String OXYGEN_SENSOR_1_FUEL_AIR_RATIO_VOLTAGE = "OXYGEN_SENSOR_1_FUEL_AIR_RATIO_VOLTAGE   \n";
    private static final String OXYGEN_SENSOR_2_FUEL_AIR_RATIO_VOLTAGE = "OXYGEN_SENSOR_2_FUEL_AIR_RATIO_VOLTAGE   \n";
    private static final String OXYGEN_SENSOR_3_FUEL_AIR_RATIO_VOLTAGE = "OXYGEN_SENSOR_3_FUEL_AIR_RATIO_VOLTAGE   \n";
    private static final String OXYGEN_SENSOR_4_FUEL_AIR_RATIO_VOLTAGE = "OXYGEN_SENSOR_4_FUEL_AIR_RATIO_VOLTAGE   \n";
    private static final String OXYGEN_SENSOR_5_FUEL_AIR_RATIO_VOLTAGE = "OXYGEN_SENSOR_5_FUEL_AIR_RATIO_VOLTAGE   \n";
    private static final String OXYGEN_SENSOR_6_FUEL_AIR_RATIO_VOLTAGE = "OXYGEN_SENSOR_6_FUEL_AIR_RATIO_VOLTAGE   \n";
    private static final String OXYGEN_SENSOR_7_FUEL_AIR_RATIO_VOLTAGE = "OXYGEN_SENSOR_7_FUEL_AIR_RATIO_VOLTAGE   \n";
    private static final String OXYGEN_SENSOR_8_FUEL_AIR_RATIO_VOLTAGE = "OXYGEN_SENSOR_8_FUEL_AIR_RATIO_VOLTAGE   \n";
    private static final String COMMANDED_EGR = "COMMANDED_EGR   \n";
    private static final String EGR_ERROR = "EGR_ERROR   \n";
    private static final String COMMANDED_EVAPORATIVE_PURGE = "COMMANDED_EVAPORATIVE_PURGE   \n";
    private static final String FUEL_TANK_LEVEL_INPUT = "FUEL_TANK_LEVEL_INPUT   \n";
    private static final String NUMBER_OF_WARM_UPS_SINCE_CODES_CLEARED = "NUMBER_OF_WARM_UPS_SINCE_CODES_CLEARED   \n";
    private static final String DISTANCE_TRAVELED_SINCE_CODES_CLEARED = "DISTANCE_TRAVELED_SINCE_CODES_CLEARED   \n";
    private static final String EVAPORATIVE_SYSTEM_VAPOUR_PRESSURE_ = "EVAPORATIVE_SYSTEM_VAPOUR_PRESSURE_   \n";
    private static final String ABSOLUTE_BAROMETRIC_PRESSURE = "ABSOLUTE_BAROMETRIC_PRESSURE   \n";
    private static final String OXYGEN_SENSOR_1_FUEL_AIR_RATIO_CURRENT = "OXYGEN_SENSOR_1_FUEL_AIR_RATIO_CURRENT   \n";
    private static final String OXYGEN_SENSOR_2_FUEL_AIR_RATIO_CURRENT = "OXYGEN_SENSOR_2_FUEL_AIR_RATIO_CURRENT   \n";
    private static final String OXYGEN_SENSOR_3_FUEL_AIR_RATIO_CURRENT = "OXYGEN_SENSOR_3_FUEL_AIR_RATIO_CURRENT   \n";
    private static final String OXYGEN_SENSOR_4_FUEL_AIR_RATIO_CURRENT = "OXYGEN_SENSOR_4_FUEL_AIR_RATIO_CURRENT   \n";
    private static final String OXYGEN_SENSOR_5_FUEL_AIR_RATIO_CURRENT = "OXYGEN_SENSOR_5_FUEL_AIR_RATIO_CURRENT   \n";
    private static final String OXYGEN_SENSOR_6_FUEL_AIR_RATIO_CURRENT = "OXYGEN_SENSOR_6_FUEL_AIR_RATIO_CURRENT   \n";
    private static final String OXYGEN_SENSOR_7_FUEL_AIR_RATIO_CURRENT = "OXYGEN_SENSOR_7_FUEL_AIR_RATIO_CURRENT   \n";
    private static final String OXYGEN_SENSOR_8_FUEL_AIR_RATIO_CURRENT = "OXYGEN_SENSOR_8_FUEL_AIR_RATIO_CURRENT   \n";
    private static final String CATALYST_TEMPERATURE_BANK_1_SENSOR_1 = "CATALYST_TEMPERATURE_BANK_1_SENSOR_1   \n";
    private static final String CATALYST_TEMPERATURE_BANK_2_SENSOR_1 = "CATALYST_TEMPERATURE_BANK_2_SENSOR_1   \n";
    private static final String CATALYST_TEMPERATURE_BANK_1_SENSOR_2 = "CATALYST_TEMPERATURE_BANK_1_SENSOR_2   \n";
    private static final String CATALYST_TEMPERATURE_BANK_2_SENSOR_2 = "CATALYST_TEMPERATURE_BANK_2_SENSOR_2   \n";
    private static final String PIDs_SUPPORTED_41_60 = "PIDs_SUPPORTED_41_60   \n";
    private static Set<String> PIDsList = new HashSet<String>();

    public static String read(String firstHex, String secondHex, String thirdHex, String fourthHex){
        String firstByte = HexToByte(firstHex);
        String secondByte = HexToByte(secondHex);
        String thirdByte = HexToByte(thirdHex);
        String fourthByte = HexToByte(fourthHex);

        String byteLine = firstByte+secondByte+thirdByte+fourthByte;

        if (byteLine.substring(0,1).equals("1")){
            PIDsList.add(DISTANCE_TRAVELLED_WITH_MIL_ON);
        } if (byteLine.substring(1,2).equals("1")){
            PIDsList.add(FUEL_RAIL_PRESSURE);
        } if (byteLine.substring(2,3).equals("1")){
            PIDsList.add(FUEL_RAIL_PRESSURE_DIESEL_OR_GASOLINE_DIRECT_INJECTION);
        } if (byteLine.substring(3,4).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_1_FUEL_AIR_RATIO_VOLTAGE);
        } if (byteLine.substring(4,5).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_2_FUEL_AIR_RATIO_VOLTAGE);
        } if (byteLine.substring(5,6).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_3_FUEL_AIR_RATIO_VOLTAGE);
        } if (byteLine.substring(6,7).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_4_FUEL_AIR_RATIO_VOLTAGE);
        } if (byteLine.substring(7,8).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_5_FUEL_AIR_RATIO_VOLTAGE);
        } if (byteLine.substring(8,9).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_6_FUEL_AIR_RATIO_VOLTAGE);
        } if (byteLine.substring(9,10).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_7_FUEL_AIR_RATIO_VOLTAGE);
        } if (byteLine.substring(10,11).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_8_FUEL_AIR_RATIO_VOLTAGE);
        } if (byteLine.substring(11,12).equals("1")){
            PIDsList.add(COMMANDED_EGR);
        } if (byteLine.substring(12,13).equals("1")){
            PIDsList.add(EGR_ERROR);
        } if (byteLine.substring(13,14).equals("1")){
            PIDsList.add(COMMANDED_EVAPORATIVE_PURGE);
        } if (byteLine.substring(14,15).equals("1")){
            PIDsList.add(FUEL_TANK_LEVEL_INPUT);
        } if (byteLine.substring(15,16).equals("1")){
            PIDsList.add(NUMBER_OF_WARM_UPS_SINCE_CODES_CLEARED);
        } if (byteLine.substring(16,17).equals("1")){
            PIDsList.add(DISTANCE_TRAVELED_SINCE_CODES_CLEARED);
        } if (byteLine.substring(17,18).equals("1")){
            PIDsList.add(EVAPORATIVE_SYSTEM_VAPOUR_PRESSURE_);
        } if (byteLine.substring(18,19).equals("1")){
            PIDsList.add(ABSOLUTE_BAROMETRIC_PRESSURE);
        } if (byteLine.substring(19,20).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_1_FUEL_AIR_RATIO_CURRENT);
        } if (byteLine.substring(20,21).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_2_FUEL_AIR_RATIO_CURRENT);
        } if (byteLine.substring(21,22).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_3_FUEL_AIR_RATIO_CURRENT);
        } if (byteLine.substring(22,23).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_4_FUEL_AIR_RATIO_CURRENT);
        } if (byteLine.substring(23,24).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_5_FUEL_AIR_RATIO_CURRENT);
        } if (byteLine.substring(24,25).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_6_FUEL_AIR_RATIO_CURRENT);
        } if (byteLine.substring(25,26).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_7_FUEL_AIR_RATIO_CURRENT);
        } if (byteLine.substring(26,27).equals("1")){
            PIDsList.add(OXYGEN_SENSOR_8_FUEL_AIR_RATIO_CURRENT);
        } if (byteLine.substring(27,28).equals("1")){
            PIDsList.add(CATALYST_TEMPERATURE_BANK_1_SENSOR_1);
        } if (byteLine.substring(28,29).equals("1")){
            PIDsList.add(CATALYST_TEMPERATURE_BANK_2_SENSOR_1);
        } if (byteLine.substring(29,30).equals("1")){
            PIDsList.add(CATALYST_TEMPERATURE_BANK_1_SENSOR_2);
        } if (byteLine.substring(30,31).equals("1")){
            PIDsList.add(CATALYST_TEMPERATURE_BANK_2_SENSOR_2);
        } if (byteLine.substring(31,32).equals("1")){
            PIDsList.add(PIDs_SUPPORTED_41_60);
        }

        String response = "\n List of supported PIDs numbered 21-40: \n\n" + PIDsList.toString()
                .replaceAll("]", "")
                .replaceAll(",","");
        return response;
    }
    private static String HexToByte(String hex) {
        int decimalValue = Integer.parseInt(hex, 16);
        String byteString = Integer.toBinaryString(decimalValue);
        String byteStringWithZeros = String.format("%8s", byteString).replace(' ', '0');
        return byteStringWithZeros;
    }
}