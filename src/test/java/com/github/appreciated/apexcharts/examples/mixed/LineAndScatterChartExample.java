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

public class LineAndScatterChartExample extends ApexChartsBuilder {

    public LineAndScatterChartExample() {
        withChart(
                ChartBuilder.get()
                        .withType(Type.line)
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
                        .withType(XAxisType.numeric)
                        .withMin(0.0)
                        .withMax(12.0)
                        .withTickAmount(12.0)
                        .build())
                .withStroke(StrokeBuilder.get().withCurve(Curve.straight).build())
                .withSeries(new Series<>("Points", SeriesType.scatter,
                                new Coordinate<>(1, 2.14),
                                new Coordinate<>(1.2, 2.19),
                                new Coordinate<>(1.8, 2.43),
                                new Coordinate<>(2.3, 3.8),
                                new Coordinate<>(2.6, 4.14),
                                new Coordinate<>(2.9, 5.4),
                                new Coordinate<>(3.2, 5.8),
                                new Coordinate<>(3.8, 6.04),
                                new Coordinate<>(4.55, 6.77),
                                new Coordinate<>(4.9, 8.1),
                                new Coordinate<>(5.1, 9.4),
                                new Coordinate<>(7.1, 7.14),
                                new Coordinate<>(9.18, 8.4)
                        ),
                        new Series<>("Line", SeriesType.line,
                                new Coordinate<>(1, 2),
                                new Coordinate<>(2, 3),
                                new Coordinate<>(3, 4),
                                new Coordinate<>(4, 5),
                                new Coordinate<>(5, 6),
                                new Coordinate<>(6, 7),
                                new Coordinate<>(7, 8),
                                new Coordinate<>(8, 9),
                                new Coordinate<>(9, 10),
                                new Coordinate<>(10, 11)
                        ))
                .withDebug(true);
    }
}
