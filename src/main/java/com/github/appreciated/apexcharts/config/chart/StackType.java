package com.github.appreciated.apexcharts.config.chart;

import com.fasterxml.jackson.annotation.JsonValue;

public enum StackType {
    NORMAL("normal"),
    FULL("100%");

    private final String value;

    StackType(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

}
