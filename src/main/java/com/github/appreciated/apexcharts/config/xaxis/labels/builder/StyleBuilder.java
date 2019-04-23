package com.github.appreciated.apexcharts.config.xaxis.labels.builder;

import com.github.appreciated.apexcharts.config.xaxis.labels.Style;

import java.util.List;

public class StyleBuilder {
    private List<String> colors;
    private String fontSize;
    private String fontFamily;
    private String cssClass;

    private StyleBuilder() {
    }

    public static StyleBuilder get() {
        return new StyleBuilder();
    }

    public StyleBuilder withColors(List<String> colors) {
        this.colors = colors;
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

    public StyleBuilder withCssClass(String cssClass) {
        this.cssClass = cssClass;
        return this;
    }

    public Style build() {
        Style style = new Style();
        style.setColors(colors);
        style.setFontSize(fontSize);
        style.setFontFamily(fontFamily);
        style.setCssClass(cssClass);
        return style;
    }
}
