package com.github.appreciated.apexcharts.config.legend;

public class Markers {
    private Double width;
    private Double height;
    private String strokeColor;
    private Double strokeWidth;
    private Double offsetX;
    private Double offsetY;
    private Double radius;
    private Shape shape;
    private String customHTML;


    public Markers() {
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public String getStrokeColor() {
        return strokeColor;
    }

    public Double getStrokeWidth() {
        return strokeWidth;
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

    public Shape getShape() {
        return shape;
    }

    public String getCustomHTML() {
        return customHTML;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    public void setStrokeWidth(Double strokeWidth) {
        this.strokeWidth = strokeWidth;
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

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setCustomHTML(String customHTML) {
        this.customHTML = customHTML;
    }

}
