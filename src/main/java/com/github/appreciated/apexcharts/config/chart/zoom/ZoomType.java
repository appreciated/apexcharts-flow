package com.github.appreciated.apexcharts.config.chart.zoom;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ZoomType {
    X("x"),
    Y("y"),
    XY("xy");

    private final String value;

    ZoomType(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
