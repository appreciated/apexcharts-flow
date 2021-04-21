package com.github.appreciated.apexcharts.config.chart.selection;

public class Stroke {
    private Double width;
    private String color;
    private Double opacity;
    private Double dashArray;


    public Stroke() {
    }

    public Double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public Double getOpacity() {
        return opacity;
    }

    public Double getDashArray() {
        return dashArray;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }

    public void setDashArray(Double dashArray) {
        this.dashArray = dashArray;
    }

}
