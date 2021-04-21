package com.github.appreciated.apexcharts.config.plotoptions.bar.builder;

import com.github.appreciated.apexcharts.config.plotoptions.bar.Ranges;

public class RangesBuilder {
    private Double from;
    private Double to;
    private String color;

    private RangesBuilder() {
    }

    public static RangesBuilder get() {
        return new RangesBuilder();
    }

    public RangesBuilder withFrom(Double from) {
        this.from = from;
        return this;
    }

    public RangesBuilder withTo(Double to) {
        this.to = to;
        return this;
    }

    public RangesBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public Ranges build() {
        Ranges ranges = new Ranges();
        ranges.setFrom(from);
        ranges.setTo(to);
        ranges.setColor(color);
        return ranges;
    }
}
