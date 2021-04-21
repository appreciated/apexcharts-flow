package com.github.appreciated.apexcharts.config.plotoptions.radialbar.builder;

import com.github.appreciated.apexcharts.config.plotoptions.radialbar.Name;

public class NameBuilder {
    private Boolean show;
    private String fontSize;
    private String color;
    private Double offsetY;

    private NameBuilder() {
    }

    public static NameBuilder get() {
        return new NameBuilder();
    }

    public NameBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public NameBuilder withFontSize(String fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public NameBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public NameBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public Name build() {
        Name name = new Name();
        name.setShow(show);
        name.setFontSize(fontSize);
        name.setColor(color);
        name.setOffsetY(offsetY);
        return name;
    }
}
