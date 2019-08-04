package com.github.appreciated.apexcharts.config.theme.builder;

import com.github.appreciated.apexcharts.config.theme.Monochrome;
import com.github.appreciated.apexcharts.config.theme.ShadeTo;

public class MonochromeBuilder {
    private Boolean enabled;
    private String color;
    private ShadeTo shadeTo;
    private Double shadeIntensity;

    private MonochromeBuilder() {
    }

    public static MonochromeBuilder get() {
        return new MonochromeBuilder();
    }

    public MonochromeBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public MonochromeBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public MonochromeBuilder withShadeTo(ShadeTo shadeTo) {
        this.shadeTo = shadeTo;
        return this;
    }

    public MonochromeBuilder withShadeIntensity(Double shadeIntensity) {
        this.shadeIntensity = shadeIntensity;
        return this;
    }

    public Monochrome build() {
        Monochrome monochrome = new Monochrome();
        monochrome.setEnabled(enabled);
        monochrome.setColor(color);
        monochrome.setShadeTo(shadeTo);
        monochrome.setShadeIntensity(shadeIntensity);
        return monochrome;
    }
}
