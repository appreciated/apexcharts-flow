package com.github.appreciated.apexcharts.config.chart.selection.builder;

import com.github.appreciated.apexcharts.config.chart.selection.Xaxis;

public class XaxisBuilder {
    private Double min;
    private Double max;

    private XaxisBuilder() {
    }

    public static XaxisBuilder get() {
        return new XaxisBuilder();
    }

    public XaxisBuilder withMin(Double min) {
        this.min = min;
        return this;
    }

    public XaxisBuilder withMax(Double max) {
        this.max = max;
        return this;
    }

    public Xaxis build() {
        Xaxis xaxis = new Xaxis();
        xaxis.setMin(min);
        xaxis.setMax(max);
        return xaxis;
    }
}
