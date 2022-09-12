package com.github.appreciated.apexcharts.examples.bar;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.builder.DataLabelsBuilder;
import com.github.appreciated.apexcharts.config.builder.FillBuilder;
import com.github.appreciated.apexcharts.config.builder.PlotOptionsBuilder;
import com.github.appreciated.apexcharts.config.builder.StrokeBuilder;
import com.github.appreciated.apexcharts.config.builder.XAxisBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.plotoptions.bar.builder.ColorsBuilder;
import com.github.appreciated.apexcharts.config.plotoptions.bar.builder.RangesBuilder;
import com.github.appreciated.apexcharts.config.plotoptions.builder.BarBuilder;
import com.github.appreciated.apexcharts.helper.Series;

public class RangedVerticalBarChartExample extends ApexChartsBuilder {
    public RangedVerticalBarChartExample() {
        withChart(ChartBuilder.get()
                .withType(Type.BAR)
                .build())
                // .withColors() // Empty call makes chart to not render
                .withPlotOptions(PlotOptionsBuilder.get()
                        .withBar(BarBuilder.get()
                                .withHorizontal(false)
                                .withColumnWidth("55%")
                                .withColors(ColorsBuilder.get()
                                        // Ranges overwrite colors in range for all series
                                        .withRanges(RangesBuilder.get()
                                                .withFrom(50d)
                                                .withTo(75d)
                                                .withColor("#3d923d")
                                                .build(), RangesBuilder.get()
                                                .withFrom(75d)
                                                .withTo(100d)
                                                .withColor("#88593e")
                                                .build())
                                        .build())
                                .build())
                        .build())
                .withDataLabels(DataLabelsBuilder.get()
                        .withEnabled(false).build())
                .withStroke(StrokeBuilder.get()
                        .withShow(true)
                        .withWidth(2.0)
                        .withColors("transparent")
                        .build())
                .withSeries(new Series<>("Net Profit", "44", "55", "57", "56", "61", "58", "63", "60", "66"),
                        new Series<>("Revenue", "76", "85", "101", "98", "87", "105", "91", "114", "94"),
                        new Series<>("Free Cash Flow", "35", "41", "36", "26", "45", "48", "52", "53", "41"))
                .withXaxis(XAxisBuilder.get().withCategories("Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct").build())
                .withFill(FillBuilder.get()
                        .withOpacity(1.0).build());
    }
}
