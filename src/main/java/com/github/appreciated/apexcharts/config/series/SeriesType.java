package com.github.appreciated.apexcharts.config.series;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SeriesType {
    LINE("line"),
    AREA("area"),
    COLUMN("column"),
    SCATTER("scatter"),
    BOXPLOT("boxPlot");

    private final String value;

    SeriesType(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
