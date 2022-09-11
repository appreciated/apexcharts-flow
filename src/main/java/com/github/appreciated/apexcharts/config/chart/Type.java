package com.github.appreciated.apexcharts.config.chart;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Type {
    LINE("line"),
    AREA("area"),
    BAR("bar"),
    HISTOGRAM("histogram"),
    PIE("pie"),
    DONUT("donut"),
    RADIALBAR("radialBar"),
    SCATTER("scatter"),
    BUBBLE("bubble"),
    HEATMAP("heatmap"),
    CANDLESTICK("candlestick"),
    RADAR("radar"),
    RANGEBAR("rangeBar"),
    BOXPLOT("boxPlot");

    private final String value;

    Type(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
