package com.github.appreciated.apexcharts.config.subtitle.builder;

import com.github.appreciated.apexcharts.config.subtitle.Style;

public class StyleBuilder {
    private String fontSize;
    private String color;

    private StyleBuilder() {
    }

    public static StyleBuilder get() {
        return new StyleBuilder();
    }

    public StyleBuilder withFontSize(String fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public StyleBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public Style build() {
        Style style = new Style();
        style.setFontSize(fontSize);
        style.setColor(color);
        return style;
    }
}
