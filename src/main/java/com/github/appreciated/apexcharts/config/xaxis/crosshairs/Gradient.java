package com.github.appreciated.apexcharts.config.xaxis.crosshairs;

import java.util.List;

public class Gradient {
    private String colorFrom;
    private String colorTo;
    private List<Double> stops;
    private Double opacityFrom;
    private Double opacityTo;


    public Gradient() {
    }

    public String getColorFrom() {
        return colorFrom;
    }

    public String getColorTo() {
        return colorTo;
    }

    public List<Double> getStops() {
        return stops;
    }

    public Double getOpacityFrom() {
        return opacityFrom;
    }

    public Double getOpacityTo() {
        return opacityTo;
    }

    public void setColorFrom(String colorFrom) {
        this.colorFrom = colorFrom;
    }

    public void setColorTo(String colorTo) {
        this.colorTo = colorTo;
    }

    public void setStops(List<Double> stops) {
        this.stops = stops;
    }

    public void setOpacityFrom(Double opacityFrom) {
        this.opacityFrom = opacityFrom;
    }

    public void setOpacityTo(Double opacityTo) {
        this.opacityTo = opacityTo;
    }

}
