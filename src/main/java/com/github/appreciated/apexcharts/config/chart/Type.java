package com.github.appreciated.apexcharts.config.chart;

public enum Type {
    line("line"),
    area("area"),
    bar("bar"),
    histogram("histogram"),
    pie("pie"),
    donut("donut"),
    radialBar("radialBar"),
    scatter("scatter"),
    bubble("bubble"),
    heatmap("heatmap"),
    candlestick("candlestick"),
    radar("radar"),
    rangeBar("rangeBar"),
    boxPlot("boxPlot");
    private final String name;

    Type(String name) {
        this.name = name;
    }
}
