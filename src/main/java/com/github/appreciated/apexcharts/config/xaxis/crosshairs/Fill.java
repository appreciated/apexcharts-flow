package com.github.appreciated.apexcharts.config.xaxis.crosshairs;

public class Fill {
    private String type;
    private String color;
    private Gradient gradient;


    public Fill() {
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Gradient getGradient() {
        return gradient;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGradient(Gradient gradient) {
        this.gradient = gradient;
    }

}
