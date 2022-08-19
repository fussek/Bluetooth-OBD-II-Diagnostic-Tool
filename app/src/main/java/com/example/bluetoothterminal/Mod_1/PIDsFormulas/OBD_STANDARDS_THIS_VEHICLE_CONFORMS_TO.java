package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class OBD_STANDARDS_THIS_VEHICLE_CONFORMS_TO {

    private static final String OBD_II_CARB = "OBD-II as defined by the CARB";
    private static final String OBD_IEPA = "OBD as defined by the EPA";
    private static final String OBD_OBD_II = "OBD and OBD-II";
    private static final String OBD_I = "OBD-I";
    private static final String NOT_OBD = "Not OBD compliant";
    private static final String EOBD = "EOBD (Europe)";
    private static final String EOBD_OBD_II = "EOBD and OBD-II";
    private static final String EOBD_OBD = "EOBD and OBD";
    private static final String EOBD_OBD_OBD_II = "EOBD, OBD and OBD II";
    private static final String JOBD = "JOBD (Japan)";
    private static final String JOBD_OBD_II = "JOBD and OBD II";
    private static final String JOBD_EOBD = "JOBD and EOBD";
    private static final String JOBD_EOBD_OBD_II = "JOBD, EOBD, and OBD II";
    private static final String RESERVED = "Reserved";
    private static final String EMD = "Engine Manufacturer Diagnostics (EMD)";
    private static final String EMD_PLUS = "Engine Manufacturer Diagnostics Enhanced (EMD+)";
    private static final String HD_OBD_C = "Heavy Duty On-Board Diagnostics (Child/Partial) (HD OBD-C)";
    private static final String HD_OBD = "Heavy Duty On-Board Diagnostics (HD OBD)";
    private static final String WWH_OBD = "World Wide Harmonized OBD (WWH OBD)";
    private static final String HD_EOBD_I = "Heavy Duty Euro OBD Stage I without NOx control (HD EOBD-I)";
    private static final String HD_EOBD_I_N = "Heavy Duty Euro OBD Stage I with NOx control (HD EOBD-I N)";
    private static final String HD_EOBD_II = "Heavy Duty Euro OBD Stage II without NOx control (HD EOBD-II)";
    private static final String HD_EOBD_II_N = "Heavy Duty Euro OBD Stage II with NOx control (HD EOBD-II N)";
    private static final String OBDBr_1 = "Brazil OBD Phase 1 (OBDBr-1)";
    private static final String OBDBr_2 = "Brazil OBD Phase 2 (OBDBr-2)";
    private static final String KOBD = "Korean OBD (KOBD)";
    private static final String IOBD_I = "India OBD I (IOBD I)";
    private static final String IOBD_II = "India OBD II (IOBD II)";
    private static final String HD_EOBD_IV = "Heavy Duty Euro OBD Stage VI (HD EOBD-IV)";
    private static final String SAE_J1939 = "Not available for assignment (SAE J1939 special meaning)";



    public static String read(String firstHex){
        String OBDstandard = null;

        int firstDecimal = Integer.parseInt(firstHex, 16);

        switch (firstDecimal) {
            case 1:
                OBDstandard = OBD_II_CARB;
                break;
            case 2:
                OBDstandard = OBD_IEPA;
                break;
            case 3:
                OBDstandard = OBD_OBD_II;
                break;
            case 4:
                OBDstandard = OBD_I;
                break;
            case 5:
                OBDstandard = NOT_OBD;
                break;
            case 6:
                OBDstandard = EOBD;
                break;
            case 7:
                OBDstandard = EOBD_OBD_II;
                break;
            case 8:
                OBDstandard = EOBD_OBD;
                break;
            case 9:
                OBDstandard = EOBD_OBD_OBD_II;
                break;
            case 10:
                OBDstandard = JOBD;
                break;
            case 11:
                OBDstandard = JOBD_OBD_II;
                break;
            case 12:
                OBDstandard = JOBD_EOBD;
                break;
            case 13:
                OBDstandard = JOBD_EOBD_OBD_II;
                break;
            case 14:
                OBDstandard = RESERVED;
                break;
            case 15:
                OBDstandard = RESERVED;
                break;
            case 16:
                OBDstandard = RESERVED;
                break;
            case 17:
                OBDstandard = EMD;
                break;
            case 18:
                OBDstandard = EMD_PLUS;
                break;
            case 19:
                OBDstandard = HD_OBD_C;
                break;
            case 20:
                OBDstandard = HD_OBD;
                break;
            case 21:
                OBDstandard = WWH_OBD;
                break;
            case 22:
                OBDstandard = RESERVED;
                break;
            case 23:
                OBDstandard = HD_EOBD_I;
                break;
            case 24:
                OBDstandard = HD_EOBD_I_N;
                break;
            case 25:
                OBDstandard = HD_EOBD_II;
                break;
            case 26:
                OBDstandard = HD_EOBD_II_N;
                break;
            case 27:
                OBDstandard = RESERVED;
                break;
            case 28:
                OBDstandard = OBDBr_1;
                break;
            case 29:
                OBDstandard = OBDBr_2;
                break;
            case 30:
                OBDstandard = KOBD;
                break;
            case 31:
                OBDstandard = IOBD_I;
                break;
            case 32:
                OBDstandard = IOBD_II;
                break;
            case 33:
                OBDstandard = HD_EOBD_IV;
                break;
            case 251:
                OBDstandard = SAE_J1939;
                break;
            case 252:
                OBDstandard = SAE_J1939;
                break;
            case 253:
                OBDstandard = SAE_J1939;
                break;
            case 254:
                OBDstandard = SAE_J1939;
                break;
            case 255:
                OBDstandard = SAE_J1939;
                break;
            default: OBDstandard = RESERVED;
                break;
        }


        String response = "OBD standards this vehicle conforms to: \n" + OBDstandard;

        return response;
    }
}
