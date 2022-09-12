package com.github.appreciated.apexcharts.config.legend;

import com.fasterxml.jackson.annotation.JsonValue;

public enum HorizontalAlign {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right");

    private final String value;

    HorizontalAlign(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
