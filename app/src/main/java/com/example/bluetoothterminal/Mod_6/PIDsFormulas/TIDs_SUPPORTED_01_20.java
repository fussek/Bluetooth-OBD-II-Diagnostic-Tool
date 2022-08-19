package com.example.bluetoothterminal.Mod_6.PIDsFormulas;

import java.util.HashSet;
import java.util.Set;

public class TIDs_SUPPORTED_01_20 {

    private static final String EXHAUST_GAS_SENSOR_BANK_1__SENSOR_1 = "EXHAUST_GAS_SENSOR_BANK_1__SENSOR_1   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_1__SENSOR_2 = "EXHAUST_GAS_SENSOR_BANK_1__SENSOR_2   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_1__SENSOR_3 = "EXHAUST_GAS_SENSOR_BANK_1__SENSOR_3   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_1__SENSOR_4 = "EXHAUST_GAS_SENSOR_BANK_1__SENSOR_4   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_2__SENSOR_1 = "EXHAUST_GAS_SENSOR_BANK_2__SENSOR_1   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_2__SENSOR_2 = "EXHAUST_GAS_SENSOR_BANK_2__SENSOR_2   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_2__SENSOR_3 = "EXHAUST_GAS_SENSOR_BANK_2__SENSOR_3   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_2__SENSOR_4 = "EXHAUST_GAS_SENSOR_BANK_2__SENSOR_4   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_3__SENSOR_1 = "EXHAUST_GAS_SENSOR_BANK_3__SENSOR_1   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_3__SENSOR_2 = "EXHAUST_GAS_SENSOR_BANK_3__SENSOR_2   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_3__SENSOR_3 = "EXHAUST_GAS_SENSOR_BANK_3__SENSOR_3   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_3__SENSOR_4 = "EXHAUST_GAS_SENSOR_BANK_3__SENSOR_4   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_4__SENSOR_1 = "EXHAUST_GAS_SENSOR_BANK_4__SENSOR_1   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_4__SENSOR_2 = "EXHAUST_GAS_SENSOR_BANK_4__SENSOR_2   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_4__SENSOR_3 = "EXHAUST_GAS_SENSOR_BANK_4__SENSOR_3   \n";
    private static final String EXHAUST_GAS_SENSOR_BANK_4__SENSOR_4 = "EXHAUST_GAS_SENSOR_BANK_4__SENSOR_4   \n";
    private static final String TIDs_SUPPORTED_21_40 = "TIDs_SUPPORTED_21_40   \n";
    private static Set<String> PIDsList = new HashSet<String>();

    public static String read(String firstHex, String secondHex, String thirdHex, String fourthHex) {
        String firstByte = HexToByte(firstHex);
        String secondByte = HexToByte(secondHex);
        String thirdByte = HexToByte(thirdHex);
        String fourthByte = HexToByte(fourthHex);

        String byteLine = firstByte+secondByte+thirdByte+fourthByte;

            if (byteLine.substring(0,1).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_1__SENSOR_1);
            } if (byteLine.substring(1,2).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_1__SENSOR_2);
            } if (byteLine.substring(2,3).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_1__SENSOR_3);
            } if (byteLine.substring(3,4).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_1__SENSOR_4);
            } if (byteLine.substring(4,5).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_2__SENSOR_1);
            } if (byteLine.substring(5,6).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_2__SENSOR_2);
            } if (byteLine.substring(6,7).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_2__SENSOR_3);
            } if (byteLine.substring(7,8).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_2__SENSOR_4);
            } if (byteLine.substring(8,9).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_3__SENSOR_1);
            } if (byteLine.substring(9,10).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_3__SENSOR_2);
            } if (byteLine.substring(10,11).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_3__SENSOR_3);
            } if (byteLine.substring(11,12).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_3__SENSOR_4);
            } if (byteLine.substring(12,13).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_4__SENSOR_1);
            } if (byteLine.substring(13,14).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_4__SENSOR_2);
            } if (byteLine.substring(14,15).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_4__SENSOR_3);
            } if (byteLine.substring(15,16).equals("1")){
                PIDsList.add(EXHAUST_GAS_SENSOR_BANK_4__SENSOR_4);
            } if (byteLine.substring(31,32).equals("1")){
                PIDsList.add(TIDs_SUPPORTED_21_40);
            }

            String response = "List of supported TIDs numbered 01-20: \n\n" + PIDsList.toString()
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
