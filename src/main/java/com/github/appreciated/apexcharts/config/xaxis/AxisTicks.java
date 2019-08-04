package com.github.appreciated.apexcharts.config.xaxis;

public class AxisTicks {
    private Boolean show;
    private String borderType;
    private String color;
    private Double height;
    private Double offsetX;
    private Double offsetY;


    public AxisTicks() {
    }

    public Boolean getShow() {
        return show;
    }

    public String getBorderType() {
        return borderType;
    }

    public String getColor() {
        return color;
    }

    public Double getHeight() {
        return height;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setBorderType(String borderType) {
        this.borderType = borderType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

}
