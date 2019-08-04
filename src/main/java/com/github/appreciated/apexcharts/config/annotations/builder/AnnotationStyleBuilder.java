package com.github.appreciated.apexcharts.config.annotations.builder;

import com.github.appreciated.apexcharts.config.annotations.AnnotationStyle;
import com.github.appreciated.apexcharts.config.annotations.Padding;

public class AnnotationStyleBuilder {
    private String background;
    private String color;
    private String fontSize;
    private String cssClass;
    private Padding padding;

    private AnnotationStyleBuilder() {
    }

    public static AnnotationStyleBuilder get() {
        return new AnnotationStyleBuilder();
    }

    public AnnotationStyleBuilder withBackground(String background) {
        this.background = background;
        return this;
    }

    public AnnotationStyleBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public AnnotationStyleBuilder withFontSize(String fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public AnnotationStyleBuilder withCssClass(String cssClass) {
        this.cssClass = cssClass;
        return this;
    }

    public AnnotationStyleBuilder withPadding(Padding padding) {
        this.padding = padding;
        return this;
    }

    public AnnotationStyle build() {
        AnnotationStyle annotationStyle = new AnnotationStyle();
        annotationStyle.setBackground(background);
        annotationStyle.setColor(color);
        annotationStyle.setFontSize(fontSize);
        annotationStyle.setCssClass(cssClass);
        annotationStyle.setPadding(padding);
        return annotationStyle;
    }
}
