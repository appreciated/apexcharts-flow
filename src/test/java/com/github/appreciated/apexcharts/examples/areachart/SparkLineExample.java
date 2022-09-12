package com.github.appreciated.apexcharts.examples.areachart;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.builder.DataLabelsBuilder;
import com.github.appreciated.apexcharts.config.builder.StrokeBuilder;
import com.github.appreciated.apexcharts.config.builder.YAxisBuilder;
import com.github.appreciated.apexcharts.config.chart.Sparkline;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.builder.ZoomBuilder;
import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.helper.Series;

public class SparkLineExample extends ApexChartsBuilder {
    public SparkLineExample() {
        withChart(
                ChartBuilder.get()
                        .withType(Type.AREA)
                        .withZoom(ZoomBuilder.get()
                                .withEnabled(false)
                                .build())
                        .withSparkline(new Sparkline(true))
                        .build())
                .withDataLabels(DataLabelsBuilder.get()
                        .withEnabled(false)
                        .build())
                .withStroke(StrokeBuilder.get().withCurve(Curve.STRAIGHT).build())
                .withSeries(new Series<>(10.0, 41.0, 35.0, 51.0, 49.0, 62.0, 69.0, 91.0, 148.0))
                .withYaxis(YAxisBuilder.get()
                        .withMin(0.0).build());
    }
}
