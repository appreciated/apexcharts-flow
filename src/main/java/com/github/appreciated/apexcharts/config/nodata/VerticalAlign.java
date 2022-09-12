package com.github.appreciated.apexcharts.config.nodata;

import com.fasterxml.jackson.annotation.JsonValue;

public enum VerticalAlign {
    TOP("top"),
    MIDDLE("middle"),
    BOTTOM("bottom");

    private final String value;

    VerticalAlign(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
