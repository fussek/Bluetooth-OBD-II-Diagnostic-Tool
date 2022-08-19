package com.example.bluetoothterminal.Mod_1.PIDsFormulas;

public class FUEL_TYPE {
    private static final String NOT_AVAILABLE = "Not available\n";
    private static final String GASOLINE = "Gasoline";
    private static final String METHANOL = "Methanol";
    private static final String ETHANOL = "Ethanol";
    private static final String DIESEL = "Diesel";
    private static final String LPG = "LPG";
    private static final String CNG  = "CNG";
    private static final String PROPANE = "Propane";
    private static final String ELECTRIC = "Electric";
    private static final String BIFUEL_RUNNING_GASOLINE = "Bifuel running Gasoline";
    private static final String BIFUEL_RUNNING_METHANOL = "Bifuel running Methanol";
    private static final String BIFUEL_RUNNING_ETHANOL = "Bifuel running Ethanol";
    private static final String BIFUEL_RUNNING_LPG = "Bifuel running LPG";
    private static final String BIFUEL_RUNNING_CNG = "Bifuel running CNG";
    private static final String BIFUEL_RUNNING_PROPANE = "Bifuel running Propane";
    private static final String BIFUEL_RUNNING_ELECTRICITY = "Bifuel running Electricity";
    private static final String BIFUEL_RUNNING_ELECTRIC_AND_COMBUSTION_ENGINE = "Bifuel running electric and combustion engine";
    private static final String HYBRID_GASOLINE = "Hybrid gasoline";
    private static final String HYBRID_ETHANOL = "Hybrid Ethanol";
    private static final String HYBRID_DIESEL = "Hybrid Diesel";
    private static final String HYBRID_ELECTRIC = "Hybrid Electric";
    private static final String HYBRID_RUNNING_ELECTRIC_AND_COMBUSTION_ENGINE = "Hybrid running electric and combustion engine";
    private static final String HYBRID_REGENERATIVE = "Hybrid Regenerative";
    private static final String BIFUEL_RUNNING_DIESEL = "Bifuel running diesel";


    public static String read(String firstHex){
        String FuelType = null;

        int firstDecimal = Integer.parseInt(firstHex, 16);

        switch (firstDecimal) {
            case 0:
                FuelType = NOT_AVAILABLE;
                break;
            case 1:
                FuelType = GASOLINE;
                break;
            case 2:
                FuelType = METHANOL;
                break;
            case 3:
                FuelType = ETHANOL;
                break;
            case 4:
                FuelType = DIESEL;
                break;
            case 5:
                FuelType = LPG;
                break;
            case 6:
                FuelType = CNG;
                break;
            case 7:
                FuelType = PROPANE;
                break;
            case 8:
                FuelType = ELECTRIC;
                break;
            case 9:
                FuelType = BIFUEL_RUNNING_GASOLINE;
                break;
            case 10:
                FuelType = BIFUEL_RUNNING_METHANOL;
                break;
            case 11:
                FuelType = BIFUEL_RUNNING_ETHANOL;
                break;
            case 12:
                FuelType = BIFUEL_RUNNING_LPG;
                break;
            case 13:
                FuelType = BIFUEL_RUNNING_CNG;
                break;
            case 14:
                FuelType = BIFUEL_RUNNING_PROPANE;
                break;
            case 15:
                FuelType = BIFUEL_RUNNING_ELECTRICITY;
                break;
            case 16:
                FuelType = BIFUEL_RUNNING_ELECTRIC_AND_COMBUSTION_ENGINE;
                break;
            case 17:
                FuelType = HYBRID_GASOLINE;
                break;
            case 18:
                FuelType = HYBRID_ETHANOL;
                break;
            case 19:
                FuelType = HYBRID_DIESEL;
                break;
            case 20:
                FuelType = HYBRID_ELECTRIC;
                break;
            case 21:
                FuelType = HYBRID_RUNNING_ELECTRIC_AND_COMBUSTION_ENGINE;
                break;
            case 22:
                FuelType = HYBRID_REGENERATIVE;
                break;
            case 23:
                FuelType = BIFUEL_RUNNING_DIESEL;
                break;
            default: FuelType = NOT_AVAILABLE;
                break;
        }


        String response = "Type of fuel this vehicle is running on: " + FuelType +"\n";

        return response;
    }
}
