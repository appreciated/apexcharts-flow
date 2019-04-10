package com.github.appreciated.apexcharts.config.fill;

import java.util.List;

public class Gradient {
    String shade;
    String type;
    Double shadeIntensity;
    List<String> gradientToColors;
    Boolean inverseColors;
    Double opacityFrom;
    Double opacityTo;
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

    public Double getShadeIntensity() {
        return shadeIntensity;
    }

    public void setShadeIntensity(Double shadeIntensity) {
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

    public Double getOpacityFrom() {
        return opacityFrom;
    }

    public void setOpacityFrom(Double opacityFrom) {
        this.opacityFrom = opacityFrom;
    }

    public Double getOpacityTo() {
        return opacityTo;
    }

    public void setOpacityTo(Double opacityTo) {
        this.opacityTo = opacityTo;
    }

    public List<Double> getStops() {
        return stops;
    }

    public void setStops(List<Double> stops) {
        this.stops = stops;
    }
}
