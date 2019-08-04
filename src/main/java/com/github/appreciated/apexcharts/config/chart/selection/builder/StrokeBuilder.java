package com.github.appreciated.apexcharts.config.chart.selection.builder;

import com.github.appreciated.apexcharts.config.chart.selection.Stroke;

public class StrokeBuilder {
    private Double width;
    private String color;
    private Double opacity;
    private Double dashArray;

    private StrokeBuilder() {
    }

    public static StrokeBuilder get() {
        return new StrokeBuilder();
    }

    public StrokeBuilder withWidth(Double width) {
        this.width = width;
        return this;
    }

    public StrokeBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public StrokeBuilder withOpacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    public StrokeBuilder withDashArray(Double dashArray) {
        this.dashArray = dashArray;
        return this;
    }

    public Stroke build() {
        Stroke stroke = new Stroke();
        stroke.setWidth(width);
        stroke.setColor(color);
        stroke.setOpacity(opacity);
        stroke.setDashArray(dashArray);
        return stroke;
    }
}
