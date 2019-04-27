package com.github.appreciated.apexcharts.config.yaxis.builder;

import com.github.appreciated.apexcharts.config.yaxis.Stroke;

public class StrokeBuilder {
    private String color;
    private Number width;
    private Number dashArray;

    private StrokeBuilder() {
    }

    public static StrokeBuilder get() {
        return new StrokeBuilder();
    }

    public StrokeBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public StrokeBuilder withWidth(Number width) {
        this.width = width;
        return this;
    }

    public StrokeBuilder withDashArray(Number dashArray) {
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
