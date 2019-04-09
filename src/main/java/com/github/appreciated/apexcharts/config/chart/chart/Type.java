package com.github.appreciated.apexcharts.config.chart.chart;

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
    radar("radar");
    private String name;

    Type(String name) {
        this.name = name;
    }
}
