package com.github.appreciated.apexcharts.config.annotations.builder;

import com.github.appreciated.apexcharts.config.annotations.AnnotationStyle;
import com.github.appreciated.apexcharts.config.annotations.Label;

public class LabelBuilder {
    private String borderColor;
    private Double borderWidth;
    private String text;
    private String textAnchor;
    private String position;
    private String orientation;
    private Double offsetX;
    private Double offsetY;
    private AnnotationStyle style;

    private LabelBuilder() {
    }

    public static LabelBuilder get() {
        return new LabelBuilder();
    }

    public LabelBuilder withBorderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public LabelBuilder withBorderWidth(Double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public LabelBuilder withText(String text) {
        this.text = text;
        return this;
    }

    public LabelBuilder withTextAnchor(String textAnchor) {
        this.textAnchor = textAnchor;
        return this;
    }

    public LabelBuilder withPosition(String position) {
        this.position = position;
        return this;
    }

    public LabelBuilder withOrientation(String orientation) {
        this.orientation = orientation;
        return this;
    }

    public LabelBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public LabelBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public LabelBuilder withStyle(AnnotationStyle style) {
        this.style = style;
        return this;
    }

    public Label build() {
        Label label = new Label();
        label.setBorderColor(borderColor);
        label.setBorderWidth(borderWidth);
        label.setText(text);
        label.setTextAnchor(textAnchor);
        label.setPosition(position);
        label.setOrientation(orientation);
        label.setOffsetX(offsetX);
        label.setOffsetY(offsetY);
        label.setStyle(style);
        return label;
    }
}
