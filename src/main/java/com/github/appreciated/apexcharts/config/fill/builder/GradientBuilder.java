package com.github.appreciated.apexcharts.config.fill.builder;

import com.github.appreciated.apexcharts.config.fill.Gradient;

import java.util.Arrays;
import java.util.List;

public class GradientBuilder {
    private String shade;
    private String type;
    private Double shadeIntensity;
    private List<String> gradientToColors;
    private Boolean inverseColors;
    private Double opacityFrom;
    private Double opacityTo;
    private List<Double> stops;

    private GradientBuilder() {
    }

    public static GradientBuilder get() {
        return new GradientBuilder();
    }

    public GradientBuilder withShade(String shade) {
        this.shade = shade;
        return this;
    }

    public GradientBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public GradientBuilder withShadeIntensity(Double shadeIntensity) {
        this.shadeIntensity = shadeIntensity;
        return this;
    }

    public GradientBuilder withGradientToColors(List<String> gradientToColors) {
        this.gradientToColors = gradientToColors;
        return this;
    }

    public GradientBuilder withGradientToColors(String... gradientToColors) {
        this.gradientToColors = Arrays.asList(gradientToColors);
        return this;
    }

    public GradientBuilder withInverseColors(Boolean inverseColors) {
        this.inverseColors = inverseColors;
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

    public GradientBuilder withStops(List<Double> stops) {
        this.stops = stops;
        return this;
    }

    public GradientBuilder withStops(Double... stops) {
        this.stops = Arrays.asList(stops);
        return this;
    }

    public Gradient build() {
        Gradient gradient = new Gradient();
        gradient.setShade(shade);
        gradient.setType(type);
        gradient.setShadeIntensity(shadeIntensity);
        gradient.setGradientToColors(gradientToColors);
        gradient.setInverseColors(inverseColors);
        gradient.setOpacityFrom(opacityFrom);
        gradient.setOpacityTo(opacityTo);
        gradient.setStops(stops);
        return gradient;
    }
}
