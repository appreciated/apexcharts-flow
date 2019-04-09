package com.github.appreciated.apexcharts.config.stroke;

public enum Curve {
    smooth("smooth"),
    straight("straight"),
    stepline("stepline");
    private String name;

    Curve(String name) {
        this.name = name;
    }
}
