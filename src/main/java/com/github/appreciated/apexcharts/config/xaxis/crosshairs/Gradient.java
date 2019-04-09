package com.github.appreciated.apexcharts.config.xaxis.crosshairs;

import java.util.List;

class Gradient {
    String colorFrom;
    String colorTo;
    List<Double> stops;
    double opacityFrom;
    double opacityTo;

    public String getColorFrom() {
        return colorFrom;
    }

    public void setColorFrom(String colorFrom) {
        this.colorFrom = colorFrom;
    }

    public String getColorTo() {
        return colorTo;
    }

    public void setColorTo(String colorTo) {
        this.colorTo = colorTo;
    }

    public List<Double> getStops() {
        return stops;
    }

    public void setStops(List<Double> stops) {
        this.stops = stops;
    }

    public double getOpacityFrom() {
        return opacityFrom;
    }

    public void setOpacityFrom(double opacityFrom) {
        this.opacityFrom = opacityFrom;
    }

    public double getOpacityTo() {
        return opacityTo;
    }

    public void setOpacityTo(double opacityTo) {
        this.opacityTo = opacityTo;
    }
}
