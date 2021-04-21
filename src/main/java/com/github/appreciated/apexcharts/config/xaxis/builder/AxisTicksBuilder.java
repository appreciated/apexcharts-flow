package com.github.appreciated.apexcharts.config.xaxis.builder;

import com.github.appreciated.apexcharts.config.xaxis.AxisTicks;

public class AxisTicksBuilder {
    private Boolean show;
    private String borderType;
    private String color;
    private Double height;
    private Double offsetX;
    private Double offsetY;

    private AxisTicksBuilder() {
    }

    public static AxisTicksBuilder get() {
        return new AxisTicksBuilder();
    }

    public AxisTicksBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public AxisTicksBuilder withBorderType(String borderType) {
        this.borderType = borderType;
        return this;
    }

    public AxisTicksBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public AxisTicksBuilder withHeight(Double height) {
        this.height = height;
        return this;
    }

    public AxisTicksBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public AxisTicksBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public AxisTicks build() {
        AxisTicks axisTicks = new AxisTicks();
        axisTicks.setShow(show);
        axisTicks.setBorderType(borderType);
        axisTicks.setColor(color);
        axisTicks.setHeight(height);
        axisTicks.setOffsetX(offsetX);
        axisTicks.setOffsetY(offsetY);
        return axisTicks;
    }
}
