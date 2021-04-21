package com.github.appreciated.apexcharts.config.xaxis.crosshairs.builder;

import com.github.appreciated.apexcharts.config.xaxis.crosshairs.Gradient;

import java.util.List;

public class GradientBuilder {
    private String colorFrom;
    private String colorTo;
    private List<Double> stops;
    private Double opacityFrom;
    private Double opacityTo;

    private GradientBuilder() {
    }

    public static GradientBuilder get() {
        return new GradientBuilder();
    }

    public GradientBuilder withColorFrom(String colorFrom) {
        this.colorFrom = colorFrom;
        return this;
    }

    public GradientBuilder withColorTo(String colorTo) {
        this.colorTo = colorTo;
        return this;
    }

    public GradientBuilder withStops(List<Double> stops) {
        this.stops = stops;
        return this;
    }

    public GradientBuilder withOpacityFrom(Double opacityFrom) {
        this.opacityFrom = opacityFrom;
        return this;
    }

    public GradientBuilder withOpacityTo(Double opacityTo) {
        this.opacityTo = opacityTo;
        return this;
    }

    public Gradient build() {
        Gradient gradient = new Gradient();
        gradient.setColorFrom(colorFrom);
        gradient.setColorTo(colorTo);
        gradient.setStops(stops);
        gradient.setOpacityFrom(opacityFrom);
        gradient.setOpacityTo(opacityTo);
        return gradient;
    }
}
