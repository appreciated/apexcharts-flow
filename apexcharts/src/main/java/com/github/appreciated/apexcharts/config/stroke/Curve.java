package com.github.appreciated.apexcharts.config.stroke;

public enum Curve {
    smooth("smooth"),
    straight("straight"),
    stepline("stepline");
    private final String name;

    Curve(String name) {
        this.name = name;
    }
}
