package com.github.appreciated.apexcharts.config.annotations.builder;

import com.github.appreciated.apexcharts.config.annotations.AnnotationLabel;
import com.github.appreciated.apexcharts.config.annotations.AnnotationStyle;

public class AnnotationLabelBuilder {
    private String borderColor;
    private Double borderWidth;
    private String text;
    private String textAnchor;
    private Double offsetX;
    private Double offsetY;
    private AnnotationStyle style;
    private String position;
    private String orientation;

    private AnnotationLabelBuilder() {
    }

    public static AnnotationLabelBuilder get() {
        return new AnnotationLabelBuilder();
    }

    public AnnotationLabelBuilder withBorderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public AnnotationLabelBuilder withBorderWidth(Double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public AnnotationLabelBuilder withText(String text) {
        this.text = text;
        return this;
    }

    public AnnotationLabelBuilder withTextAnchor(String textAnchor) {
        this.textAnchor = textAnchor;
        return this;
    }

    public AnnotationLabelBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public AnnotationLabelBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public AnnotationLabelBuilder withStyle(AnnotationStyle style) {
        this.style = style;
        return this;
    }

    public AnnotationLabelBuilder withPosition(String position) {
        this.position = position;
        return this;
    }

    public AnnotationLabelBuilder withOrientation(String orientation) {
        this.orientation = orientation;
        return this;
    }

    public AnnotationLabel build() {
        AnnotationLabel annotationLabel = new AnnotationLabel();
        annotationLabel.setBorderColor(borderColor);
        annotationLabel.setBorderWidth(borderWidth);
        annotationLabel.setText(text);
        annotationLabel.setTextAnchor(textAnchor);
        annotationLabel.setOffsetX(offsetX);
        annotationLabel.setOffsetY(offsetY);
        annotationLabel.setStyle(style);
        annotationLabel.setPosition(position);
        annotationLabel.setOrientation(orientation);
        return annotationLabel;
    }
}
