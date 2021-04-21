package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.markers.Hover;
import com.github.appreciated.apexcharts.config.markers.Shape;

import java.util.List;

public class Markers {
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


    public Markers() {
    }

    public Double[] getSize() {
        return size;
    }

    public List<String> getColors() {
        return colors;
    }

    public String getStrokeColor() {
        return strokeColor;
    }

    public Double getStrokeWidth() {
        return strokeWidth;
    }

    public Double getStrokeOpacity() {
        return strokeOpacity;
    }

    public Double getFillOpacity() {
        return fillOpacity;
    }

    public DiscretePoint[] getDiscrete() {
        return discrete;
    }

    public Shape getShape() {
        return shape;
    }

    public Double getRadius() {
        return radius;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public Hover getHover() {
        return hover;
    }

    public void setSize(Double[] size) {
        this.size = size;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    public void setStrokeWidth(Double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public void setStrokeOpacity(Double strokeOpacity) {
        this.strokeOpacity = strokeOpacity;
    }

    public void setFillOpacity(Double fillOpacity) {
        this.fillOpacity = fillOpacity;
    }

    public void setDiscrete(DiscretePoint[] discrete) {
        this.discrete = discrete;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public void setHover(Hover hover) {
        this.hover = hover;
    }

}
