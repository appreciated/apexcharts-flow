package com.github.appreciated.apexcharts.config.yaxis;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Align {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right");

    private final String value;

    Align(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
