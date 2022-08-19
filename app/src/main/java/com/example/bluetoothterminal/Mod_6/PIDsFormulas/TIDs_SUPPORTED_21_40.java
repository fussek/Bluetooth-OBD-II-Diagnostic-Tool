package com.example.bluetoothterminal.Mod_6.PIDsFormulas;

import java.util.HashSet;
import java.util.Set;

public class TIDs_SUPPORTED_21_40 {
    private static final String CATALYTIC_BANK_1 = "CATALYTIC_BANK_1   \n";
    private static Set<String> PIDsList = new HashSet<String>();

    public static String read(String firstHex, String secondHex, String thirdHex, String fourthHex) {
        String firstByte = HexToByte(firstHex);
        String secondByte = HexToByte(secondHex);
        String thirdByte = HexToByte(thirdHex);
        String fourthByte = HexToByte(fourthHex);

        String byteLine = firstByte+secondByte+thirdByte+fourthByte;

        if (byteLine.substring(0,1).equals("1")){
            PIDsList.add(CATALYTIC_BANK_1);
        }

        String response = "List of supported TIDs numbered 21-41: \n\n" + PIDsList.toString()
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
