package com.example.bluetoothterminal.Mod_5;


import com.example.bluetoothterminal.Mod_5.PIDsFormulas.HIGH_VOLTAGE_USED_TO_CALCULATED_PASSAGE_TIME;
import com.example.bluetoothterminal.Mod_5.PIDsFormulas.LEAN_TO_RICH_CALCULATED_PASSAGE_TIME;
import com.example.bluetoothterminal.Mod_5.PIDsFormulas.LEAN_TO_RICH_SENSOR_THRESHOLD_VOLTAGE;
import com.example.bluetoothterminal.Mod_5.PIDsFormulas.LOW_VOLTAGE_USED_TO_CALCULATED_PASSAGE_TIME;
import com.example.bluetoothterminal.Mod_5.PIDsFormulas.MAXIMUM_SENSOR_VOLTAGE_DURING_TEST_CYCLE;
import com.example.bluetoothterminal.Mod_5.PIDsFormulas.MINIMUM_SENSOR_VOLTAGE_DURING_TEST_CYCLE;
import com.example.bluetoothterminal.Mod_5.PIDsFormulas.OBD_MONITOR_IDs_SUPPORTED_01_20;
import com.example.bluetoothterminal.Mod_5.PIDsFormulas.RICH_TO_LEAN_CALCULATED_PASSAGE_TIME;
import com.example.bluetoothterminal.Mod_5.PIDsFormulas.RICH_TO_LEAN_SENSOR_THRESHOLD_VOLTAGE;
import com.example.bluetoothterminal.Mod_5.PIDsFormulas.SENSOR_PERIOD;
import com.example.bluetoothterminal.Mod_5.PIDsFormulas.TIME_BETWEEN_SENSOR_TRANSITIONS;
import com.example.bluetoothterminal.PIDsEnums.FifthModeRequestEnums;

class MOD5ResponseCalculator {

    private final static String MOD_FIVE_PREFIX = "45";
    private static String firstHex = null;
    private static String secondHex = null;
    private static String thirdHex = null;
    private static String fourthHex = null;
    private static String fifthHex = null;

    /**
     *                RESPONSE FORMAT
     *       ______   ______   _______  _______  _______  _______
     *      |      | |      | |       ||       ||       ||       |
     *      |  45  |-| PID  |-| 1 HEX || 2 HEX || 3 HEX || 4 HEX |
     *      |______| |______| |_______||_______||_______||_______|
     */


    static String MOD5ResponseCalculator(String response) {
        String responseMessage = null;
        String responseWithPIDOnly = removeModPrefixAndWhitespace(response);
        String PID = verifyPID(responseWithPIDOnly);
        getSeparateHexValues(responseWithPIDOnly);
        String calculationMethod = FifthModeRequestEnums.getEnum(PID);

        switch (calculationMethod) {
            case "OBD_MONITOR_IDs_SUPPORTED_01_20":
                responseMessage = OBD_MONITOR_IDs_SUPPORTED_01_20.read(firstHex, secondHex, thirdHex, fourthHex);
                break;
            case "RICH_TO_LEAN_SENSOR_THRESHOLD_VOLTAGE":
                responseMessage = RICH_TO_LEAN_SENSOR_THRESHOLD_VOLTAGE.read(firstHex);
                break;
            case "LEAN_TO_RICH_SENSOR_THRESHOLD_VOLTAGE":
                responseMessage = LEAN_TO_RICH_SENSOR_THRESHOLD_VOLTAGE.read(firstHex);
                break;
            case "LOW_VOLTAGE_USED_TO_CALCULATED_PASSAGE_TIME":
                responseMessage = LOW_VOLTAGE_USED_TO_CALCULATED_PASSAGE_TIME.read(firstHex);
                break;
            case "HIGH_VOLTAGE_USED_TO_CALCULATED_PASSAGE_TIME":
                responseMessage = HIGH_VOLTAGE_USED_TO_CALCULATED_PASSAGE_TIME.read(firstHex);
                break;
            case "RICH_TO_LEAN_CALCULATED_PASSAGE_TIME":
                responseMessage = RICH_TO_LEAN_CALCULATED_PASSAGE_TIME.read(firstHex);
                break;
            case "LEAN_TO_RICH_CALCULATED_PASSAGE_TIME":
                responseMessage = LEAN_TO_RICH_CALCULATED_PASSAGE_TIME.read(firstHex);
                break;
            case "MINIMUM_SENSOR_VOLTAGE_DURING_TEST_CYCLE":
                responseMessage = MINIMUM_SENSOR_VOLTAGE_DURING_TEST_CYCLE.read(firstHex);
                break;
            case "MAXIMUM_SENSOR_VOLTAGE_DURING_TEST_CYCLE":
                responseMessage = MAXIMUM_SENSOR_VOLTAGE_DURING_TEST_CYCLE.read(firstHex);
                break;
            case "TIME_BETWEEN_SENSOR_TRANSITIONS":
                responseMessage = TIME_BETWEEN_SENSOR_TRANSITIONS.read(firstHex);
                break;
            case "SENSOR_PERIOD":
                responseMessage = SENSOR_PERIOD.read(firstHex);
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
        } else if (pureResponse.length() == 10) {
            firstHex = pureResponse.substring(0, 2);
            secondHex = pureResponse.substring(2, 4);
            thirdHex = pureResponse.substring(4, 6);
            fourthHex = pureResponse.substring(6, 8);
            fifthHex = pureResponse.substring(8, 10);
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
        if (response.startsWith(MOD_FIVE_PREFIX)) {
            result = clearResponse.substring(2);
        } else result = clearResponse;
        return result;
    }
}
