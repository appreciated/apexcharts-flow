package com.github.appreciated.apexcharts.config.xaxis.crosshairs;

public class Stroke {
    private String color;
    private Double width;
    private Double dashArray;


    public Stroke() {
    }

    public String getColor() {
        return color;
    }

    public Double getWidth() {
        return width;
    }

    public Double getDashArray() {
        return dashArray;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setDashArray(Double dashArray) {
        this.dashArray = dashArray;
    }

}
