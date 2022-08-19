package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

import java.util.HashSet;
import java.util.Set;

public class PIDs_SUPPORTED_41_60 {
    private static final String MONITOR_STATUS_THIS_DRIVE_CYCLE = "MONITOR_STATUS_THIS_DRIVE_CYCLE        \n";
    private static final String CONTROL_MODULE_VOLTAGE = "CONTROL_MODULE_VOLTAGE        \n";
    private static final String ABSOLUTE_LOAD_VALUE = "ABSOLUTE_LOAD_VALUE        \n";
    private static final String COMMAND_EQUIVALENCE_RATIO = "COMMAND_EQUIVALENCE_RATIO        \n";
    private static final String RELATIVE_THROTTLE_POSITION = "RELATIVE_THROTTLE_POSITION        \n";
    private static final String AMBIENT_AIR_TEMPERATURE = "AMBIENT_AIR_TEMPERATURE        \n";
    private static final String ABSOLUTE_THROTTLE_POSITION_B = "ABSOLUTE_THROTTLE_POSITION_B        \n";
    private static final String ABSOLUTE_THROTTLE_POSITION_C = "ABSOLUTE_THROTTLE_POSITION_C        \n";
    private static final String ABSOLUTE_THROTTLE_POSITION_D = "ABSOLUTE_THROTTLE_POSITION_D        \n";
    private static final String ABSOLUTE_THROTTLE_POSITION_E = "ABSOLUTE_THROTTLE_POSITION_E        \n";
    private static final String ABSOLUTE_THROTTLE_POSITION_F = "ABSOLUTE_THROTTLE_POSITION_F        \n";
    private static final String COMMANDED_THROTTLE_ACTUATOR = "COMMANDED_THROTTLE_ACTUATOR        \n";
    private static final String TIME_RUN_WITH_MIL_ON = "TIME_RUN_WITH_MIL_ON        \n";
    private static final String TIME_SINCE_TROUBLE_CODES_CLEARED = "TIME_SINCE_TROUBLE_CODES_CLEARED        \n";
    private static final String MAXIMUM_VALUE_FOR_EQUIVALENCE_RATIO_OXYGEN_SENSOR_VOLTAGE_OXYGEN_SENSOR_CURRENT_AND_INTAKE_MANIFOLD_ABSOLUTE_PRESSURE = "MAXIMUM_VALUE_FOR_EQUIVALENCE_RATIO_OXYGEN_SENSOR_VOLTAGE_OXYGEN_SENSOR_CURRENT_AND_INTAKE_MANIFOLD_ABSOLUTE_PRESSURE        \n";
    private static final String MAXIMUM_VALUE_FOR_AIR_FLOW_RATE_FROM_MASS_AIR_FLOW_SENSOR = "MAXIMUM_VALUE_FOR_AIR_FLOW_RATE_FROM_MASS_AIR_FLOW_SENSOR        \n";
    private static final String FUEL_TYPE = "FUEL_TYPE        \n";
    private static final String ETHANOL_FUEL_PERCENTAGE = "ETHANOL_FUEL_PERCENTAGE        \n";
    private static final String ABSOLUTE_EVAPORATIVE_SYSTEM_VAPOUR_PRESSURE = "ABSOLUTE_EVAPORATIVE_SYSTEM_VAPOUR_PRESSURE        \n";
    private static final String EVAPORATIVE_SYSTEM_VAPOUR_PRESSURE_2 = "EVAPORATIVE_SYSTEM_VAPOUR_PRESSURE_2        \n";
    private static final String SHORT_TERM_SECONDARY_OXYGEN_SENSOR_FUEL_TRIM_BANK1_AND_BANK_3 = "SHORT_TERM_SECONDARY_OXYGEN_SENSOR_FUEL_TRIM_BANK1_AND_BANK_3        \n";
    private static final String LONG_TERM_SECONDARY_OXYGEN_SENSOR_FUEL_TRIM_BANK1_AND_BANK_3 = "LONG_TERM_SECONDARY_OXYGEN_SENSOR_FUEL_TRIM_BANK1_AND_BANK_3        \n";
    private static final String SHORT_TERM_SECONDARY_OXYGEN_SENSOR_FUEL_TRIM_BANK2_AND_BANK_4 = "SHORT_TERM_SECONDARY_OXYGEN_SENSOR_FUEL_TRIM_BANK2_AND_BANK_4        \n";
    private static final String LONG_TERM_SECONDARY_OXYGEN_SENSOR_FUEL_TRIM_BANK2_AND_BANK_4 = "LONG_TERM_SECONDARY_OXYGEN_SENSOR_FUEL_TRIM_BANK2_AND_BANK_4        \n";
    private static final String FUEL_RAIL_PRESSURE_ABSOULTE = "FUEL_RAIL_PRESSURE_ABSOULTE        \n";
    private static final String RELATIVE_ACCELERATOR_PEDAL_POSITION = "RELATIVE_ACCELERATOR_PEDAL_POSITION        \n";
    private static final String HYBRID_BATTERY_PACK_REMAINING_LIFE = "HYBRID_BATTERY_PACK_REMAINING_LIFE        \n";
    private static final String ENGINE_OIL_TEMPERATURE = "ENGINE_OIL_TEMPERATURE        \n";
    private static final String FUEL_INJECTION_TIMING = "FUEL_INJECTION_TIMING        \n";
    private static final String ENGINE_FUEL_RATE = "ENGINE_FUEL_RATE        \n";
    private static final String EMISSION_REQUIREMENTS_TO_WHICH_VEHICLE_IS_DESIGNED = "EMISSION_REQUIREMENTS_TO_WHICH_VEHICLE_IS_DESIGNED        \n";
    private static final String PIDs_SUPPORTED_61_80 = "PIDs_SUPPORTED_61_80   \n";
    private static Set<String> PIDsList = new HashSet<String>();

