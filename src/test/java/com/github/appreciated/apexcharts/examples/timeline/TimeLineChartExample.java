package com.github.appreciated.apexcharts.examples.timeline;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.*;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.plotoptions.builder.BarBuilder;
import com.github.appreciated.apexcharts.config.xaxis.XAxisType;
import com.github.appreciated.apexcharts.helper.DateCoordinate;
import com.github.appreciated.apexcharts.helper.Series;

import java.time.LocalDate;

public class TimeLineChartExample extends ApexChartsBuilder {
    public TimeLineChartExample() {
        withChart(ChartBuilder.get()
                .withType(Type.RANGEBAR)
                .build())
                .withPlotOptions(PlotOptionsBuilder.get()
                        .withBar(BarBuilder.get()
                                .withRangeBarGroupRows(true)
                                .withHorizontal(true)
                                .build())
                        .build())
                .withDataLabels(DataLabelsBuilder.get()
                        .withEnabled(false)
                        .build())
                .withSeries(new Series<DateCoordinate>("Bob",
                                new DateCoordinate<>("Design", LocalDate.of(2019, 3, 3), LocalDate.of(2019, 3, 3)),
                                new DateCoordinate<>("Code", LocalDate.of(2019, 3, 4), LocalDate.of(2019, 3, 4)),
                                new DateCoordinate<>("Test", LocalDate.of(2019, 3, 4), LocalDate.of(2019, 3, 7)),
                                new DateCoordinate<>("Deployment", LocalDate.of(2019, 3, 11), LocalDate.of(2019, 3, 12))
                        ),
                        new Series<DateCoordinate>("Joe",
                                new DateCoordinate<>("Design", LocalDate.of(2019, 3, 1), LocalDate.of(2019, 3, 2)),
                                new DateCoordinate<>("Code", LocalDate.of(2019, 3, 3), LocalDate.of(2019, 3, 7)),
                                new DateCoordinate<>("Test", LocalDate.of(2019, 3, 6), LocalDate.of(2019, 3, 9)),
                                new DateCoordinate<>("Deployment", LocalDate.of(2019, 3, 10), LocalDate.of(2019, 3, 11))
                        )
                )
                .withYaxis(YAxisBuilder.get()
                        .withMin(LocalDate.of(2019, 3, 1))
                        .withMax(LocalDate.of(2019, 3, 14))
                        .build())
                .withXaxis(XAxisBuilder.get()
                        .withType(XAxisType.DATETIME)
                        .build());
    }
}
