package com.github.appreciated.apexcharts.config.annotations.builder;

import com.github.appreciated.apexcharts.config.annotations.Label;
import com.github.appreciated.apexcharts.config.annotations.XAxisAnnotations;

public class XAxisAnnotationsBuilder {
    private Object x;
    private Object x2;
    private Double strokeDashArray;
    private String fillColor;
    private String borderColor;
    private Double opacity;
    private Double offsetX;
    private Double offsetY;
    private Label label;

    private XAxisAnnotationsBuilder() {
    }

    public static XAxisAnnotationsBuilder get() {
        return new XAxisAnnotationsBuilder();
    }

    public XAxisAnnotationsBuilder withX(Double x) {
        this.x = x;
        return this;
    }

    public XAxisAnnotationsBuilder withX2(Double x2) {
        this.x2 = x2;
        return this;
    }

    public XAxisAnnotationsBuilder withX(Object x) {
        this.x = x;
        return this;
    }

    public XAxisAnnotationsBuilder withX2(Object x2) {
        this.x2 = x2;
        return this;
    }

    public XAxisAnnotationsBuilder withStrokeDashArray(Double strokeDashArray) {
        this.strokeDashArray = strokeDashArray;
        return this;
    }

    public XAxisAnnotationsBuilder withFillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public XAxisAnnotationsBuilder withBorderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public XAxisAnnotationsBuilder withOpacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    public XAxisAnnotationsBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public XAxisAnnotationsBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public XAxisAnnotationsBuilder withLabel(Label label) {
        this.label = label;
        return this;
    }

    public XAxisAnnotations build() {
        XAxisAnnotations xAxisAnnotations = new XAxisAnnotations();
        xAxisAnnotations.setX(x);
        xAxisAnnotations.setX2(x2);
        xAxisAnnotations.setStrokeDashArray(strokeDashArray);
        xAxisAnnotations.setFillColor(fillColor);
        xAxisAnnotations.setBorderColor(borderColor);
        xAxisAnnotations.setOpacity(opacity);
        xAxisAnnotations.setOffsetX(offsetX);
        xAxisAnnotations.setOffsetY(offsetY);
        xAxisAnnotations.setLabel(label);
        return xAxisAnnotations;
    }
}