    public static String read(String firstHex, String secondHex, String thirdHex, String fourthHex){
        String firstByte = HexToByte(firstHex);
        String secondByte = HexToByte(secondHex);
        String thirdByte = HexToByte(thirdHex);
        String fourthByte = HexToByte(fourthHex);

        String byteLine = firstByte+secondByte+thirdByte+fourthByte;

        if (byteLine.substring(0,1).equals("1")){
            PIDsList.add(MONITOR_STATUS_THIS_DRIVE_CYCLE);
        } if (byteLine.substring(1,2).equals("1")){
            PIDsList.add(CONTROL_MODULE_VOLTAGE);
        } if (byteLine.substring(2,3).equals("1")){
            PIDsList.add(ABSOLUTE_LOAD_VALUE);
        } if (byteLine.substring(3,4).equals("1")){
            PIDsList.add(COMMAND_EQUIVALENCE_RATIO);
        } if (byteLine.substring(4,5).equals("1")){
            PIDsList.add(RELATIVE_THROTTLE_POSITION);
        } if (byteLine.substring(5,6).equals("1")){
            PIDsList.add(AMBIENT_AIR_TEMPERATURE);
        } if (byteLine.substring(6,7).equals("1")){
            PIDsList.add(ABSOLUTE_THROTTLE_POSITION_B);
        } if (byteLine.substring(7,8).equals("1")){
            PIDsList.add(ABSOLUTE_THROTTLE_POSITION_C);
        } if (byteLine.substring(8,9).equals("1")){
            PIDsList.add(ABSOLUTE_THROTTLE_POSITION_D);
        } if (byteLine.substring(9,10).equals("1")){
            PIDsList.add(ABSOLUTE_THROTTLE_POSITION_E);
        } if (byteLine.substring(10,11).equals("1")){
            PIDsList.add(ABSOLUTE_THROTTLE_POSITION_F);
        } if (byteLine.substring(11,12).equals("1")){
            PIDsList.add(COMMANDED_THROTTLE_ACTUATOR);
        } if (byteLine.substring(12,13).equals("1")){
            PIDsList.add(TIME_RUN_WITH_MIL_ON);
        } if (byteLine.substring(13,14).equals("1")){
            PIDsList.add(TIME_SINCE_TROUBLE_CODES_CLEARED);
        } if (byteLine.substring(14,15).equals("1")){
            PIDsList.add(MAXIMUM_VALUE_FOR_EQUIVALENCE_RATIO_OXYGEN_SENSOR_VOLTAGE_OXYGEN_SENSOR_CURRENT_AND_INTAKE_MANIFOLD_ABSOLUTE_PRESSURE);
        } if (byteLine.substring(15,16).equals("1")){
            PIDsList.add(MAXIMUM_VALUE_FOR_AIR_FLOW_RATE_FROM_MASS_AIR_FLOW_SENSOR);
        } if (byteLine.substring(16,17).equals("1")){
            PIDsList.add(FUEL_TYPE);
        } if (byteLine.substring(17,18).equals("1")){
            PIDsList.add(ETHANOL_FUEL_PERCENTAGE);
        } if (byteLine.substring(18,19).equals("1")){
            PIDsList.add(ABSOLUTE_EVAPORATIVE_SYSTEM_VAPOUR_PRESSURE);
        } if (byteLine.substring(19,20).equals("1")){
            PIDsList.add(EVAPORATIVE_SYSTEM_VAPOUR_PRESSURE_2);
        } if (byteLine.substring(20,21).equals("1")){
            PIDsList.add(SHORT_TERM_SECONDARY_OXYGEN_SENSOR_FUEL_TRIM_BANK1_AND_BANK_3);
        } if (byteLine.substring(21,22).equals("1")){
            PIDsList.add(LONG_TERM_SECONDARY_OXYGEN_SENSOR_FUEL_TRIM_BANK1_AND_BANK_3);
        } if (byteLine.substring(22,23).equals("1")){
            PIDsList.add(SHORT_TERM_SECONDARY_OXYGEN_SENSOR_FUEL_TRIM_BANK2_AND_BANK_4);
        } if (byteLine.substring(23,24).equals("1")){
            PIDsList.add(LONG_TERM_SECONDARY_OXYGEN_SENSOR_FUEL_TRIM_BANK2_AND_BANK_4);
        } if (byteLine.substring(24,25).equals("1")){
            PIDsList.add(FUEL_RAIL_PRESSURE_ABSOULTE);
        } if (byteLine.substring(25,26).equals("1")){
            PIDsList.add(RELATIVE_ACCELERATOR_PEDAL_POSITION);
        } if (byteLine.substring(26,27).equals("1")){
            PIDsList.add(HYBRID_BATTERY_PACK_REMAINING_LIFE);
        } if (byteLine.substring(27,28).equals("1")){
            PIDsList.add(ENGINE_OIL_TEMPERATURE);
        } if (byteLine.substring(28,29).equals("1")){
            PIDsList.add(FUEL_INJECTION_TIMING);
        } if (byteLine.substring(29,30).equals("1")){
            PIDsList.add(ENGINE_FUEL_RATE);
        } if (byteLine.substring(30,31).equals("1")){
            PIDsList.add(EMISSION_REQUIREMENTS_TO_WHICH_VEHICLE_IS_DESIGNED);
        } if (byteLine.substring(31,32).equals("1")){
            PIDsList.add(PIDs_SUPPORTED_61_80);
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