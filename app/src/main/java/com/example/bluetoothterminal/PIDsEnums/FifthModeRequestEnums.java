package com.example.bluetoothterminal.PIDsEnums;

import java.util.HashMap;
import java.util.Map;

public enum  FifthModeRequestEnums {

    OBD_MONITOR_IDs_SUPPORTED_01_20("00"),
    RICH_TO_LEAN_SENSOR_THRESHOLD_VOLTAGE("01"),
    LEAN_TO_RICH_SENSOR_THRESHOLD_VOLTAGE("02"),
    LOW_VOLTAGE_USED_TO_CALCULATED_PASSAGE_TIME("03"),
    HIGH_VOLTAGE_USED_TO_CALCULATED_PASSAGE_TIME("04"),
    RICH_TO_LEAN_CALCULATED_PASSAGE_TIME("05"),
    LEAN_TO_RICH_CALCULATED_PASSAGE_TIME("06"),
    MINIMUM_SENSOR_VOLTAGE_DURING_TEST_CYCLE("07"),
    MAXIMUM_SENSOR_VOLTAGE_DURING_TEST_CYCLE("08"),
    TIME_BETWEEN_SENSOR_TRANSITIONS("09"),
    SENSOR_PERIOD("0A"),
    RESERVED_FOR_FUTURE_USE("0B");


    private static final Map methodMap = new HashMap();

    static {
        for (FifthModeRequestEnums enums : FifthModeRequestEnums.values())
            methodMap.put(enums.getValue(), enums);
    }

    private final String value;

    FifthModeRequestEnums(String value) {
        this.value = value;
    }

    public final String getValue() {
        return value;
    }

    public static String getEnum(String value) {
        return String.valueOf(methodMap.get(value));
    }
}