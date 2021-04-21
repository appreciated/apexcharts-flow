package com.github.appreciated.apexcharts.config.fill;

public class Pattern {
    private String style;
    private Double width;
    private Double height;
    private Double strokeWidth;


    public Pattern() {
    }

    public String getStyle() {
        return style;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getStrokeWidth() {
        return strokeWidth;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setStrokeWidth(Double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

}
