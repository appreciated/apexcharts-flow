package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.Fill;
import com.github.appreciated.apexcharts.config.fill.Gradient;
import com.github.appreciated.apexcharts.config.fill.Image;
import com.github.appreciated.apexcharts.config.fill.Pattern;

import java.util.List;

public class FillBuilder {
    private List<String> colors;
    private Double[] opacity;
    private String[] type;
    private Gradient gradient;
    private Image[] image;
    private Pattern[] pattern;

    private FillBuilder() {
    }

    public static FillBuilder get() {
        return new FillBuilder();
    }

    public FillBuilder withColors(List<String> colors) {
        this.colors = colors;
        return this;
    }

    public FillBuilder withOpacity(Double... opacity) {
        this.opacity = opacity;
        return this;
    }

    public FillBuilder withType(String... type) {
        this.type = type;
        return this;
    }

    public FillBuilder withGradient(Gradient gradient) {
        this.gradient = gradient;
        return this;
    }

    public FillBuilder withImage(Image... image) {
        this.image = image;
        return this;
    }

    public FillBuilder withPattern(Pattern... pattern) {
        this.pattern = pattern;
        return this;
    }

    public Fill build() {
        Fill fill = new Fill();
        fill.setColors(colors);
        fill.setOpacity(opacity);
        fill.setType(type);
        fill.setGradient(gradient);
        fill.setImage(image);
        fill.setPattern(pattern);
        return fill;
    }
}
