package com.github.appreciated.apexcharts.config.series;

public enum SeriesType {
	line("line"),
    area("area"),
    column("column");
    private final String name;

    SeriesType(String name) {
        this.name = name;
    }
}
