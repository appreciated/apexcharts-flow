package com.github.appreciated.apexcharts.config.chart.selection.builder;

import com.github.appreciated.apexcharts.config.chart.selection.Yaxis;

public class YaxisBuilder {
    private Double min;
    private Double max;

    private YaxisBuilder() {
    }

    public static YaxisBuilder get() {
        return new YaxisBuilder();
    }

    public YaxisBuilder withMin(Double min) {
        this.min = min;
        return this;
    }

    public YaxisBuilder withMax(Double max) {
        this.max = max;
        return this;
    }

    public Yaxis build() {
        Yaxis yaxis = new Yaxis();
        yaxis.setMin(min);
        yaxis.setMax(max);
        return yaxis;
    }
}
