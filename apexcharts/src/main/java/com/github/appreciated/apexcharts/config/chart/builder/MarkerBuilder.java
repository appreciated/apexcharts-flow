package com.github.appreciated.apexcharts.config.chart.builder;

import com.github.appreciated.apexcharts.config.chart.Marker;

public class MarkerBuilder {
    private Double size;
    private String fillColor;
    private String strokeColor;
    private Double strokeWidth;
    private String shape;
    private Double offsetX;
    private Double offsetY;
    private Double radius;
    private String cssClass;

    private MarkerBuilder() {
    }

    public static MarkerBuilder get() {
        return new MarkerBuilder();
    }

    public MarkerBuilder withSize(Double size) {
        this.size = size;
        return this;
    }

    public MarkerBuilder withFillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public MarkerBuilder withStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
        return this;
    }

    public MarkerBuilder withStrokeWidth(Double strokeWidth) {
        this.strokeWidth = strokeWidth;
        return this;
    }

    public MarkerBuilder withShape(String shape) {
        this.shape = shape;
        return this;
    }

    public MarkerBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public MarkerBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public MarkerBuilder withRadius(Double radius) {
        this.radius = radius;
        return this;
    }

    public MarkerBuilder withCssClass(String cssClass) {
        this.cssClass = cssClass;
        return this;
    }

    public Marker build() {
        Marker marker = new Marker();
        marker.setSize(size);
        marker.setFillColor(fillColor);
        marker.setStrokeColor(strokeColor);
        marker.setStrokeWidth(strokeWidth);
        marker.setShape(shape);
        marker.setOffsetX(offsetX);
        marker.setOffsetY(offsetY);
        marker.setRadius(radius);
        marker.setCssClass(cssClass);
        return marker;
    }
}
