package com.github.appreciated.apexcharts.examples.scatter;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.builder.XAxisBuilder;
import com.github.appreciated.apexcharts.config.builder.YAxisBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.builder.ZoomBuilder;
import com.github.appreciated.apexcharts.config.chart.zoom.ZoomType;
import com.github.appreciated.apexcharts.helper.Series;

public class ScatterChartExample extends ApexChartsBuilder {

    public ScatterChartExample() {
       withChart(ChartBuilder.get()
                .withType(Type.scatter)
                .withZoom(ZoomBuilder.get()
                        .withEnabled(true)
                        .withType(ZoomType.xy)
                        .build())
                .build())
                .withSeries(
                        new Series<>("SAMPLE A",
                                new double[]{16.4, 5.4}, new double[]{21.7, 2}, new double[]{25.4, 3}, new double[]{19, 2}, new double[]{10.9, 1},
                                new double[]{13.6, 3.2}, new double[]{10.9, 7.4}, new double[]{10.9, 0}, new double[]{10.9, 8.2}, new double[]{16.4, 0},
                                new double[]{16.4, 1.8}, new double[]{13.6, 0.3}, new double[]{13.6, 0}, new double[]{29.9, 0}, new double[]{27.1, 2.3},
                                new double[]{16.4, 0}, new double[]{13.6, 3.7}, new double[]{10.9, 5.2}, new double[]{16.4, 6.5}, new double[]{10.9, 0},
                                new double[]{24.5, 7.1}, new double[]{10.9, 0}, new double[]{8.1, 4.7}, new double[]{19, 0}, new double[]{21.7, 1.8},
                                new double[]{27.1, 0}, new double[]{24.5, 0}, new double[]{27.1, 0}, new double[]{29.9, 1.5}, new double[]{27.1, 0.8},
                                new double[]{22.1, 2}),
                        new Series<>("SAMPLE B", new double[]{6.4, 13.4}, new double[]{1.7, 11}, new double[]{5.4, 8}, new double[]{9, 17}, new double[]{1.9, 4},
                                new double[]{3.6, 12.2}, new double[]{1.9, 14.4}, new double[]{1.9, 9}, new double[]{1.9, 13.2}, new double[]{1.4, 7}, new double[]{6.4, 8.8},
                                new double[]{3.6, 4.3}, new double[]{1.6, 10}, new double[]{9.9, 2}, new double[]{7.1, 15}, new double[]{1.4, 0}, new double[]{3.6, 13.7},
                                new double[]{1.9, 15.2}, new double[]{6.4, 16.5}, new double[]{0.9, 10}, new double[]{4.5, 17.1}, new double[]{10.9, 10}, new double[]{0.1, 14.7},
                                new double[]{9, 10}, new double[]{12.7, 11.8}, new double[]{2.1, 10}, new double[]{2.5, 10}, new double[]{27.1, 10}, new double[]{2.9, 11.5},
                                new double[]{7.1, 10.8}, new double[]{2.1, 12}),
                        new Series<>("SAMPLE C", new double[]{21.7, 3}, new double[]{23.6, 3.5}, new double[]{24.6, 3}, new double[]{29.9, 3}, new double[]{21.7, 20},
                                new double[]{23, 2}, new double[]{10.9, 3}, new double[]{28, 4}, new double[]{27.1, 0.3}, new double[]{16.4, 4}, new double[]{13.6, 0},
                                new double[]{19, 5}, new double[]{22.4, 3}, new double[]{24.5, 3}, new double[]{32.6, 3}, new double[]{27.1, 4}, new double[]{29.6, 6},
                                new double[]{31.6, 8}, new double[]{21.6, 5}, new double[]{20.9, 4}, new double[]{22.4, 0}, new double[]{32.6, 10.3}, new double[]{29.7, 20.8},
                                new double[]{24.5, 0.8}, new double[]{21.4, 0}, new double[]{21.7, 6.9}, new double[]{28.6, 7.7}, new double[]{15.4, 0}, new double[]{18.1, 0},
                                new double[]{33.4, 0}, new double[]{16.4, 0})
                )
                .withXaxis(XAxisBuilder.get()
                        .build())
                .withYaxis(YAxisBuilder.get()
                        .build());
    }
}
