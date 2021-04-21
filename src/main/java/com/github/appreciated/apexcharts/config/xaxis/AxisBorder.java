package com.github.appreciated.apexcharts.config.xaxis;

public class AxisBorder {
    private Boolean show;
    private String color;
    private Double offsetX;
    private Double offsetY;
    private Double strokeWidth;


    public AxisBorder() {
    }

    public Boolean getShow() {
        return show;
    }

    public String getColor() {
        return color;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public Double getStrokeWidth() {
        return strokeWidth;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public void setStrokeWidth(Double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

}
