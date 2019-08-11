package com.github.appreciated.apexcharts.config.annotations;

public class XAxisAnnotations {
    private Object x;
    private Object x2;

    private Double strokeDashArray;
    private String fillColor;
    private String borderColor;
    private Double opacity;
    private Double offsetX;
    private Double offsetY;
    private Label label;

    public XAxisAnnotations() {
    }

    public Object getX() {
        return x;
    }

    public Object getX2() {
        return x2;
    }

    public Double getStrokeDashArray() {
        return strokeDashArray;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public Double getOpacity() {
        return opacity;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public Label getLabel() {
        return label;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setX2(Double x2) {
        this.x2 = x2;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public void setX2(Object x2) {
        this.x2 = x2;
    }

    public void setStrokeDashArray(Double strokeDashArray) {
        this.strokeDashArray = strokeDashArray;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

}
