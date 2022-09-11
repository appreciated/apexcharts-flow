package com.github.appreciated.apexcharts.examples.radialbar;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;

public class MultiRadialBarChartExample extends ApexChartsBuilder {
    public MultiRadialBarChartExample() {
        withChart(ChartBuilder.get()
                .withType(Type.RADIALBAR)
                .build())
                .withSeries(44.0, 55.0, 67.0, 83.0)
                .withLabels("Apples", "Oranges", "Bananas", "Berries");
    }
}
