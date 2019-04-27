package com.github.appreciated.apexcharts.config.tooltip.builder;

import com.github.appreciated.apexcharts.config.tooltip.Style;

public class StyleBuilder {
    private String fontSize;
    private String fontFamily;

    private StyleBuilder() {
    }

    public static StyleBuilder get() {
        return new StyleBuilder();
    }

    public StyleBuilder withFontSize(String fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public StyleBuilder withFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public Style build() {
        Style style = new Style();
        style.setFontSize(fontSize);
        style.setFontFamily(fontFamily);
        return style;
    }
}
