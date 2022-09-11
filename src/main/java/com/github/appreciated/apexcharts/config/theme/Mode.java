package com.github.appreciated.apexcharts.config.theme;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Mode {
    LIGHT("light"),
    DARK("dark");

    private final String value;

    Mode(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
