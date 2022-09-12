package com.github.appreciated.apexcharts.examples.heatmap;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.builder.DataLabelsBuilder;
import com.github.appreciated.apexcharts.config.builder.XAxisBuilder;
import com.github.appreciated.apexcharts.config.builder.YAxisBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.xaxis.XAxisType;
import com.github.appreciated.apexcharts.helper.Coordinate;
import com.github.appreciated.apexcharts.helper.Series;

public class HeatmapChartExample extends ApexChartsBuilder {
    public HeatmapChartExample() {
        withChart(
                ChartBuilder.get()
                        .withType(Type.HEATMAP)
                        .build())
                .withDataLabels(DataLabelsBuilder.get()
                        .withEnabled(false)
                        .build())
                .withSeries(new Series<Coordinate>("Metric 1",
                        new Coordinate<>("w1", 10.0), new Coordinate<>("w2", 20.0), new Coordinate<>("w3", 30.0),
                        new Coordinate<>("w4", 40.0), new Coordinate<>("w5", 50.0), new Coordinate<>("w6", 60.0),
                        new Coordinate<>("w7", 70.0), new Coordinate<>("w8", 80.0), new Coordinate<>("w9", 90.0)
                ), new Series<Coordinate>("Metric 2",
                        new Coordinate<>("w1", 10.0), new Coordinate<>("w2", 20.0), new Coordinate<>("w3", 30.0),
                        new Coordinate<>("w4", 40.0), new Coordinate<>("w5", 50.0), new Coordinate<>("w6", 60.0),
                        new Coordinate<>("w7", 70.0), new Coordinate<>("w8", 80.0), new Coordinate<>("w9", 90.0)
                ), new Series<Coordinate>("Metric 3",
                        new Coordinate<>("w1", 10.0), new Coordinate<>("w2", 20.0), new Coordinate<>("w3", 30.0),
                        new Coordinate<>("w4", 40.0), new Coordinate<>("w5", 50.0), new Coordinate<>("w6", 60.0),
                        new Coordinate<>("w7", 70.0), new Coordinate<>("w8", 80.0), new Coordinate<>("w9", 90.0)
                ))
                .withXaxis(XAxisBuilder.get().withType(XAxisType.NUMERIC).build())
                .withYaxis(YAxisBuilder.get().withMax(70.0).build());
    }
}
