package com.example.bluetoothterminal.PIDsEnums;

import java.util.HashMap;
import java.util.Map;

public enum NinthModeRequestEnums {

    PIDs_SUPPORTED_01_20("00"),
    VIN_MESSAGE_COUNT("01"),
    VIN("02"),                                                      //ASX
    CID_MESSAGE_COUNT("03"),
    CID("04"),                                                      //ASX
    CVN_MESSAGE_COUNT("05"),
    CVN("06"),                                                      //ASX
    IN_USE_PERFORMANCE_TRACKING_MESSAGE_COUNT("07"),
    IN_USE_PERFORMANCE_TRACKING_GASOLINE("08"),                     //ASX
    ECU_NAME_MESSAGE_COUNT("09"),
    ECU_NAME("0A"),
    IN_USE_PERFORMANCE_TRACKING_DIESEL("0B");


    private static final Map methodMap = new HashMap();

    static {
        for (NinthModeRequestEnums enums : NinthModeRequestEnums.values())
            methodMap.put(enums.getValue(), enums);
    }

    private final String value;

    NinthModeRequestEnums(String value) {
        this.value = value;
    }

    public final String getValue() {
        return value;
    }

    public static String getEnum(String value) {
        return String.valueOf(methodMap.get(value));
    }
}