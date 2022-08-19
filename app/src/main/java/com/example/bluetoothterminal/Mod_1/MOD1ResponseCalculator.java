package com.example.bluetoothterminal.Mod_1;

import com.example.bluetoothterminal.PIDsEnums.FirstModeRequestEnums;
import com.example.bluetoothterminal.Mod_1.PIDsFormulas.*;


class MOD1ResponseCalculator {

    private final static String MOD_ONE_PREFIX = "41";
    private static String firstHex = null;
    private static String secondHex = null;
    private static String thirdHex = null;
    private static String fourthHex = null;

    /**
     *                RESPONSE FORMAT
     *       ______   ______   _______  _______  _______  _______
     *      |      | |      | |       ||       ||       ||       |
     *      |  41  |-| PID  |-| 1 HEX || 2 HEX || 3 HEX || 4 HEX |
     *      |______| |______| |_______||_______||_______||_______|
     */


    static String MOD1ResponseCalculator(String response) {
        String responseMessage = null;
        String responseWithPIDOnly = removeModPrefixAndWhitespace(response);
        String PID = verifyPID(responseWithPIDOnly);
        getSeparateHexValues(responseWithPIDOnly);
        String calculationMethod = FirstModeRequestEnums.getEnum(PID);

        switch (calculationMethod) {
            case "PIDs_SUPPORTED_01_20":
                responseMessage = PIDs_SUPPORTED_01_20.read
                                     (firstHex, secondHex, thirdHex, fourthHex);
                break;
            case "MONITOR_STATUS_SINCE_DTCs_CLEARED":
                responseMessage = MONITOR_STATUS_SINCE_DTCs_CLEARED.read
                                     (firstHex, secondHex, thirdHex, fourthHex);
                break;
            case "FUEL_SYSTEM_STATUS":
                responseMessage = FUEL_SYSTEM_STATUS.read(firstHex, secondHex);
                break;
            case "CALCULATED_ENGINE_LOAD":
                responseMessage = CALCULATED_ENGINE_LOAD.read(firstHex);
                break;
            case "ENGINE_COOLANT_TEMPERATURE":
                responseMessage = ENGINE_COOLANT_TEMPERATURE.read(firstHex);
                break;
            case "SHORT_TERM_FUEL_TRIM_BANK_1":
                responseMessage = SHORT_TERM_FUEL_TRIM_BANK_1.read(firstHex);
                break;
            case "LONG_TERM_FUEL_TRIM_BANK_1":
                responseMessage = LONG_TERM_FUEL_TRIM_BANK_1.read(firstHex);
                break;
            case "SHORT_TERM_FUEL_TRIM_BANK_2":
                responseMessage = SHORT_TERM_FUEL_TRIM_BANK_2.read(firstHex);
                break;
            case "INTAKE_MANIFOLD_ABSOLUTE_PRESSURE":
                responseMessage = INTAKE_MANIFOLD_ABSOLUTE_PRESSURE.read(firstHex);
                break;
            case "ABSOLUTE_BAROMETRIC_PRESSURE":
                responseMessage = ABSOLUTE_BAROMETRIC_PRESSURE.read(firstHex);
                break;
            case "ENGINE_RPM":
                responseMessage = ENGINE_RPM.read(firstHex, secondHex);
                break;
            case "VEHICLE_SPEED":
                responseMessage = VEHICLE_SPEED.read(firstHex);
                break;
            case "TIMING_ADVANCE":
                responseMessage = TIMING_ADVANCE.read(firstHex);
                break;
            case "INTAKE_AIR_TEMPERATURE":
                responseMessage = INTAKE_AIR_TEMPERATURE.read(firstHex);
                break;
            case "THROTTLE_POSITION":
                responseMessage = THROTTLE_POSITION.read(firstHex);
                break;
            case "OXYGEN_SENSORS_PRESENT_BANKS_1_2":
                responseMessage = OXYGEN_SENSORS_PRESENT_BANKS_1_2.read(firstHex);
                break;
            case "OBD_STANDARDS_THIS_VEHICLE_CONFORMS_TO":
                responseMessage = OBD_STANDARDS_THIS_VEHICLE_CONFORMS_TO.read(firstHex);
                break;
            case "PIDs_SUPPORTED_21_40":
                responseMessage = PIDs_SUPPORTED_21_40.read(firstHex, secondHex, thirdHex, fourthHex);
                break;
            case "DISTANCE_TRAVELLED_WITH_MIL_ON":
                responseMessage = DISTANCE_TRAVELLED_WITH_MIL_ON.read(firstHex, secondHex);
                break;
            case "DISTANCE_TRAVELED_SINCE_CODES_CLEARED":
                responseMessage = DISTANCE_TRAVELED_SINCE_CODES_CLEARED.read(firstHex, secondHex);
                break;
            case "OXYGEN_SENSOR_1_SHORT_TERM_FUEL_TRIM":
                responseMessage = OXYGEN_SENSOR_1_SHORT_TERM_FUEL_TRIM.read(firstHex, secondHex);
                break;
            case "OXYGEN_SENSOR_2_SHORT_TERM_FUEL_TRIM":
                responseMessage = OXYGEN_SENSOR_2_SHORT_TERM_FUEL_TRIM.read(firstHex, secondHex);
                break;
            case "RUNTIME_SINCE_ENGINE_START":
                responseMessage = RUNTIME_SINCE_ENGINE_START.read(firstHex, secondHex);
                break;
            case "COMMANDED_EGR":
                responseMessage = COMMANDED_EGR.read(firstHex);
                break;
            case "NUMBER_OF_WARM_UPS_SINCE_CODES_CLEARED":
                responseMessage = NUMBER_OF_WARM_UPS_SINCE_CODES_CLEARED.read(firstHex);
                break;
            case "COMMANDED_EVAPORATIVE_PURGE":
                responseMessage = COMMANDED_EVAPORATIVE_PURGE.read(firstHex);
                break;
            case "PIDs_SUPPORTED_41_60":
                responseMessage = PIDs_SUPPORTED_41_60.read(firstHex, secondHex, thirdHex, fourthHex);
                break;
            case "MONITOR_STATUS_THIS_DRIVE_CYCLE":
                responseMessage = MONITOR_STATUS_THIS_DRIVE_CYCLE.read(secondHex, thirdHex, fourthHex);
                break;
            case "CONTROL_MODULE_VOLTAGE":
                responseMessage = CONTROL_MODULE_VOLTAGE.read(firstHex, secondHex);
                break;
            case "ABSOLUTE_LOAD_VALUE":
                responseMessage = ABSOLUTE_LOAD_VALUE.read(firstHex, secondHex);
                break;
            case "COMMAND_EQUIVALENCE_RATIO":
                responseMessage = COMMAND_EQUIVALENCE_RATIO.read(firstHex, secondHex);
                break;
            case "RELATIVE_THROTTLE_POSITION":
                responseMessage = RELATIVE_THROTTLE_POSITION.read(firstHex);
                break;
            case "AMBIENT_AIR_TEMPERATURE":
                responseMessage = AMBIENT_AIR_TEMPERATURE.read(firstHex);
                break;
            case "ABSOLUTE_THROTTLE_POSITION_B":
                responseMessage = ABSOLUTE_THROTTLE_POSITION_B.read(firstHex);
                break;
            case "ABSOLUTE_THROTTLE_POSITION_D":
                responseMessage = ABSOLUTE_THROTTLE_POSITION_D.read(firstHex);
                break;
            case "ABSOLUTE_THROTTLE_POSITION_E":
                responseMessage = ABSOLUTE_THROTTLE_POSITION_E.read(firstHex);
                break;
            case "COMMANDED_THROTTLE_ACTUATOR":
                responseMessage = COMMANDED_THROTTLE_ACTUATOR.read(firstHex);
                break;
            case "FUEL_TYPE":
                responseMessage = FUEL_TYPE.read(firstHex);
                break;
            case "RELATIVE_ACCELERATOR_PEDAL_POSITION":
                responseMessage = RELATIVE_ACCELERATOR_PEDAL_POSITION.read(firstHex);
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
        if (response.startsWith(MOD_ONE_PREFIX)) {
            result = clearResponse.substring(2);
        } else result = clearResponse;
        return result;
    }
}
