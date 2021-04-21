package com.github.appreciated.apexcharts.config.xaxis.crosshairs.builder;

import com.github.appreciated.apexcharts.config.xaxis.crosshairs.Stroke;

public class StrokeBuilder {
    private String color;
    private Double width;
    private Double dashArray;

    private StrokeBuilder() {
    }

    public static StrokeBuilder get() {
        return new StrokeBuilder();
    }

    public StrokeBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public StrokeBuilder withWidth(Double width) {
        this.width = width;
        return this;
    }

    public StrokeBuilder withDashArray(Double dashArray) {
        this.dashArray = dashArray;
        return this;
    }

    public Stroke build() {
        Stroke stroke = new Stroke();
        stroke.setColor(color);
        stroke.setWidth(width);
        stroke.setDashArray(dashArray);
        return stroke;
    }
}
