package com.github.appreciated.apexcharts.config.xaxis;

import com.fasterxml.jackson.annotation.JsonValue;

public enum XAxisType {
    CATEGORIES("categories"),
    DATETIME("datetime"),
    NUMERIC("numeric");

    private final String value;

    XAxisType(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
