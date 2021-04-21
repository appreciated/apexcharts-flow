package com.github.appreciated.apexcharts.config.plotoptions.heatmap.builder;

import com.github.appreciated.apexcharts.config.plotoptions.heatmap.ColorScale;
import com.github.appreciated.apexcharts.config.plotoptions.heatmap.Ranges;

import java.util.Arrays;
import java.util.List;

public class ColorScaleBuilder {
    private List<Ranges> ranges;
    private Boolean inverse;
    private Double min;
    private Double max;

    private ColorScaleBuilder() {
    }

    public static ColorScaleBuilder get() {
        return new ColorScaleBuilder();
    }

    public ColorScaleBuilder withRanges(List<Ranges> ranges) {
        this.ranges = ranges;
        return this;
    }

    public ColorScaleBuilder withRanges(Ranges... ranges) {
        this.ranges = Arrays.asList(ranges);
        return this;
    }

    public ColorScaleBuilder withInverse(Boolean inverse) {
        this.inverse = inverse;
        return this;
    }

    public ColorScaleBuilder withMin(Double min) {
        this.min = min;
        return this;
    }

    public ColorScaleBuilder withMax(Double max) {
        this.max = max;
        return this;
    }

    public ColorScale build() {
        ColorScale colorScale = new ColorScale();
        colorScale.setRanges(ranges);
        colorScale.setInverse(inverse);
        colorScale.setMin(min);
        colorScale.setMax(max);
        return colorScale;
    }
}
