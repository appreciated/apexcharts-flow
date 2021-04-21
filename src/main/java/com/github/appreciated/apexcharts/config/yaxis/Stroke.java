package com.github.appreciated.apexcharts.config.yaxis;

public class Stroke {
    private String color;
    private Number width;
    private Number dashArray;


    public Stroke() {
    }

    public String getColor() {
        return color;
    }

    public Number getWidth() {
        return width;
    }

    public Number getDashArray() {
        return dashArray;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(Number width) {
        this.width = width;
    }

    public void setDashArray(Number dashArray) {
        this.dashArray = dashArray;
    }

}
