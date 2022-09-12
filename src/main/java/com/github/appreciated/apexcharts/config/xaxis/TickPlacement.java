package com.github.appreciated.apexcharts.config.xaxis;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TickPlacement {
    BETWEEN("between"),
    ON("on");

    private final String value;

    TickPlacement(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
