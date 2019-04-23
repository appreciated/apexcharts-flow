package com.github.appreciated.apexcharts.config.fill;

import java.util.List;

public class Gradient {
    private String shade;
    private String type;
    private Double shadeIntensity;
    private List<String> gradientToColors;
    private Boolean inverseColors;
    private Double opacityFrom;
    private Double opacityTo;
    private List<Double> stops;


    public Gradient() {
    }

    public String getShade() {
        return shade;
    }

    public String getType() {
        return type;
    }

    public Double getShadeIntensity() {
        return shadeIntensity;
    }

    public List<String> getGradientToColors() {
        return gradientToColors;
    }

    public Boolean getInverseColors() {
        return inverseColors;
    }

    public Double getOpacityFrom() {
        return opacityFrom;
    }

    public Double getOpacityTo() {
        return opacityTo;
    }

    public List<Double> getStops() {
        return stops;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setShadeIntensity(Double shadeIntensity) {
        this.shadeIntensity = shadeIntensity;
    }

    public void setGradientToColors(List<String> gradientToColors) {
        this.gradientToColors = gradientToColors;
    }

    public void setInverseColors(Boolean inverseColors) {
        this.inverseColors = inverseColors;
    }

    public void setOpacityFrom(Double opacityFrom) {
        this.opacityFrom = opacityFrom;
    }

    public void setOpacityTo(Double opacityTo) {
        this.opacityTo = opacityTo;
    }

    public void setStops(List<Double> stops) {
        this.stops = stops;
    }

}
