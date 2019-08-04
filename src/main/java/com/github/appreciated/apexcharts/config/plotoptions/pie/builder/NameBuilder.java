package com.github.appreciated.apexcharts.config.plotoptions.pie.builder;

import com.github.appreciated.apexcharts.config.plotoptions.pie.Name;

public class
NameBuilder {
    private Boolean show;
    private String fontSize;
    private String fontFamily;
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

    public NameBuilder withFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
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
        name.setFontFamily(fontFamily);
        name.setColor(color);
        name.setOffsetY(offsetY);
        return name;
    }
}
