package com.github.appreciated.apexcharts.config.nodata.builder;

import com.github.appreciated.apexcharts.config.nodata.Style;

public class StyleBuilder {
    private String color;
    private String fontSize;
    private String fontFamily;

    private StyleBuilder() {
    }

    public static StyleBuilder get() {
        return new StyleBuilder();
    }

    public StyleBuilder withColor(String color) {
        this.color = color;
        return this;
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
        style.setColor(color);
        style.setFontSize(fontSize);
        style.setFontFamily(fontFamily);
        return style;
    }
}
