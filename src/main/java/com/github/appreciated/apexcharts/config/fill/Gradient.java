package com.github.appreciated.apexcharts.config.fill;

import java.util.List;

public class Gradient {
    String shade;
    String type;
    double shadeIntensity;
    List<String> gradientToColors;
    Boolean inverseColors;
    double opacityFrom;
    double opacityTo;
    List<Double> stops;

    public String getShade() {
        return shade;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getShadeIntensity() {
        return shadeIntensity;
    }

    public void setShadeIntensity(double shadeIntensity) {
        this.shadeIntensity = shadeIntensity;
    }

    public List<String> getGradientToColors() {
        return gradientToColors;
    }

    public void setGradientToColors(List<String> gradientToColors) {
        this.gradientToColors = gradientToColors;
    }

    public Boolean getInverseColors() {
        return inverseColors;
    }

    public void setInverseColors(Boolean inverseColors) {
        this.inverseColors = inverseColors;
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

    public List<Double> getStops() {
        return stops;
    }

    public void setStops(List<Double> stops) {
        this.stops = stops;
    }
}
