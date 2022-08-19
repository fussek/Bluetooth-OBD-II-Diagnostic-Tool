package com.example.bluetoothterminal.Mod_5.PIDsFormulas;

import java.util.HashSet;
import java.util.Set;

public class OBD_MONITOR_IDs_SUPPORTED_01_20 {

    private static final String RICH_TO_LEAN_SENSOR_THRESHOLD_VOLTAGE = "RICH_TO_LEAN_SENSOR_THRESHOLD_VOLTAGE   \n";
    private static final String LEAN_TO_RICH_SENSOR_THRESHOLD_VOLTAGE = "LEAN_TO_RICH_SENSOR_THRESHOLD_VOLTAGE   \n";
    private static final String LOW_VOLTAGE_USED_TO_CALCULATED_PASSAGE_TIME = "LOW_VOLTAGE_USED_TO_CALCULATED_PASSAGE_TIME   \n";
    private static final String HIGH_VOLTAGE_USED_TO_CALCULATED_PASSAGE_TIME = "HIGH_VOLTAGE_USED_TO_CALCULATED_PASSAGE_TIME   \n";
    private static final String RICH_TO_LEAN_CALCULATED_PASSAGE_TIME = "RICH_TO_LEAN_CALCULATED_PASSAGE_TIME   \n";
    private static final String LEAN_TO_RICH_CALCULATED_PASSAGE_TIME = "LEAN_TO_RICH_CALCULATED_PASSAGE_TIME   \n";
    private static final String MINIMUM_SENSOR_VOLTAGE_DURING_TEST_CYCLE = "MINIMUM_SENSOR_VOLTAGE_DURING_TEST_CYCLE   \n";
    private static final String MAXIMUM_SENSOR_VOLTAGE_DURING_TEST_CYCLE = "MAXIMUM_SENSOR_VOLTAGE_DURING_TEST_CYCLE   \n";
    private static final String TIME_BETWEEN_SENSOR_TRANSITIONS = "TIME_BETWEEN_SENSOR_TRANSITIONS   \n";
    private static final String SENSOR_PERIOD = "SENSOR_PERIOD   \n";
    private static final String RESERVED_FOR_FUTURE_USE = "RESERVED_FOR_FUTURE_USE   \n";
    private static Set<String> PIDsList = new HashSet<String>();

    public static String read(String firstHex, String secondHex, String thirdHex, String fourthHex) {
        String firstByte = HexToByte(firstHex);
        String secondByte = HexToByte(secondHex);
        String thirdByte = HexToByte(thirdHex);
        String fourthByte = HexToByte(fourthHex);

        String byteLine = firstByte + secondByte + thirdByte + fourthByte;

        if (byteLine.substring(0, 1).equals("1")) {
            PIDsList.add(RICH_TO_LEAN_SENSOR_THRESHOLD_VOLTAGE);
        }
        if (byteLine.substring(1, 2).equals("1")) {
            PIDsList.add(LEAN_TO_RICH_SENSOR_THRESHOLD_VOLTAGE);
        }
        if (byteLine.substring(2, 3).equals("1")) {
            PIDsList.add(LOW_VOLTAGE_USED_TO_CALCULATED_PASSAGE_TIME);
        }
        if (byteLine.substring(3, 4).equals("1")) {
            PIDsList.add(HIGH_VOLTAGE_USED_TO_CALCULATED_PASSAGE_TIME);
        }
        if (byteLine.substring(4, 5).equals("1")) {
            PIDsList.add(RICH_TO_LEAN_CALCULATED_PASSAGE_TIME);
        }
        if (byteLine.substring(5, 6).equals("1")) {
            PIDsList.add(LEAN_TO_RICH_CALCULATED_PASSAGE_TIME);
        }
        if (byteLine.substring(6, 7).equals("1")) {
            PIDsList.add(MINIMUM_SENSOR_VOLTAGE_DURING_TEST_CYCLE);
        }
        if (byteLine.substring(7, 8).equals("1")) {
            PIDsList.add(MAXIMUM_SENSOR_VOLTAGE_DURING_TEST_CYCLE);
        }
        if (byteLine.substring(8, 9).equals("1")) {
            PIDsList.add(TIME_BETWEEN_SENSOR_TRANSITIONS);
        }
        if (byteLine.substring(9, 10).equals("1")) {
            PIDsList.add(SENSOR_PERIOD);
        }
        if (byteLine.substring(10, 11).equals("1")) {
            PIDsList.add(RESERVED_FOR_FUTURE_USE);
        }

        String response = "List of supported OBD monitor PIDs numbered 01-20: \n\n" + PIDsList.toString()
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