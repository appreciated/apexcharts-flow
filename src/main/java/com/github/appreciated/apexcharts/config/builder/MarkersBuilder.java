package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.DiscretePoint;
import com.github.appreciated.apexcharts.config.Markers;
import com.github.appreciated.apexcharts.config.markers.Hover;
import com.github.appreciated.apexcharts.config.markers.Shape;

import java.util.List;

public class MarkersBuilder {
    private Double[] size;
    private List<String> colors;
    private String strokeColor;
    private Double strokeWidth;
    private Double strokeOpacity;
    private Double fillOpacity;
    private DiscretePoint[] discrete;
    private Shape shape;
    private Double radius;
    private Double offsetX;
    private Double offsetY;
    private Hover hover;

    private MarkersBuilder() {
    }

    public static MarkersBuilder get() {
        return new MarkersBuilder();
    }

    public MarkersBuilder withSize(Double width, Double height) {
        this.size = new Double[]{width, height};
        return this;
    }

    public MarkersBuilder withColors(List<String> colors) {
        this.colors = colors;
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

    public MarkersBuilder withStrokeOpacity(Double strokeOpacity) {
        this.strokeOpacity = strokeOpacity;
        return this;
    }

    public MarkersBuilder withFillOpacity(Double fillOpacity) {
        this.fillOpacity = fillOpacity;
        return this;
    }

    public MarkersBuilder withDiscrete(DiscretePoint[] discrete) {
        this.discrete = discrete;
        return this;
    }

    public MarkersBuilder withShape(Shape shape) {
        this.shape = shape;
        return this;
    }

    public MarkersBuilder withRadius(Double radius) {
        this.radius = radius;
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

    public MarkersBuilder withHover(Hover hover) {
        this.hover = hover;
        return this;
    }

    public Markers build() {
        Markers markers = new Markers();
        markers.setSize(size);
        markers.setColors(colors);
        markers.setStrokeColor(strokeColor);
        markers.setStrokeWidth(strokeWidth);
        markers.setStrokeOpacity(strokeOpacity);
        markers.setFillOpacity(fillOpacity);
        markers.setDiscrete(discrete);
        markers.setShape(shape);
        markers.setRadius(radius);
        markers.setOffsetX(offsetX);
        markers.setOffsetY(offsetY);
        markers.setHover(hover);
        return markers;
    }
}
