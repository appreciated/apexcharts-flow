package com.github.appreciated.apexcharts.config.chart.animations;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Easing {
    LINEAR("linear"),
    EASEIN("easein"),
    EASEOUT("easeout"),
    EASEINOUT("easeinout");

    private final String value;

    Easing(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
