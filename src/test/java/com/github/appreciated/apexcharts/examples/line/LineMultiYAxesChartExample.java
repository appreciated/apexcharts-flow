package com.github.appreciated.apexcharts.examples.line;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.*;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.builder.ZoomBuilder;
import com.github.appreciated.apexcharts.config.grid.builder.RowBuilder;
import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.config.yaxis.AxisBorder;
import com.github.appreciated.apexcharts.config.yaxis.builder.AxisBorderBuilder;
import com.github.appreciated.apexcharts.config.yaxis.builder.TitleBuilder;
import com.github.appreciated.apexcharts.helper.Series;

public class LineMultiYAxesChartExample extends ApexChartsBuilder {
    public LineMultiYAxesChartExample() {
        withChart(ChartBuilder.get()
                .withType(Type.LINE)
                .withZoom(ZoomBuilder.get()
                        .withEnabled(false)
                        .build())
                .build())
                .withStroke(StrokeBuilder.get()
                        .withCurve(Curve.STRAIGHT)
                        .build())
                .withGrid(GridBuilder.get()
                        .withRow(RowBuilder.get()
                                .withColors("#f3f3f3", "transparent")
                                .withOpacity(0.5).build()
                        ).build())
                .withXaxis(XAxisBuilder.get()
                        .withCategories("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep")
                        .build())
                .withYaxis(YAxisBuilder.get()
                        .withTitle(TitleBuilder.get().withText("Desktops").build())
                        .withAxisBorder(AxisBorderBuilder.get().withShow(true).build())
                        .build(),
                        YAxisBuilder.get()
                        .withTitle(TitleBuilder.get().withText("Mobil").build())
                        .withAxisBorder(AxisBorderBuilder.get().withShow(true).build())
                        .withOpposite(true)
                        .build()
                )
                .withSeries(new Series<>("Desktops", 10.0, 41.0, 35.0, 51.0, 49.0, 62.0, 69.0, 91.0, 148.0),
                        new Series<>("Mobil", 3.0, 4.0, 5.0, 6.0, 8.0, 10.0, 13.0, 15.0, 20.0));
    }
}
