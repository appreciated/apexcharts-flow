package com.github.appreciated.apexcharts.config.yaxis.builder;

import com.github.appreciated.apexcharts.config.yaxis.AxisBorder;

public class AxisBorderBuilder {
    private Boolean show;
    private String color;
    private Number offsetX;
    private Number offsetY;

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

    public AxisBorderBuilder withOffsetX(Number offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public AxisBorderBuilder withOffsetY(Number offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public AxisBorder build() {
        AxisBorder axisBorder = new AxisBorder();
        axisBorder.setShow(show);
        axisBorder.setColor(color);
        axisBorder.setOffsetX(offsetX);
        axisBorder.setOffsetY(offsetY);
        return axisBorder;
    }
}
