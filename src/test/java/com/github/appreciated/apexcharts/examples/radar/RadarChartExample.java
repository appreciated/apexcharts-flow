package com.github.appreciated.apexcharts.examples.radar;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.helper.Series;

public class RadarChartExample extends ApexChartsBuilder {
    public RadarChartExample() {
        withChart(ChartBuilder.get()
                .withType(Type.RADAR)
                .build())
                .withSeries(new Series<>("Series 1", 80, 50, 30, 40, 100, 20))
                .withLabels("January", "February", "March", "April", "May", "June");
    }
}
