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

public class LineAndColumnChartExample extends ApexChartsBuilder {

    public LineAndColumnChartExample() {
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
                        new Series<>("Sales", SeriesType.COLUMN, 11.0, 14.0, 7.0, 2.0, 7.0, 15.0, 26.0, 19.0, 36.0),
                        new Series<>("INDEX XYZ", SeriesType.LINE, 30.0, 24.0, 28.0, 20.0, 32.0, 48.0, 88.0, 72.0, 68.0))
                .withFill(FillBuilder.get()
                        .withType("solid")
                        .withOpacity(1.0, 1.0)
                        .build())
                .withSubtitle(TitleSubtitleBuilder.get()
                        .withText("Price Movements")
                        .withAlign(Align.LEFT).build())
                .withLabels(IntStream.range(1, 10).boxed().map(day -> LocalDate.of(2000, 1, day).toString()).toArray(String[]::new))
                .withXaxis(XAxisBuilder.get()
                        .withType(XAxisType.DATETIME).build())
                .withYaxis(YAxisBuilder.get()
                        .withOpposite(false).build())
                .withLegend(LegendBuilder.get().withHorizontalAlign(HorizontalAlign.LEFT).build());
    }
}
