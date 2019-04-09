package com.github.appreciated.apexcharts.config.chart;

public class AnnotationLabel {
    String borderColor;
    Number borderWidth;
    String text;
    String textAnchor;
    Number offsetX;
    Number offsetY;
    AnnotationStyle style;
    String position;
    String orientation;

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public Number getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Number borderWidth) {
        this.borderWidth = borderWidth;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextAnchor() {
        return textAnchor;
    }

    public void setTextAnchor(String textAnchor) {
        this.textAnchor = textAnchor;
    }

    public Number getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(Number offsetX) {
        this.offsetX = offsetX;
    }

    public Number getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(Number offsetY) {
        this.offsetY = offsetY;
    }

    public AnnotationStyle getStyle() {
        return style;
    }

    public void setStyle(AnnotationStyle style) {
        this.style = style;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
}