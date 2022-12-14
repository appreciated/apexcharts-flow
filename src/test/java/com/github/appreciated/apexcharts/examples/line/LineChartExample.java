package com.github.appreciated.apexcharts.examples.line;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.ForecastDataPoints;
import com.github.appreciated.apexcharts.config.builder.*;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.builder.ZoomBuilder;
import com.github.appreciated.apexcharts.config.grid.builder.RowBuilder;
import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.config.xaxis.TickPlacement;
import com.github.appreciated.apexcharts.helper.Series;

public class LineChartExample extends ApexChartsBuilder {
    public LineChartExample() {
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
                .withForecastDataPoints(ForecastDataPointsBuilder.get().withCount(2).build())
                .withXaxis(XAxisBuilder.get()
                        .withCategories("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep")
                        .withTickPlacement(TickPlacement.BETWEEN)
                        .build())
                .withSeries(new Series<>("Desktops", 10.0, 41.0, 35.0, 51.0, 49.0, 62.0, 69.0, 91.0, 148.0));
    }
}
