package com.github.appreciated.apexcharts.examples.candlestick;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.config.builder.*;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.subtitle.Align;
import com.github.appreciated.apexcharts.config.xaxis.XAxisType;
import com.github.appreciated.apexcharts.helper.Coordinate;
import com.github.appreciated.apexcharts.helper.Series;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class CandleStickChartExample extends ApexCharts {
    public CandleStickChartExample() {
        withChart(ChartBuilder.get()
                .withType(Type.candlestick)
                .build())
                .withTitle(TitleSubtitleBuilder.get()
                        .withText("CandleStick Chart")
                        .withAlign(Align.left)
                        .build())
                .withSeries(new Series<>(
                        new Coordinate<>(getISOString(1538778600000L), 6629.81, 6650.5, 6623.04, 6633.33),
                        new Coordinate<>(getISOString(1538780400000L), 6632.01, 6643.59, 6620, 6630.11),
                        new Coordinate<>(getISOString(1538782200000L), 6630.71, 6648.95, 6623.34, 6635.65),
                        new Coordinate<>(getISOString(1538784000000L), 6635.65, 6651, 6629.67, 6638.24),
                        new Coordinate<>(getISOString(1538785800000L), 6638.24, 6640, 6620, 6624.47),
                        new Coordinate<>(getISOString(1538787600000L), 6624.53, 6636.03, 6621.68, 6624.31),
                        new Coordinate<>(getISOString(1538789400000L), 6624.61, 6632.2, 6617, 6626.02),
                        new Coordinate<>(getISOString(1538791200000L), 6627, 6627.62, 6584.22, 6603.02),
                        new Coordinate<>(getISOString(1538793000000L), 6605, 6608.03, 6598.95, 6604.01),
                        new Coordinate<>(getISOString(1538794800000L), 6604.5, 6614.4, 6602.26, 6608.02),
                        new Coordinate<>(getISOString(1538796600000L), 6608.02, 6610.68, 6601.99, 6608.91),
                        new Coordinate<>(getISOString(1538798400000L), 6608.91, 6618.99, 6608.01, 6612),
                        new Coordinate<>(getISOString(1538800200000L), 6612, 6615.13, 6605.09, 6612),
                        new Coordinate<>(getISOString(1538802000000L), 6612, 6624.12, 6608.43, 6622.95),
                        new Coordinate<>(getISOString(1538803800000L), 6623.91, 6623.91, 6615, 6615.67),
                        new Coordinate<>(getISOString(1538805600000L), 6618.69, 6618.74, 6610, 6610.4),
                        new Coordinate<>(getISOString(1538807400000L), 6611, 6622.78, 6610.4, 6614.9),
                        new Coordinate<>(getISOString(1538809200000L), 6614.9, 6626.2, 6613.33, 6623.45),
                        new Coordinate<>(getISOString(1538811000000L), 6623.48, 6627, 6618.38, 6620.35),
                        new Coordinate<>(getISOString(1538812800000L), 6619.43, 6620.35, 6610.05, 6615.53)
                ))
                .withXaxis(XAxisBuilder.get()
                        .withType(XAxisType.datetime)
                        .build())
                .withYaxis(YAxisBuilder.get()
                        .withTooltip(TooltipBuilder.get()
                                .withEnabled(true)
                                .build())
                        .build());
    }

    public String getISOString(long l) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(l), ZoneId.systemDefault()).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}
