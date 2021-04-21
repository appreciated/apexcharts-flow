package com.github.appreciated.apexcharts.config.chart;

public class Marker {
    private Double size;
    private String fillColor;
    private String strokeColor;
    private Double strokeWidth;
    private String shape;
    private Double offsetX;
    private Double offsetY;
    private Double radius;
    private String cssClass;

    public Marker() {
    }

    public Double getSize() {
        return size;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getStrokeColor() {
        return strokeColor;
    }

    public Double getStrokeWidth() {
        return strokeWidth;
    }

    public String getShape() {
        return shape;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public Double getRadius() {
        return radius;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    public void setStrokeWidth(Double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

}
