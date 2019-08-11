package com.github.appreciated.apexcharts.config.chart.zoom;

public enum ZoomType {
    x("x"),
    y("y"),
    xy("xy");
    private final String name;

    ZoomType(String name) {
        this.name = name;
    }
}
