package com.github.appreciated.apexcharts.config.legend.builder;

import com.github.appreciated.apexcharts.config.legend.Markers;
import com.github.appreciated.apexcharts.config.legend.Shape;

public class MarkersBuilder {
    private Double width;
    private Double height;
    private String strokeColor;
    private Double strokeWidth;
    private Double offsetX;
    private Double offsetY;
    private Double radius;
    private Shape shape;
    private String customHTML;

    private MarkersBuilder() {
    }

    public static MarkersBuilder get() {
        return new MarkersBuilder();
    }

    public MarkersBuilder withWidth(Double width) {
        this.width = width;
        return this;
    }

    public MarkersBuilder withHeight(Double height) {
        this.height = height;
        return this;
    }

    public MarkersBuilder withStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
        return this;
    }

    public MarkersBuilder withStrokeWidth(Double strokeWidth) {
        this.strokeWidth = strokeWidth;
        return this;
    }

    public MarkersBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public MarkersBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public MarkersBuilder withRadius(Double radius) {
        this.radius = radius;
        return this;
    }

    public MarkersBuilder withShape(Shape shape) {
        this.shape = shape;
        return this;
    }

    public MarkersBuilder withCustomHTML(String customHTML) {
        this.customHTML = customHTML;
        return this;
    }

    public Markers build() {
        Markers markers = new Markers();
        markers.setWidth(width);
        markers.setHeight(height);
        markers.setStrokeColor(strokeColor);
        markers.setStrokeWidth(strokeWidth);
        markers.setOffsetX(offsetX);
        markers.setOffsetY(offsetY);
        markers.setRadius(radius);
        markers.setShape(shape);
        markers.setCustomHTML(customHTML);
        return markers;
    }
}
