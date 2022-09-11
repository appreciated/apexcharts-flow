package com.github.appreciated.apexcharts.examples.mixed;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.*;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.builder.ZoomBuilder;
import com.github.appreciated.apexcharts.config.legend.HorizontalAlign;
import com.github.appreciated.apexcharts.config.series.SeriesType;
import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.config.subtitle.Align;
import com.github.appreciated.apexcharts.config.xaxis.XAxisType;
import com.github.appreciated.apexcharts.helper.Series;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LineAndAreaChartExample extends ApexChartsBuilder {
    public LineAndAreaChartExample() {
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
                .withStroke(StrokeBuilder.get().withCurve(Curve.STRAIGHT).build())
                .withSeries(
                        new Series<>("INDEX XYZ", SeriesType.AREA, 30.0, 24.0, 28.0, 20.0, 32.0, 48.0, 88.0, 72.0, 68.0),
                        new Series<>("STOCK ABC", SeriesType.LINE, 10.0, 41.0, 35.0, 51.0, 49.0, 62.0, 69.0, 91.0, 148.0))
                .withFill(FillBuilder.get()
                        .withType("solid")
                        .withOpacity(0.35, 1.0)
                        .build())
                .withSubtitle(TitleSubtitleBuilder.get()
                        .withText("Price Movements")
                        .withAlign(Align.LEFT).build())
                .withLabels(IntStream.range(1, 10).boxed().map(day -> LocalDate.of(2000, 1, day).toString()).toArray(String[]::new))
                .withXaxis(XAxisBuilder.get()
                        .withType(XAxisType.DATETIME).build())
                .withYaxis(YAxisBuilder.get()
                        .withOpposite(true).build())
                .withLegend(LegendBuilder.get().withHorizontalAlign(HorizontalAlign.LEFT).build());
    }
}
