package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

import java.util.HashSet;
import java.util.Set;

public class MONITOR_STATUS_SINCE_DTCs_CLEARED {
    private static final String ENGINE_MISFIRE_MONITOR = "Engine misfire monitor";
    private static final String FUEL_SYSTEM_MONITOR_ = "Fuel System monitor";
    private static final String ELECTRONIC_COMPONENT_MONITOR = "Electronic component/circuit monitor";

    private static final String CATALYST_MONITOR = "Catalyst monitor";
    private static final String CATALYST_HEATER_MONITOR = "Catalyst heater monitor";
    private static final String EVAPORATIVE_SYSTEM_MONITOR = "Evaporative system monitor";
    private static final String SECONDARY_AIR_SYSTEM_MONITOR = "Secondary air system monitor";
    private static final String AC_MONITOR = "A/C monitor";
    private static final String OXYGEN_SENSOR_MONITOR = "Oxygen sensor monitor";
    private static final String OXYGEN_SENSOR_HEATER_MONITOR = "Oxygen sensor heater monitor";
    private static final String EGR_SYSTEM_MONITOR = "EGR (Exhaust Gas Recirculation) system monitor";

    private static Set<String> AvailableMonitors = new HashSet<String>();
    private static Set<String> ActiveMonitors = new HashSet<String>();
    private static Set<String> AvailableNonContinuousMonitors = new HashSet<String>();
    private static Set<String> ActiveNonContinuousMonitors = new HashSet<String>();

    public static String read(String firstHex, String secondHex,
                              String thirdHex, String fourthHex) {
        String firstByteLine = HexToByte(firstHex);
        String secondByteLine = HexToByte(secondHex);
        String thirdByteLine = HexToByte(thirdHex);
        String fourthByteLine = HexToByte(fourthHex);
        /**
         *    First byte operations.
         *     _     _  _  _  _  _  _  _
         *    |_| - |_||_||_||_||_||_||_|
         */
        String MILstatus = "Malfunction indicator lamp is ";
        if (firstByteLine.substring(0, 1).equals("1")) {
            MILstatus = MILstatus + "ON.";
        } else {
            MILstatus = MILstatus + "OFF.";
        }

        int numOfDTCs = Integer.parseInt(firstByteLine
                                    .substring(1, 8), 16);

        /**
         *    Second byte operations.
         *     _  _  _  _  _  _  _  _
         *    |_||_||_||_||_||_||_||_|
         */
        if (secondByteLine.substring(0, 1).equals("1")) {
            AvailableMonitors.add(ENGINE_MISFIRE_MONITOR);
        } if (secondByteLine.substring(1, 2).equals("1")) {
            AvailableMonitors.add(FUEL_SYSTEM_MONITOR_);
        } if (secondByteLine.substring(2, 3).equals("1")) {
            AvailableMonitors.add(ELECTRONIC_COMPONENT_MONITOR);
        } if (secondByteLine.substring(4, 5).equals("1")) {
            ActiveMonitors.add(ENGINE_MISFIRE_MONITOR);
        } if (secondByteLine.substring(5, 6).equals("1")) {
            ActiveMonitors.add(FUEL_SYSTEM_MONITOR_);
        } if (secondByteLine.substring(6, 7).equals("1")) {
            ActiveMonitors.add(ELECTRONIC_COMPONENT_MONITOR);
        }
        String continuousMonitorsAvailable = "Available monitors: \n" +
                                 AvailableMonitors.toString() + "\n";
        String continuousMonitorsActive = "Active monitors: \n" +
                                ActiveMonitors.toString() + "\n";

        /**
         * Third byte operations.
         *
         */
        if (thirdByteLine.substring(0, 1).equals("1")) {
            AvailableNonContinuousMonitors.add(CATALYST_MONITOR);
        } if (thirdByteLine.substring(1, 2).equals("1")) {
            AvailableNonContinuousMonitors.add(CATALYST_HEATER_MONITOR);
        } if (thirdByteLine.substring(2, 3).equals("1")) {
            AvailableNonContinuousMonitors.add(EVAPORATIVE_SYSTEM_MONITOR);
        } if (thirdByteLine.substring(3, 4).equals("1")) {
            AvailableNonContinuousMonitors.add(SECONDARY_AIR_SYSTEM_MONITOR);
        } if (thirdByteLine.substring(4, 5).equals("1")) {
            AvailableNonContinuousMonitors.add(AC_MONITOR);
        } if (thirdByteLine.substring(5, 6).equals("1")) {
            AvailableNonContinuousMonitors.add(OXYGEN_SENSOR_MONITOR);
        } if (thirdByteLine.substring(6, 7).equals("1")) {
            AvailableNonContinuousMonitors.add(OXYGEN_SENSOR_HEATER_MONITOR);
        } if (thirdByteLine.substring(7, 8).equals("1")) {
            AvailableNonContinuousMonitors.add(EGR_SYSTEM_MONITOR);
        }
        String nonContinuousMonitorsAvailable = "Available monitors: \n" + AvailableNonContinuousMonitors.toString() + "\n";

        /**
         * Fourth byte operations.
         *
         */
        if (fourthByteLine.substring(0, 1).equals("1")) {
            ActiveNonContinuousMonitors.add(CATALYST_MONITOR);
        } if (fourthByteLine.substring(1, 2).equals("1")) {
            ActiveNonContinuousMonitors.add(CATALYST_HEATER_MONITOR);
        } if (fourthByteLine.substring(2, 3).equals("1")) {
            ActiveNonContinuousMonitors.add(EVAPORATIVE_SYSTEM_MONITOR);
        } if (fourthByteLine.substring(3, 4).equals("1")) {
            ActiveNonContinuousMonitors.add(SECONDARY_AIR_SYSTEM_MONITOR);
        } if (fourthByteLine.substring(4, 5).equals("1")) {
            ActiveNonContinuousMonitors.add(AC_MONITOR);
        } if (fourthByteLine.substring(5, 6).equals("1")) {
            ActiveNonContinuousMonitors.add(OXYGEN_SENSOR_MONITOR);
        } if (fourthByteLine.substring(6, 7).equals("1")) {
            ActiveNonContinuousMonitors.add(OXYGEN_SENSOR_HEATER_MONITOR);
        } if (fourthByteLine.substring(7, 8).equals("1")) {
            ActiveNonContinuousMonitors.add(EGR_SYSTEM_MONITOR);
        }
        String nonContinuousMonitorsActive = "Active monitors: \n" + ActiveNonContinuousMonitors.toString() + "\n";

        String response = "\nMonitors status since last DTCs reset: \n"
                + "____________________________________________ \n\n"
                + "MIL Status: " + MILstatus + "\n"
                + "Number of DTCs stored in memory: " + numOfDTCs + "\n\n"
                + "***CONTINUOUS MONITORS STATE:*** \n" + continuousMonitorsAvailable + continuousMonitorsActive + "\n"
                + "***NON-CONTINUOUS MONITORS STATE:*** \n" + nonContinuousMonitorsAvailable + nonContinuousMonitorsActive + "\n"
                + "____________________________________________ \n";

        return response;

    }
    private static String HexToByte(String hex) {
        int decimalValue = Integer.parseInt(hex, 16);
        String byteString = Integer.toBinaryString(decimalValue);
        String byteStringWithZeros = String.format("%8s", byteString).replace(' ', '0');
        return byteStringWithZeros;
    }

}