package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class FUEL_SYSTEM_STATUS {
    private static final String OPEN_BAD_TEMP = "Open loop due to insufficient engine temperature.  \n";
    private static final String CLOSED_OX_SENSOR = "Closed loop, using oxygen sensor feedback to determine fuel mix.    \n";
    private static final String OPEN = "Open loop due to engine load OR fuel cut due to deceleration.   \n";
    private static final String OPEN_FAILURE = "Open loop due to system failure.    \n";
    private static final String CLOSED_FEEDBACK_FAULT = "Closed loop, using at least one oxygen sensor but there is a fault in the feedback system. \n";

    public static String read(String firstHex, String secondHex){

        String system1status = null;
        String system2status = null;
        int firstDecimal = Integer.parseInt(firstHex, 16);
        int secondDecimal = Integer.parseInt(secondHex, 16);

        switch (firstDecimal) {
            case 1:
                system1status = OPEN_BAD_TEMP;
                break;
            case 2:
                system1status = CLOSED_OX_SENSOR;
                break;
            case 4:
                system1status = OPEN;
                break;
            case 8:
                system1status = OPEN_FAILURE;
                break;
            case 16:
                system1status = CLOSED_FEEDBACK_FAULT;
                break;
            default: system1status = "Error. Invalid response.  \n";
                break;
        }

        switch (secondDecimal) {
            case 1:
                system2status = OPEN_BAD_TEMP;
                break;
            case 2:
                system2status = CLOSED_OX_SENSOR;
                break;
            case 4:
                system2status = OPEN;
                break;
            case 8:
                system2status = OPEN_FAILURE;
                break;
            case 16:
                system2status = CLOSED_FEEDBACK_FAULT;
                break;
            default: system2status = "Error.\n This vehicle is not equipped with second fuel system, or the response is invalid.      \n";
                break;
        }

        String response = "\n____First fuel system status:____ \n" + system1status + "\n"
                + "____Second fuel system status (if exists):____   \n" + system2status + "\n\n";
        return response;
    }
}
