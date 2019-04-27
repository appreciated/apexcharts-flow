package com.github.appreciated.apexcharts.config.yaxis.builder;

import com.github.appreciated.apexcharts.config.yaxis.AxisTicks;

public class AxisTicksBuilder {
    private Boolean show;
    private String color;
    private Number width;
    private Number offsetX;
    private Number offsetY;

    private AxisTicksBuilder() {
    }

    public static AxisTicksBuilder get() {
        return new AxisTicksBuilder();
    }

    public AxisTicksBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public AxisTicksBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public AxisTicksBuilder withWidth(Number width) {
        this.width = width;
        return this;
    }

    public AxisTicksBuilder withOffsetX(Number offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public AxisTicksBuilder withOffsetY(Number offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public AxisTicks build() {
        AxisTicks axisTicks = new AxisTicks();
        axisTicks.setShow(show);
        axisTicks.setColor(color);
        axisTicks.setWidth(width);
        axisTicks.setOffsetX(offsetX);
        axisTicks.setOffsetY(offsetY);
        return axisTicks;
    }
}
