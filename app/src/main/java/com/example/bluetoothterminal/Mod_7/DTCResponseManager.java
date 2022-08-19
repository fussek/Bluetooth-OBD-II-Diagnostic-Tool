package com.example.bluetoothterminal.Mod_7;

class DTCResponseManager {

    private final static String DTC_PREFIX = "47";
    private static String firstHex = null;
    private static String secondHex = null;
    private static String thirdHex = null;
    private static String fourthHex = null;
    private static String fifthHex = null;
    private static String sixthHex = null;

    static String dtcResponseManager(String response) {
        String responseMessage = null;
        String responseWithPIDOnly = removeModPrefixAndWhitespace(response);
        getSeparateHexValues(responseWithPIDOnly);

        String DTC1 = DTCBuilder.buildDTC(firstHex, secondHex);
        String DTC2 = DTCBuilder.buildDTC(thirdHex, fourthHex);
        String DTC3 = DTCBuilder.buildDTC(fifthHex, sixthHex);

        responseMessage = "Stored DTC codes: \n" + DTC1 +"\n"+ DTC2 +"\n"+ DTC3 +"\n";  // If no more than one DTC is stored, then DTC2 / DTC3 = null;
        return responseMessage;
    }


    private static void getSeparateHexValues(String responseWithPIDOnly) {
        if (!responseWithPIDOnly.isEmpty()){
            String pureResponse = responseWithPIDOnly;
            if (responseWithPIDOnly.startsWith(DTC_PREFIX)) {
                pureResponse = responseWithPIDOnly.substring(2);
            }
         if (pureResponse.length() == 4) {
            firstHex = pureResponse.substring(0, 2);
            secondHex = pureResponse.substring(2, 4);
        } else if (pureResponse.length() == 8) {
            firstHex = pureResponse.substring(0, 2);
            secondHex = pureResponse.substring(2, 4);
            thirdHex = pureResponse.substring(4, 6);
            fourthHex = pureResponse.substring(6, 8);
        } else if (pureResponse.length() == 12) {
            firstHex = pureResponse.substring(0, 2);
            secondHex = pureResponse.substring(2, 4);
            thirdHex = pureResponse.substring(4, 6);
            fourthHex = pureResponse.substring(6, 8);
            fifthHex = pureResponse.substring(8, 10);
            sixthHex = pureResponse.substring(10, 12);
        }}
    }


    private static String removeModPrefixAndWhitespace(String response) {
        String result = null;
        String clearResponse = response.replaceAll(" ", "")
                .replaceAll("\r", "")
                .replaceAll("\n", "")
                .replaceAll(">", "");
        if (clearResponse.startsWith(DTC_PREFIX)) {
            result = clearResponse.substring(2);
        } else result = clearResponse;
        return result;
    }
}
