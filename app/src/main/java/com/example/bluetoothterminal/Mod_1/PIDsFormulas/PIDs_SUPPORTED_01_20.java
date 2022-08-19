package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

import java.util.HashSet;
import java.util.Set;

public class PIDs_SUPPORTED_01_20 {

    private static final String MONITOR_STATUS_SINCE_DTCs_CLEARED = "MONITOR_STATUS_SINCE_DTCs_CLEARED   \n";
    private static final String FREEZE_DTC = "FREEZE_DTC   \n";
    private static final String FUEL_SYSTEM_STATUS = "FUEL_SYSTEM_STATUS   \n";
    private static final String CALCULATED_ENGINE_LOAD = "CALCULATED_ENGINE_LOAD   \n";
    private static final String ENGINE_COOLANT_TEMPERATURE = "ENGINE_COOLANT_TEMPERATURE   \n";
    private static final String SHORT_TERM_FUEL_TRIM_BANK_1 = "SHORT_TERM_FUEL_TRIM_BANK_1   \n";
    private static final String LONG_TERM_FUEL_TRIM_BANK_1 = "LONG_TERM_FUEL_TRIM_BANK_1   \n";
    private static final String SHORT_TERM_FUEL_TRIM_BANK_2 = "SHORT_TERM_FUEL_TRIM_BANK_2   \n";
    private static final String LONG_TERM_FUEL_TRIM_BANK_2 = "LONG_TERM_FUEL_TRIM_BANK_2   \n";
    private static final String FUEL_PRESSURE = "FUEL_PRESSURE   \n";
    private static final String INTAKE_MANIFOLD_ABSOLUTE_PRESSURE = "INTAKE_MANIFOLD_ABSOLUTE_PRESSURE   \n";
    private static final String ENGINE_RPM = "ENGINE_RPM   \n";
    private static final String VEHICLE_SPEED = "VEHICLE_SPEED   \n";
    private static final String TIMING_ADVANCE = "TIMING_ADVANCE   \n";
    private static final String INTAKE_AIR_TEMPERATURE = "INTAKE_AIR_TEMPERATURE   \n";
    private static final String MAF_AIR_FLOW_RATE = "MAF_AIR_FLOW_RATE   \n";
    private static final String THROTTLE_POSITION = "THROTTLE_POSITION   \n";
    private static final String COMMANDED_SECONDARY_AIR_STATUS = "COMMANDED_SECONDARY_AIR_STATUS   \n";
    private static final String OXYGEN_SENSORS_PRESENT_BANKS_1_2 = "OXYGEN_SENSORS_PRESENT_BANKS_1_2   \n";
    private static final String OXYGEN_SENSOR_1_SHORT_TERM_FUEL_TRIM = "OXYGEN_SENSOR_1_SHORT_TERM_FUEL_TRIM   \n";
    private static final String OXYGEN_SENSOR_2_SHORT_TERM_FUEL_TRIM = "OXYGEN_SENSOR_2_SHORT_TERM_FUEL_TRIM   \n";
    private static final String OXYGEN_SENSOR_3_SHORT_TERM_FUEL_TRIM = "OXYGEN_SENSOR_3_SHORT_TERM_FUEL_TRIM   \n";
    private static final String OXYGEN_SENSOR_4_SHORT_TERM_FUEL_TRIM = "OXYGEN_SENSOR_4_SHORT_TERM_FUEL_TRIM   \n";
    private static final String OXYGEN_SENSOR_5_SHORT_TERM_FUEL_TRIM = "OXYGEN_SENSOR_5_SHORT_TERM_FUEL_TRIM   \n";
    private static final String OXYGEN_SENSOR_6_SHORT_TERM_FUEL_TRIM = "OXYGEN_SENSOR_6_SHORT_TERM_FUEL_TRIM   \n";
    private static final String OXYGEN_SENSOR_7_SHORT_TERM_FUEL_TRIM = "OXYGEN_SENSOR_7_SHORT_TERM_FUEL_TRIM   \n";
    private static final String OXYGEN_SENSOR_8_SHORT_TERM_FUEL_TRIM = "OXYGEN_SENSOR_8_SHORT_TERM_FUEL_TRIM   \n";
    private static final String OBD_STANDARDS_THIS_VEHICLE_CONFORMS_TO = "OBD_STANDARDS_THIS_VEHICLE_CONFORMS_TO   \n";
    private static final String OXYGEN_SENSORS_PRESENT_BANKS_1_4 = "OXYGEN_SENSORS_PRESENT_BANKS_1_4   \n";
    private static final String AUXILIARY_INPUT_STATUS = "AUXILIARY_INPUT_STATUS   \n";
    private static final String RUNTIME_SINCE_ENGINE_START = "RUNTIME_SINCE_ENGINE_START   \n";
    private static final String PIDs_SUPPORTED_21_40 = "PIDs_SUPPORTED_21_40   \n";
    private static Set<String> PIDsList = new HashSet<String>();

