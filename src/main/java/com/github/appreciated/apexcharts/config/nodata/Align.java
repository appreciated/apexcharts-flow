package com.github.appreciated.apexcharts.config.nodata;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Align {
    LEFT("left"),
    RIGHT("right"),
    CENTER("center");

    private final String value;

    Align(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
