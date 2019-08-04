package com.github.appreciated.apexcharts.config.annotations;

public class YAxisAnnotations {
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

    public YAxisAnnotations() {
    }

    public Double getyAxisIndex() {
        return yAxisIndex;
    }

    public void setyAxisIndex(Double yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }


    public Double getY() {
        return y;
    }

    public Double getY2() {
        return y2;
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

    public Double getYAxisIndex() {
        return yAxisIndex;
    }

    public AnnotationLabel getLabel() {
        return label;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void setY2(Double y2) {
        this.y2 = y2;
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

    public void setYAxisIndex(Double yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }

    public void setLabel(AnnotationLabel label) {
        this.label = label;
    }

}
