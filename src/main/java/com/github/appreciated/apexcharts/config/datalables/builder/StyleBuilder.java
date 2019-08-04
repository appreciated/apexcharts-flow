package com.github.appreciated.apexcharts.config.datalables.builder;

import com.github.appreciated.apexcharts.config.datalables.Style;

import java.util.List;

public class StyleBuilder {
    private String fontSize;
    private String fontFamily;
    private List<String> colors;

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

    public StyleBuilder withColors(List<String> colors) {
        this.colors = colors;
        return this;
    }

    public Style build() {
        Style style = new Style();
        style.setFontSize(fontSize);
        style.setFontFamily(fontFamily);
        style.setColors(colors);
        return style;
    }
}
