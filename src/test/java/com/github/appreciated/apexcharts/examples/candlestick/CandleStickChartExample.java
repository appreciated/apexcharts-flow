package com.github.appreciated.apexcharts.examples.candlestick;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.builder.TooltipBuilder;
import com.github.appreciated.apexcharts.config.builder.XAxisBuilder;
import com.github.appreciated.apexcharts.config.builder.YAxisBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.xaxis.XAxisType;
import com.github.appreciated.apexcharts.helper.Coordinate;
import com.github.appreciated.apexcharts.helper.Series;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class CandleStickChartExample extends ApexChartsBuilder {
    public CandleStickChartExample() {
        withChart(ChartBuilder.get()
                .withType(Type.CANDLESTICK)
                .build())
                .withSeries(new Series<>(
                        new Coordinate<>(getISOString(1538778600000L), new BigDecimal("6629.81"), new BigDecimal("6650.5"), new BigDecimal("6623.04"), new BigDecimal("6633.33")),
                        new Coordinate<>(getISOString(1538780400000L), new BigDecimal("6632.01"), new BigDecimal("6643.59"), new BigDecimal("6620"), new BigDecimal("6630.11")),
                        new Coordinate<>(getISOString(1538782200000L), new BigDecimal("6630.71"), new BigDecimal("6648.95"), new BigDecimal("6623.34"), new BigDecimal("6635.65")),
                        new Coordinate<>(getISOString(1538784000000L), new BigDecimal("6635.65"), new BigDecimal("6651"), new BigDecimal("6629.67"), new BigDecimal("6638.24")),
                        new Coordinate<>(getISOString(1538785800000L), new BigDecimal("6638.24"), new BigDecimal("6640"), new BigDecimal("6620"), new BigDecimal("6624.47")),
                        new Coordinate<>(getISOString(1538787600000L), new BigDecimal("6624.53"), new BigDecimal("6636.03"), new BigDecimal("6621.68"), new BigDecimal("6624.31")),
                        new Coordinate<>(getISOString(1538789400000L), new BigDecimal("6624.61"), new BigDecimal("6632.2"), new BigDecimal("6617"), new BigDecimal("6626.02")),
                        new Coordinate<>(getISOString(1538791200000L), new BigDecimal("6627"), new BigDecimal("6627.62"), new BigDecimal("6584.22"), new BigDecimal("6603.02")),
                        new Coordinate<>(getISOString(1538793000000L), new BigDecimal("6605"), new BigDecimal("6608.03"), new BigDecimal("6598.95"), new BigDecimal("6604.01")),
                        new Coordinate<>(getISOString(1538794800000L), new BigDecimal("6604.5"), new BigDecimal("6614.4"), new BigDecimal("6602.26"), new BigDecimal("6608.02")),
                        new Coordinate<>(getISOString(1538796600000L), new BigDecimal("6608.02"), new BigDecimal("6610.68"), new BigDecimal("6601.99"), new BigDecimal("6608.91")),
                        new Coordinate<>(getISOString(1538798400000L), new BigDecimal("6608.91"), new BigDecimal("6618.99"), new BigDecimal("6608.01"), new BigDecimal("6612")),
                        new Coordinate<>(getISOString(1538800200000L), new BigDecimal("6612"), new BigDecimal("6615.13"), new BigDecimal("6605.09"), new BigDecimal("6612")),
                        new Coordinate<>(getISOString(1538802000000L), new BigDecimal("6612"), new BigDecimal("6624.12"), new BigDecimal("6608.43"), new BigDecimal("6622.95")),
                        new Coordinate<>(getISOString(1538803800000L), new BigDecimal("6623.91"), new BigDecimal("6623.91"), new BigDecimal("6615"), new BigDecimal("6615.67")),
                        new Coordinate<>(getISOString(1538805600000L), new BigDecimal("6618.69"), new BigDecimal("6618.74"), new BigDecimal("6610"), new BigDecimal("6610.4")),
                        new Coordinate<>(getISOString(1538807400000L), new BigDecimal("6611"), new BigDecimal("6622.78"), new BigDecimal("6610.4"), new BigDecimal("6614.9")),
                        new Coordinate<>(getISOString(1538809200000L), new BigDecimal("6614.9"), new BigDecimal("6626.2"), new BigDecimal("6613.33"), new BigDecimal("6623.45")),
                        new Coordinate<>(getISOString(1538811000000L), new BigDecimal("6623.48"), new BigDecimal("6627"), new BigDecimal("6618.38"), new BigDecimal("6620.35")),
                        new Coordinate<>(getISOString(1538812800000L), new BigDecimal("6619.43"), new BigDecimal("6620.35"), new BigDecimal("6610.05"), new BigDecimal("6615.53"))
                ))
                .withXaxis(XAxisBuilder.get()
                        .withType(XAxisType.DATETIME)
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
