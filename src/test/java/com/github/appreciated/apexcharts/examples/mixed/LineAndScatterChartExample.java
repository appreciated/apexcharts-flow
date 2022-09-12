package com.github.appreciated.apexcharts.examples.mixed;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.*;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.builder.ZoomBuilder;
import com.github.appreciated.apexcharts.config.series.SeriesType;
import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.config.xaxis.XAxisType;
import com.github.appreciated.apexcharts.helper.Coordinate;
import com.github.appreciated.apexcharts.helper.Series;

import java.math.BigDecimal;

public class LineAndScatterChartExample extends ApexChartsBuilder {

    public LineAndScatterChartExample() {
        withChart(
                ChartBuilder.get()
                        .withType(Type.LINE)
                        .withZoom(ZoomBuilder.get()
                                .withEnabled(false)
                                .build())
                        .build())
                .withDataLabels(DataLabelsBuilder.get()
                        .withEnabled(false)
                        .build())
                .withFill(FillBuilder.get()
                        .withType("solid")
                        .build())
                .withMarkers(MarkersBuilder.get().withSize(6.0, 0.0).build())
                .withTooltip(TooltipBuilder.get()
                        .withShared(false)
                        .withIntersect(true)
                        .build())
                .withLegend(LegendBuilder.get().withShow(false).build())
                .withXaxis(XAxisBuilder.get()
                        .withType(XAxisType.NUMERIC)
                        .withMin(0.0)
                        .withMax(12.0)
                        .withTickAmount(new BigDecimal("12"))
                        .build())
                .withStroke(StrokeBuilder.get().withCurve(Curve.STRAIGHT).build())
                .withSeries(new Series<>("Points", SeriesType.SCATTER,
                                new Coordinate<>(new BigDecimal("1"), new BigDecimal("2.14")),
                                new Coordinate<>(new BigDecimal("1.2"), new BigDecimal("2.19")),
                                new Coordinate<>(new BigDecimal("1.8"), new BigDecimal("2.43")),
                                new Coordinate<>(new BigDecimal("2.3"), new BigDecimal("3.8")),
                                new Coordinate<>(new BigDecimal("2.6"), new BigDecimal("4.14")),
                                new Coordinate<>(new BigDecimal("2.9"), new BigDecimal("5.4")),
                                new Coordinate<>(new BigDecimal("3.2"), new BigDecimal("5.8")),
                                new Coordinate<>(new BigDecimal("3.8"), new BigDecimal("6.04")),
                                new Coordinate<>(new BigDecimal("4.55"), new BigDecimal("6.77")),
                                new Coordinate<>(new BigDecimal("4.9"), new BigDecimal("8.1")),
                                new Coordinate<>(new BigDecimal("5.1"), new BigDecimal("9.4")),
                                new Coordinate<>(new BigDecimal("7.1"), new BigDecimal("7.14")),
                                new Coordinate<>(new BigDecimal("9.18"), new BigDecimal("8.4"))
                        ),
                        new Series<>("Line", SeriesType.LINE,
                                new Coordinate<>(new BigDecimal("1"), new BigDecimal("2")),
                                new Coordinate<>(new BigDecimal("2"), new BigDecimal("3")),
                                new Coordinate<>(new BigDecimal("3"), new BigDecimal("4")),
                                new Coordinate<>(new BigDecimal("4"), new BigDecimal("5")),
                                new Coordinate<>(new BigDecimal("5"), new BigDecimal("6")),
                                new Coordinate<>(new BigDecimal("6"), new BigDecimal("7")),
                                new Coordinate<>(new BigDecimal("7"), new BigDecimal("8")),
                                new Coordinate<>(new BigDecimal("8"), new BigDecimal("9")),
                                new Coordinate<>(new BigDecimal("9"), new BigDecimal("10")),
                                new Coordinate<>(new BigDecimal("10"), new BigDecimal("11"))
                        ))
                .withDebug(true);
    }
}