    public static String read(String firstHex, String secondHex, String thirdHex, String fourthHex) {
        String firstByte = HexToByte(firstHex);
        String secondByte = HexToByte(secondHex);
        String thirdByte = HexToByte(thirdHex);
        String fourthByte = HexToByte(fourthHex);

        String byteLine = firstByte+secondByte+thirdByte+fourthByte;

            if (byteLine.substring(0,1).equals("1")){
                PIDsList.add(MONITOR_STATUS_SINCE_DTCs_CLEARED);
            } if (byteLine.substring(1,2).equals("1")){
                PIDsList.add(FREEZE_DTC);
            } if (byteLine.substring(2,3).equals("1")){
                PIDsList.add(FUEL_SYSTEM_STATUS);
            } if (byteLine.substring(3,4).equals("1")){
                PIDsList.add(CALCULATED_ENGINE_LOAD);
            } if (byteLine.substring(4,5).equals("1")){
                PIDsList.add(ENGINE_COOLANT_TEMPERATURE);
            } if (byteLine.substring(5,6).equals("1")){
                PIDsList.add(SHORT_TERM_FUEL_TRIM_BANK_1);
            } if (byteLine.substring(6,7).equals("1")){
                PIDsList.add(LONG_TERM_FUEL_TRIM_BANK_1);
            } if (byteLine.substring(7,8).equals("1")){
                PIDsList.add(SHORT_TERM_FUEL_TRIM_BANK_2);
            } if (byteLine.substring(8,9).equals("1")){
                PIDsList.add(LONG_TERM_FUEL_TRIM_BANK_2);
            } if (byteLine.substring(9,10).equals("1")){
                PIDsList.add(FUEL_PRESSURE);
            } if (byteLine.substring(10,11).equals("1")){
                PIDsList.add(INTAKE_MANIFOLD_ABSOLUTE_PRESSURE);
            } if (byteLine.substring(11,12).equals("1")){
                PIDsList.add(ENGINE_RPM);
            } if (byteLine.substring(12,13).equals("1")){
                PIDsList.add(VEHICLE_SPEED);
            } if (byteLine.substring(13,14).equals("1")){
                PIDsList.add(TIMING_ADVANCE);
            } if (byteLine.substring(14,15).equals("1")){
                PIDsList.add(INTAKE_AIR_TEMPERATURE);
            } if (byteLine.substring(15,16).equals("1")){
                PIDsList.add(MAF_AIR_FLOW_RATE);
            } if (byteLine.substring(16,17).equals("1")){
                PIDsList.add(THROTTLE_POSITION);
            } if (byteLine.substring(17,18).equals("1")){
                PIDsList.add(COMMANDED_SECONDARY_AIR_STATUS);
            } if (byteLine.substring(18,19).equals("1")){
                PIDsList.add(OXYGEN_SENSORS_PRESENT_BANKS_1_2);
            } if (byteLine.substring(19,20).equals("1")){
                PIDsList.add(OXYGEN_SENSOR_1_SHORT_TERM_FUEL_TRIM);
            } if (byteLine.substring(20,21).equals("1")){
                PIDsList.add(OXYGEN_SENSOR_2_SHORT_TERM_FUEL_TRIM);
            } if (byteLine.substring(21,22).equals("1")){
                PIDsList.add(OXYGEN_SENSOR_3_SHORT_TERM_FUEL_TRIM);
            } if (byteLine.substring(22,23).equals("1")){
                PIDsList.add(OXYGEN_SENSOR_4_SHORT_TERM_FUEL_TRIM);
            } if (byteLine.substring(23,24).equals("1")){
                PIDsList.add(OXYGEN_SENSOR_5_SHORT_TERM_FUEL_TRIM);
            } if (byteLine.substring(24,25).equals("1")){
                PIDsList.add(OXYGEN_SENSOR_6_SHORT_TERM_FUEL_TRIM);
            } if (byteLine.substring(25,26).equals("1")){
                PIDsList.add(OXYGEN_SENSOR_7_SHORT_TERM_FUEL_TRIM);
            } if (byteLine.substring(26,27).equals("1")){
                PIDsList.add(OXYGEN_SENSOR_8_SHORT_TERM_FUEL_TRIM);
            } if (byteLine.substring(27,28).equals("1")){
                PIDsList.add(OBD_STANDARDS_THIS_VEHICLE_CONFORMS_TO);
            } if (byteLine.substring(28,29).equals("1")){
                PIDsList.add(OXYGEN_SENSORS_PRESENT_BANKS_1_4);
            } if (byteLine.substring(29,30).equals("1")){
                PIDsList.add(AUXILIARY_INPUT_STATUS);
            } if (byteLine.substring(30,31).equals("1")){
                PIDsList.add(RUNTIME_SINCE_ENGINE_START);
            } if (byteLine.substring(31,32).equals("1")){
                PIDsList.add(PIDs_SUPPORTED_21_40);
            }

            String response = "\n List of supported PIDs numbered 01-20: \n\n" + PIDsList.toString()
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
