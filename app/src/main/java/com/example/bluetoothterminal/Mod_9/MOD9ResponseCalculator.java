package com.example.bluetoothterminal.Mod_9;



import com.example.bluetoothterminal.Mod_9.PIDsFormulas.CID;
import com.example.bluetoothterminal.Mod_9.PIDsFormulas.CVN;
import com.example.bluetoothterminal.Mod_9.PIDsFormulas.ECU_NAME;
import com.example.bluetoothterminal.Mod_9.PIDsFormulas.ECU_NAME_MESSAGE_COUNT;
import com.example.bluetoothterminal.Mod_9.PIDsFormulas.IN_USE_PERFORMANCE_TRACKING_GASOLINE;
import com.example.bluetoothterminal.Mod_9.PIDsFormulas.PIDs_SUPPORTED_01_20;
import com.example.bluetoothterminal.Mod_9.PIDsFormulas.VIN;
import com.example.bluetoothterminal.PIDsEnums.NinthModeRequestEnums;

class MOD9ResponseCalculator {

    private final static String MOD_NINE_PREFIX = "49";
    private static String firstHex = null;
    private static String secondHex = null;
    private static String thirdHex = null;
    private static String fourthHex = null;
    private static String hexline = null;
    /**
     *                RESPONSE FORMAT
     *       ______   ______   _______  _______  _______  _______
     *      |      | |      | |       ||       ||       ||       |
     *      |  49  |-| PID  |-| 1 HEX || 2 HEX || 3 HEX || 4 HEX |
     *      |______| |______| |_______||_______||_______||_______|
     */


    static String MOD9ResponseCalculator(String response) {
        String responseMessage = null;
        String responseWithPIDOnly = removeModPrefixAndWhitespace(response);
        String PID = verifyPID(responseWithPIDOnly);
        getSeparateHexValues(responseWithPIDOnly);
        String calculationMethod = NinthModeRequestEnums.getEnum(PID);

        switch (calculationMethod) {
            case "PIDs_SUPPORTED_01_20":
                responseMessage = PIDs_SUPPORTED_01_20.read(firstHex, secondHex, thirdHex, fourthHex);
                break;
            case "VIN":
                responseMessage = VIN.read(hexline);
                break;
            case "CID":
                responseMessage = CID.read(hexline);
                break;
            case "CVN":
                responseMessage = CVN.read(firstHex, secondHex, thirdHex, fourthHex);
                break;
            case "IN_USE_PERFORMANCE_TRACKING_GASOLINE":
                responseMessage = IN_USE_PERFORMANCE_TRACKING_GASOLINE.read(hexline);
                break;
            case "ECU_NAME":
                responseMessage = ECU_NAME.read(hexline);
                break;
            case "ECU_NAME_MESSAGE_COUNT":
                responseMessage = ECU_NAME_MESSAGE_COUNT.read(firstHex);
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
        } else if (pureResponse.length() == 8) {
            firstHex = pureResponse.substring(0, 2);
            secondHex = pureResponse.substring(2, 4);
            thirdHex = pureResponse.substring(4, 6);
            fourthHex = pureResponse.substring(6, 8);
        } else if (pureResponse.startsWith("01") && pureResponse.length() == 10) {
            firstHex = pureResponse.substring(2, 4);
            secondHex = pureResponse.substring(4, 6);
            thirdHex = pureResponse.substring(6, 8);
            fourthHex = pureResponse.substring(8, 10);
        } else if (pureResponse.startsWith("01") && pureResponse.length() >= 10) {
            hexline = pureResponse.substring(2);
        } else if (pureResponse.length() >= 35) {
            hexline = pureResponse;
        }
    }

    private static String verifyPID(String responseWithPIDOnly) {
        return responseWithPIDOnly.substring(0, 2);
    }

    private static String removeModPrefixAndWhitespace(String response) {
        String result = null;
        String clearResponse = response
                .replaceAll("\r", "")
                .replaceAll("\n", "")
                .replaceAll(">", "")
                .replaceAll("0:", "")
                .replaceAll("1:", "")
                .replaceAll("2:", "")
                .replaceAll("3:", "")
                .replaceAll("4:", "")
                .replaceAll("5:", "")
                .replaceAll("6:", "")
                .replaceAll("013", "")
                .replaceAll("014", "")
                .replaceAll("02B", "")
                .replaceAll("6:", "")
                .replaceAll("6:", "")
                .replaceAll(" ", "")
                .replaceAll("�","0");

        if (clearResponse.startsWith(MOD_NINE_PREFIX)) {
            result = clearResponse.substring(2);
        } else result = clearResponse;
        return result;
    }
}
