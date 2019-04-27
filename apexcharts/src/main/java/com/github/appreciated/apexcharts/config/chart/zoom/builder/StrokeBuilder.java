package com.github.appreciated.apexcharts.config.chart.zoom.builder;

import com.github.appreciated.apexcharts.config.chart.zoom.Stroke;

public class StrokeBuilder {
    private String color;
    private Double opacity;
    private Double width;

    private StrokeBuilder() {
    }

    public static StrokeBuilder get() {
        return new StrokeBuilder();
    }

    public StrokeBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public StrokeBuilder withOpacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    public StrokeBuilder withWidth(Double width) {
        this.width = width;
        return this;
    }

    public Stroke build() {
        Stroke stroke = new Stroke();
        stroke.setColor(color);
        stroke.setOpacity(opacity);
        stroke.setWidth(width);
        return stroke;
    }
}
