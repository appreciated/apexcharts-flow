package com.github.appreciated.apexcharts.config.xaxis.title.builder;

import com.github.appreciated.apexcharts.config.xaxis.title.Style;

public class StyleBuilder {
    private String color;
    private String fontSize;
    private String cssClass;

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

    public StyleBuilder withCssClass(String cssClass) {
        this.cssClass = cssClass;
        return this;
    }

    public Style build() {
        Style style = new Style();
        style.setColor(color);
        style.setFontSize(fontSize);
        style.setCssClass(cssClass);
        return style;
    }
}
