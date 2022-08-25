package com.github.appreciated.apexcharts.config.chart.toolbar.builder;

import com.github.appreciated.apexcharts.config.chart.toolbar.Svg;

public class SvgBuilder {
    private String filename;

    private SvgBuilder() {
    }

    public static SvgBuilder get() {
        return new SvgBuilder();
    }

    public SvgBuilder withFilename(String filename) {
        this.filename = filename;
        return this;
    }


    public Svg build() {
        Svg svg = new Svg();
        svg.setFilename(filename);
        return svg;
    }
}
