package com.github.appreciated.apexcharts.config.chart.builder;

import com.github.appreciated.apexcharts.config.chart.Sparkline;

public class SparklineBuilder {
    private Boolean enabled;

    private SparklineBuilder() {
    }

    public static SparklineBuilder get() {
        return new SparklineBuilder();
    }

    public SparklineBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Sparkline build() {
        Sparkline sparkline = new Sparkline();
        sparkline.setEnabled(enabled);
        return sparkline;
    }
}
