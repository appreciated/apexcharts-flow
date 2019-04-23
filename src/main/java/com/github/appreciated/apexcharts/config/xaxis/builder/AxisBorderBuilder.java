package com.github.appreciated.apexcharts.config.xaxis.builder;

import com.github.appreciated.apexcharts.config.xaxis.AxisBorder;

public class AxisBorderBuilder {
    private Boolean show;
    private String color;
    private Double offsetX;
    private Double offsetY;
    private Double strokeWidth;

    private AxisBorderBuilder() {
    }

    public static AxisBorderBuilder get() {
        return new AxisBorderBuilder();
    }

    public AxisBorderBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public AxisBorderBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public AxisBorderBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public AxisBorderBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public AxisBorderBuilder withStrokeWidth(Double strokeWidth) {
        this.strokeWidth = strokeWidth;
        return this;
    }

    public AxisBorder build() {
        AxisBorder axisBorder = new AxisBorder();
        axisBorder.setShow(show);
        axisBorder.setColor(color);
        axisBorder.setOffsetX(offsetX);
        axisBorder.setOffsetY(offsetY);
        axisBorder.setStrokeWidth(strokeWidth);
        return axisBorder;
    }
}
