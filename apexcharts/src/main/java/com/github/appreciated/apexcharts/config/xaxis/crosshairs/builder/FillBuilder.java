package com.github.appreciated.apexcharts.config.xaxis.crosshairs.builder;

import com.github.appreciated.apexcharts.config.xaxis.crosshairs.Fill;
import com.github.appreciated.apexcharts.config.xaxis.crosshairs.Gradient;

public class FillBuilder {
    private String type;
    private String color;
    private Gradient gradient;

    private FillBuilder() {
    }

    public static FillBuilder get() {
        return new FillBuilder();
    }

    public FillBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public FillBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public FillBuilder withGradient(Gradient gradient) {
        this.gradient = gradient;
        return this;
    }

    public Fill build() {
        Fill fill = new Fill();
        fill.setType(type);
        fill.setColor(color);
        fill.setGradient(gradient);
        return fill;
    }
}
