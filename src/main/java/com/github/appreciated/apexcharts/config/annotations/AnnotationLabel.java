package com.github.appreciated.apexcharts.config.annotations;

public class AnnotationLabel {
    private String borderColor;
    private Double borderWidth;
    private String text;
    private String textAnchor;
    private Double offsetX;
    private Double offsetY;
    private AnnotationStyle style;
    private String position;
    private String orientation;


    public AnnotationLabel() {
    }

    public String getBorderColor() {
        return borderColor;
    }

    public Double getBorderWidth() {
        return borderWidth;
    }

    public String getText() {
        return text;
    }

    public String getTextAnchor() {
        return textAnchor;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public AnnotationStyle getStyle() {
        return style;
    }

    public String getPosition() {
        return position;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void setBorderWidth(Double borderWidth) {
        this.borderWidth = borderWidth;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTextAnchor(String textAnchor) {
        this.textAnchor = textAnchor;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public void setStyle(AnnotationStyle style) {
        this.style = style;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

}