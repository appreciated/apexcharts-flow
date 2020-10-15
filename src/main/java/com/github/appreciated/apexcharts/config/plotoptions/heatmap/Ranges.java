package com.github.appreciated.apexcharts.config.plotoptions.heatmap;

public class Ranges {
    private Double from;
    private Double to;
    private String color;
    private String foreColor;
    private String name;


    public Ranges() {
    }

    public Double getFrom() {
        return from;
    }

    public Double getTo() {
        return to;
    }

    public String getColor() {
        return color;
    }

    public String getForeColor() {
        return foreColor;
    }

    public String getName() {
        return name;
    }

    public void setFrom(Double from) {
        this.from = from;
    }

    public void setTo(Double to) {
        this.to = to;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setForeColor(String foreColor) {
        this.foreColor = foreColor;
    }
}
