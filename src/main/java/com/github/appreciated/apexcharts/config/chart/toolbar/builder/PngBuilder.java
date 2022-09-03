package com.github.appreciated.apexcharts.config.chart.toolbar.builder;

import com.github.appreciated.apexcharts.config.chart.toolbar.Png;

public class PngBuilder {
    private String filename;

    private PngBuilder() {
    }

    public static PngBuilder get() {
        return new PngBuilder();
    }

    public PngBuilder withFilename(String filename) {
        this.filename = filename;
        return this;
    }

    public Png build() {
        Png png = new Png();
        png.setFilename(filename);
        return png;
    }
}
