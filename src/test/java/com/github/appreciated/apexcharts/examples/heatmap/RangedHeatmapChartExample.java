package com.github.appreciated.apexcharts.examples.heatmap;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.builder.DataLabelsBuilder;
import com.github.appreciated.apexcharts.config.builder.PlotOptionsBuilder;
import com.github.appreciated.apexcharts.config.builder.XAxisBuilder;
import com.github.appreciated.apexcharts.config.builder.YAxisBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.plotoptions.builder.HeatmapBuilder;
import com.github.appreciated.apexcharts.config.plotoptions.heatmap.Ranges;
import com.github.appreciated.apexcharts.config.plotoptions.heatmap.builder.ColorScaleBuilder;
import com.github.appreciated.apexcharts.config.plotoptions.heatmap.builder.RangesBuilder;
import com.github.appreciated.apexcharts.config.xaxis.XAxisType;
import com.github.appreciated.apexcharts.helper.Coordinate;
import com.github.appreciated.apexcharts.helper.Series;

import java.util.ArrayList;
import java.util.List;

public class RangedHeatmapChartExample extends ApexChartsBuilder {
    public RangedHeatmapChartExample() {
        List<Ranges> ranges = new ArrayList<>();
        ranges.add(RangesBuilder.get().withFrom(0d).withTo(24d).withColor("#128FD9").withName("low").build());
        ranges.add(RangesBuilder.get().withFrom(25d).withTo(49d).withColor("#00A100").withName("medium").build());
        ranges.add(RangesBuilder.get().withFrom(50d).withTo(74d).withColor("#FFB200").withName("high").build());
        ranges.add(RangesBuilder.get().withFrom(75d).withTo(99d).withColor("#FF0000").withName("extreme").build());
        withChart(
                ChartBuilder.get()
                        .withType(Type.HEATMAP)
                        .build())
                .withDataLabels(DataLabelsBuilder.get()
                        .withEnabled(false)
                        .build())
                .withSeries(new Series<Coordinate>("Metric 1", new Coordinate<>("w0", 0.0),
                        new Coordinate<>("w1", 10.0), new Coordinate<>("w2", 20.0), new Coordinate<>("w3", 30.0),
                        new Coordinate<>("w4", 40.0), new Coordinate<>("w5", 50.0), new Coordinate<>("w6", 60.0),
                        new Coordinate<>("w7", 70.0), new Coordinate<>("w8", 80.0), new Coordinate<>("w9", 90.0)
                ), new Series<Coordinate>("Metric 2", new Coordinate<>("w0", 2.0),
                        new Coordinate<>("w1", 12.0), new Coordinate<>("w2", 22.0), new Coordinate<>("w3", 32.0),
                        new Coordinate<>("w4", 42.0), new Coordinate<>("w5", 52.0), new Coordinate<>("w6", 62.0),
                        new Coordinate<>("w7", 72.0), new Coordinate<>("w8", 82.0), new Coordinate<>("w9", 92.0)
                ), new Series<Coordinate>("Metric 3", new Coordinate<>("w0", 4.0),
                        new Coordinate<>("w1", 14.0), new Coordinate<>("w2", 24.0), new Coordinate<>("w3", 34.0),
                        new Coordinate<>("w4", 44.0), new Coordinate<>("w5", 54.0), new Coordinate<>("w6", 64.0),
                        new Coordinate<>("w7", 74.0), new Coordinate<>("w8", 84.0), new Coordinate<>("w9", 94.0)
                ), new Series<Coordinate>("Metric 4", new Coordinate<>("w0", 5.0),
                        new Coordinate<>("w1", 15.0), new Coordinate<>("w2", 25.0), new Coordinate<>("w3", 35.0),
                        new Coordinate<>("w4", 45.0), new Coordinate<>("w5", 55.0), new Coordinate<>("w6", 65.0),
                        new Coordinate<>("w7", 75.0), new Coordinate<>("w8", 85.0), new Coordinate<>("w9", 95.0)
                ), new Series<Coordinate>("Metric 5", new Coordinate<>("w0", 7.0),
                        new Coordinate<>("w1", 17.0), new Coordinate<>("w2", 27.0), new Coordinate<>("w3", 37.0),
                        new Coordinate<>("w4", 47.0), new Coordinate<>("w5", 57.0), new Coordinate<>("w6", 67.0),
                        new Coordinate<>("w7", 77.0), new Coordinate<>("w8", 87.0), new Coordinate<>("w9", 97.0)
                ), new Series<Coordinate>("Metric 6", new Coordinate<>("w0", 9.0),
                        new Coordinate<>("w1", 19.0), new Coordinate<>("w2", 29.0), new Coordinate<>("w3", 39.0),
                        new Coordinate<>("w4", 49.0), new Coordinate<>("w5", 59.0), new Coordinate<>("w6", 69.0),
                        new Coordinate<>("w7", 79.0), new Coordinate<>("w8", 89.0), new Coordinate<>("w9", 99.0)
                ))
                .withPlotOptions(PlotOptionsBuilder.get()
                        .withHeatmap(HeatmapBuilder.get()
                                .withColorScale(ColorScaleBuilder.get()
                                        .withRanges(ranges)
                                        .build())
                                .build())
                        .build())
                .withXaxis(XAxisBuilder.get().withType(XAxisType.CATEGORIES).build())
                .withYaxis(YAxisBuilder.get().build());
    }
}
