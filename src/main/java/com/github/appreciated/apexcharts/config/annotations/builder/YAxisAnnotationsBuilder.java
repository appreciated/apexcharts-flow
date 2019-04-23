package com.github.appreciated.apexcharts.config.annotations.builder;

import com.github.appreciated.apexcharts.config.annotations.AnnotationLabel;
import com.github.appreciated.apexcharts.config.annotations.YAxisAnnotations;

public class YAxisAnnotationsBuilder {
    private Double y;
    private Double y2;
    private Double strokeDashArray;
    private String fillColor;
    private String borderColor;
    private Double opacity;
    private Double offsetX;
    private Double offsetY;
    private Double yAxisIndex;
    private AnnotationLabel label;

    private YAxisAnnotationsBuilder() {
    }

    public static YAxisAnnotationsBuilder get() {
        return new YAxisAnnotationsBuilder();
    }

    public YAxisAnnotationsBuilder withY(Double y) {
        this.y = y;
        return this;
    }

    public YAxisAnnotationsBuilder withY2(Double y2) {
        this.y2 = y2;
        return this;
    }

    public YAxisAnnotationsBuilder withStrokeDashArray(Double strokeDashArray) {
        this.strokeDashArray = strokeDashArray;
        return this;
    }

    public YAxisAnnotationsBuilder withFillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public YAxisAnnotationsBuilder withBorderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public YAxisAnnotationsBuilder withOpacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    public YAxisAnnotationsBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public YAxisAnnotationsBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public YAxisAnnotationsBuilder withYAxisIndex(Double yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }

    public YAxisAnnotationsBuilder withLabel(AnnotationLabel label) {
        this.label = label;
        return this;
    }

    public YAxisAnnotations build() {
        YAxisAnnotations yAxisAnnotations = new YAxisAnnotations();
        yAxisAnnotations.setY(y);
        yAxisAnnotations.setY2(y2);
        yAxisAnnotations.setStrokeDashArray(strokeDashArray);
        yAxisAnnotations.setFillColor(fillColor);
        yAxisAnnotations.setBorderColor(borderColor);
        yAxisAnnotations.setOpacity(opacity);
        yAxisAnnotations.setOffsetX(offsetX);
        yAxisAnnotations.setOffsetY(offsetY);
        yAxisAnnotations.setYAxisIndex(yAxisIndex);
        yAxisAnnotations.setLabel(label);
        return yAxisAnnotations;
    }
}
