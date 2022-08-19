package com.example.bluetoothterminal.Mod_9.PIDsFormulas;

import java.util.HashSet;
import java.util.Set;

public class PIDs_SUPPORTED_01_20 {

    private static final String VIN_MESSAGE_COUNT = "VIN_MESSAGE_COUNT   \n";
    private static final String VIN = "VIN   \n";
    private static final String CID_MESSAGE_COUNT = "CID_MESSAGE_COUNT   \n";
    private static final String CID = "CID   \n";
    private static final String CVN_MESSAGE_COUNT = "CVN_MESSAGE_COUNT   \n";
    private static final String CVN = "CVN   \n";
    private static final String IN_USE_PERFORMANCE_TRACKING_MESSAGE_COUNT = "IN_USE_PERFORMANCE_TRACKING_MESSAGE_COUNT   \n";
    private static final String IN_USE_PERFORMANCE_TRACKING_GASOLINE = "IN_USE_PERFORMANCE_TRACKING_GASOLINE   \n";
    private static final String ECU_NAME_MESSAGE_COUNT = "ECU_NAME_MESSAGE_COUNT   \n";
    private static final String ECU_NAME = "ECU_NAME   \n";
    private static final String IN_USE_PERFORMANCE_TRACKING_DIESEL = "IN_USE_PERFORMANCE_TRACKING_DIESEL   \n";
    private static Set<String> PIDsList = new HashSet<String>();

    public static String read(String firstHex, String secondHex, String thirdHex, String fourthHex) {
        String firstByte = HexToByte(firstHex);
        String secondByte = HexToByte(secondHex);
        String thirdByte = HexToByte(thirdHex);
        String fourthByte = HexToByte(fourthHex);

        String byteLine = firstByte+secondByte+thirdByte+fourthByte;

            if (byteLine.substring(0,1).equals("1")){
                PIDsList.add(VIN_MESSAGE_COUNT);
            } if (byteLine.substring(1,2).equals("1")){
                PIDsList.add(VIN);
            } if (byteLine.substring(2,3).equals("1")){
                PIDsList.add(CID_MESSAGE_COUNT);
            } if (byteLine.substring(3,4).equals("1")){
                PIDsList.add(CID);
            } if (byteLine.substring(4,5).equals("1")){
                PIDsList.add(CVN_MESSAGE_COUNT);
            } if (byteLine.substring(5,6).equals("1")){
                PIDsList.add(CVN);
            } if (byteLine.substring(6,7).equals("1")){
                PIDsList.add(IN_USE_PERFORMANCE_TRACKING_MESSAGE_COUNT);
            } if (byteLine.substring(7,8).equals("1")){
                PIDsList.add(IN_USE_PERFORMANCE_TRACKING_GASOLINE);
            } if (byteLine.substring(8,9).equals("1")){
                PIDsList.add(ECU_NAME_MESSAGE_COUNT);
            } if (byteLine.substring(9,10).equals("1")){
                PIDsList.add(ECU_NAME);
            } if (byteLine.substring(10,11).equals("1")){
                PIDsList.add(IN_USE_PERFORMANCE_TRACKING_DIESEL);
            }

            String response = "List of supported PIDs numbered 01-20: \n\n" + PIDsList.toString()
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
