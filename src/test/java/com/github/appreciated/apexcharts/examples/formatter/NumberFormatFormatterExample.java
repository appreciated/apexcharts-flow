package com.github.appreciated.apexcharts.examples.formatter;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.builder.XAxisBuilder;
import com.github.appreciated.apexcharts.config.builder.YAxisBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.builder.ZoomBuilder;
import com.github.appreciated.apexcharts.config.chart.zoom.ZoomType;
import com.github.appreciated.apexcharts.config.xaxis.builder.LabelsBuilder;
import com.github.appreciated.apexcharts.helper.NumberFormatFormatter;
import com.github.appreciated.apexcharts.helper.Series;
import com.vaadin.flow.router.Route;

import java.math.BigDecimal;

@Route("locale")
public class NumberFormatFormatterExample extends ApexChartsBuilder {

    public NumberFormatFormatterExample() {
        withChart(ChartBuilder.get()
                .withType(Type.scatter)
                .withZoom(ZoomBuilder.get()
                        .withEnabled(true)
                        .withType(ZoomType.xy)
                        .build())
                .build())
                .withSeries(
                        new Series<>("SAMPLE A",
                                new BigDecimal[]{new BigDecimal("16.4"),new BigDecimal("5.4")}, new BigDecimal[]{new BigDecimal("21.7"),new BigDecimal("2")}, new BigDecimal[]{new BigDecimal("25.4"),new BigDecimal("3")}, new BigDecimal[]{new BigDecimal("19"),new BigDecimal("2")}, new BigDecimal[]{new BigDecimal("10.9"),new BigDecimal("1")},
                                new BigDecimal[]{new BigDecimal("13.6"),new BigDecimal("3.2")}, new BigDecimal[]{new BigDecimal("10.9"),new BigDecimal("7.4")}, new BigDecimal[]{new BigDecimal("10.9"),new BigDecimal("0")}, new BigDecimal[]{new BigDecimal("10.9"),new BigDecimal("8.2")}, new BigDecimal[]{new BigDecimal("16.4"),new BigDecimal("0")},
                                new BigDecimal[]{new BigDecimal("16.4"),new BigDecimal("1.8")}, new BigDecimal[]{new BigDecimal("13.6"),new BigDecimal("0.3")}, new BigDecimal[]{new BigDecimal("13.6"),new BigDecimal("0")}, new BigDecimal[]{new BigDecimal("29.9"),new BigDecimal("0")}, new BigDecimal[]{new BigDecimal("27.1"),new BigDecimal("2.3")},
                                new BigDecimal[]{new BigDecimal("16.4"),new BigDecimal("0")}, new BigDecimal[]{new BigDecimal("13.6"),new BigDecimal("3.7")}, new BigDecimal[]{new BigDecimal("10.9"),new BigDecimal("5.2")}, new BigDecimal[]{new BigDecimal("16.4"),new BigDecimal("6.5")}, new BigDecimal[]{new BigDecimal("10.9"),new BigDecimal("0")},
                                new BigDecimal[]{new BigDecimal("24.5"),new BigDecimal("7.1")}, new BigDecimal[]{new BigDecimal("10.9"),new BigDecimal("0")}, new BigDecimal[]{new BigDecimal("8.1"),new BigDecimal("4.7")}, new BigDecimal[]{new BigDecimal("19"),new BigDecimal("0")}, new BigDecimal[]{new BigDecimal("21.7"),new BigDecimal("1.8")},
                                new BigDecimal[]{new BigDecimal("27.1"),new BigDecimal("0")}, new BigDecimal[]{new BigDecimal("24.5"),new BigDecimal("0")}, new BigDecimal[]{new BigDecimal("27.1"),new BigDecimal("0")}, new BigDecimal[]{new BigDecimal("29.9"),new BigDecimal("1.5")}, new BigDecimal[]{new BigDecimal("27.1"),new BigDecimal("0.8")},
                                new BigDecimal[]{new BigDecimal("22.1"),new BigDecimal("2")}),
                        new Series<>("SAMPLE B", new BigDecimal[]{new BigDecimal("6.4"),new BigDecimal("13.4")}, new BigDecimal[]{new BigDecimal("1.7"),new BigDecimal("11")}, new BigDecimal[]{new BigDecimal("5.4"),new BigDecimal("8")}, new BigDecimal[]{new BigDecimal("9"),new BigDecimal("17")}, new BigDecimal[]{new BigDecimal("1.9"),new BigDecimal("4")},
                                new BigDecimal[]{new BigDecimal("3.6"),new BigDecimal("12.2")}, new BigDecimal[]{new BigDecimal("1.9"),new BigDecimal("14.4")}, new BigDecimal[]{new BigDecimal("1.9"),new BigDecimal("9")}, new BigDecimal[]{new BigDecimal("1.9"),new BigDecimal("13.2")}, new BigDecimal[]{new BigDecimal("1.4"),new BigDecimal("7")}, new BigDecimal[]{new BigDecimal("6.4"),new BigDecimal("8.8")},
                                new BigDecimal[]{new BigDecimal("3.6"),new BigDecimal("4.3")}, new BigDecimal[]{new BigDecimal("1.6"),new BigDecimal("10")}, new BigDecimal[]{new BigDecimal("9.9"),new BigDecimal("2")}, new BigDecimal[]{new BigDecimal("7.1"),new BigDecimal("15")}, new BigDecimal[]{new BigDecimal("1.4"),new BigDecimal("0")}, new BigDecimal[]{new BigDecimal("3.6"),new BigDecimal("13.7")},
                                new BigDecimal[]{new BigDecimal("1.9"),new BigDecimal("15.2")}, new BigDecimal[]{new BigDecimal("6.4"),new BigDecimal("16.5")}, new BigDecimal[]{new BigDecimal("0.9"),new BigDecimal("10")}, new BigDecimal[]{new BigDecimal("4.5"),new BigDecimal("17.1")}, new BigDecimal[]{new BigDecimal("10.9"),new BigDecimal("10")}, new BigDecimal[]{new BigDecimal("0.1"),new BigDecimal("14.7")},
                                new BigDecimal[]{new BigDecimal("9"),new BigDecimal("10")}, new BigDecimal[]{new BigDecimal("12.7"),new BigDecimal("11.8")}, new BigDecimal[]{new BigDecimal("2.1"),new BigDecimal("10")}, new BigDecimal[]{new BigDecimal("2.5"),new BigDecimal("10")}, new BigDecimal[]{new BigDecimal("27.1"),new BigDecimal("10")}, new BigDecimal[]{new BigDecimal("2.9"),new BigDecimal("11.5")},
                                new BigDecimal[]{new BigDecimal("7.1"),new BigDecimal("10.8")}, new BigDecimal[]{new BigDecimal("2.1"),new BigDecimal("12")}),
                        new Series<>("SAMPLE C", new BigDecimal[]{new BigDecimal("21.7"),new BigDecimal("3")}, new BigDecimal[]{new BigDecimal("23.6"),new BigDecimal("3.5")}, new BigDecimal[]{new BigDecimal("24.6"),new BigDecimal("3")}, new BigDecimal[]{new BigDecimal("29.9"),new BigDecimal("3")}, new BigDecimal[]{new BigDecimal("21.7"),new BigDecimal("20")},
                                new BigDecimal[]{new BigDecimal("23"),new BigDecimal("2")}, new BigDecimal[]{new BigDecimal("10.9"),new BigDecimal("3")}, new BigDecimal[]{new BigDecimal("28"),new BigDecimal("4")}, new BigDecimal[]{new BigDecimal("27.1"),new BigDecimal("0.3")}, new BigDecimal[]{new BigDecimal("16.4"),new BigDecimal("4")}, new BigDecimal[]{new BigDecimal("13.6"),new BigDecimal("0")},
                                new BigDecimal[]{new BigDecimal("19"),new BigDecimal("5")}, new BigDecimal[]{new BigDecimal("22.4"),new BigDecimal("3")}, new BigDecimal[]{new BigDecimal("24.5"),new BigDecimal("3")}, new BigDecimal[]{new BigDecimal("32.6"),new BigDecimal("3")}, new BigDecimal[]{new BigDecimal("27.1"),new BigDecimal("4")}, new BigDecimal[]{new BigDecimal("29.6"),new BigDecimal("6")},
                                new BigDecimal[]{new BigDecimal("31.6"),new BigDecimal("8")}, new BigDecimal[]{new BigDecimal("21.6"),new BigDecimal("5")}, new BigDecimal[]{new BigDecimal("20.9"),new BigDecimal("4")}, new BigDecimal[]{new BigDecimal("22.4"),new BigDecimal("0")}, new BigDecimal[]{new BigDecimal("32.6"),new BigDecimal("10.3")}, new BigDecimal[]{new BigDecimal("29.7"),new BigDecimal("20.8")},
                                new BigDecimal[]{new BigDecimal("24.5"),new BigDecimal("0.8")}, new BigDecimal[]{new BigDecimal("21.4"),new BigDecimal("0")}, new BigDecimal[]{new BigDecimal("21.7"),new BigDecimal("6.9")}, new BigDecimal[]{new BigDecimal("28.6"),new BigDecimal("7.7")}, new BigDecimal[]{new BigDecimal("15.4"),new BigDecimal("0")}, new BigDecimal[]{new BigDecimal("18.1"),new BigDecimal("0")},
                                new BigDecimal[]{new BigDecimal("33.4"),new BigDecimal("0")}, new BigDecimal[]{new BigDecimal("16.4"),new BigDecimal("0")})
                )
                .withXaxis(XAxisBuilder.get().withLabels(LabelsBuilder.get().withFormatter(new NumberFormatFormatter(3)).build()).build())
                .withYaxis(YAxisBuilder.get().withLabels(com.github.appreciated.apexcharts.config.yaxis.builder.LabelsBuilder.get().withFormatter(new NumberFormatFormatter(3)).build())
                        .build());
    }
}

