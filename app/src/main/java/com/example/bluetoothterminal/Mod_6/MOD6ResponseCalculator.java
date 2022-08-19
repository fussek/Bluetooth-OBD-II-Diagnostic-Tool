package com.example.bluetoothterminal.Mod_6;

import com.example.bluetoothterminal.Mod_6.PIDsFormulas.CATALYTIC_BANK_1;
import com.example.bluetoothterminal.Mod_6.PIDsFormulas.EXHAUST_GAS_SENSOR_BANK_1__SENSOR_1;
import com.example.bluetoothterminal.Mod_6.PIDsFormulas.EXHAUST_GAS_SENSOR_BANK_1__SENSOR_2;
import com.example.bluetoothterminal.Mod_6.PIDsFormulas.TIDs_SUPPORTED_01_20;

import com.example.bluetoothterminal.Mod_6.PIDsFormulas.TIDs_SUPPORTED_21_40;
import com.example.bluetoothterminal.PIDsEnums.SixthModeRequestEnums;

class MOD6ResponseCalculator {

    private final static String MOD_SIX_PREFIX = "46";
    private static String firstHex = null;
    private static String secondHex = null;
    private static String thirdHex = null;
    private static String fourthHex = null;

    /**
     *                RESPONSE FORMAT
     *       ______   ______   _______  _______  _______  _______
     *      |      | |      | |       ||       ||       ||       |
     *      |  46  |-| PID  |-| 1 HEX || 2 HEX || 3 HEX || 4 HEX |
     *      |______| |______| |_______||_______||_______||_______|
     */


    static String MOD6ResponseCalculator(String response) {
        String responseMessage = null;
        String responseWithPIDOnly = removeModPrefixAndWhitespace(response);
        String PID = verifyPID(responseWithPIDOnly);
        getSeparateHexValues(responseWithPIDOnly);
        String calculationMethod = SixthModeRequestEnums.getEnum(PID);

        switch (calculationMethod) {
            case "TIDs_SUPPORTED_01_20":
                responseMessage = TIDs_SUPPORTED_01_20.read(firstHex, secondHex, thirdHex, fourthHex);
                break;
            case "EXHAUST_GAS_SENSOR_BANK_1__SENSOR_1":
                responseMessage = EXHAUST_GAS_SENSOR_BANK_1__SENSOR_1.read(firstHex);
                break;
            case "EXHAUST_GAS_SENSOR_BANK_1__SENSOR_2":
                responseMessage = EXHAUST_GAS_SENSOR_BANK_1__SENSOR_2.read(firstHex);
                break;
            case "CATALYTIC_BANK_1":
                responseMessage = CATALYTIC_BANK_1.read(firstHex);
                break;
            case "TIDs_SUPPORTED_21_40":
                responseMessage = TIDs_SUPPORTED_21_40.read(firstHex, secondHex, thirdHex, fourthHex);
                break;
            default: responseMessage = "Invalid request.";
                break;
        }
        return responseMessage;
    }

    private static void getSeparateHexValues(String responseWithPIDOnly) {
        String pureResponse = responseWithPIDOnly.substring(2);
        if (pureResponse.length() == 2) {
            firstHex = pureResponse.substring(0, 2);
        } else if (pureResponse.length() == 4) {
            firstHex = pureResponse.substring(0, 2);
            secondHex = pureResponse.substring(2, 4);
        } else if (pureResponse.length() == 6) {
            firstHex = pureResponse.substring(0, 2);
            secondHex = pureResponse.substring(2, 4);
            thirdHex = pureResponse.substring(4, 6);
        } else if (pureResponse.length() == 8) {
            firstHex = pureResponse.substring(0, 2);
            secondHex = pureResponse.substring(2, 4);
            thirdHex = pureResponse.substring(4, 6);
            fourthHex = pureResponse.substring(6, 8);
        }
    }

    private static String verifyPID(String responseWithPIDOnly) {
        return responseWithPIDOnly.substring(0, 2);
    }

    private static String removeModPrefixAndWhitespace(String response) {
        String result = null;
        String clearResponse = response.replaceAll(" ", "")
                .replaceAll("\r", "")
                .replaceAll("\n", "")
                .replaceAll(">", "");
        if (response.startsWith(MOD_SIX_PREFIX)) {
            result = clearResponse.substring(2);
        } else result = clearResponse;
        return result;
    }
}
