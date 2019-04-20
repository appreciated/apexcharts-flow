package com.github.appreciated;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.config.builder.*;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.zoom.ZoomType;
import com.github.appreciated.apexcharts.config.chart.zoom.builder.ZoomBuilder;
import com.github.appreciated.apexcharts.config.grid.builder.RowBuilder;
import com.github.appreciated.apexcharts.config.legend.HorizontalAlign;
import com.github.appreciated.apexcharts.config.legend.Position;
import com.github.appreciated.apexcharts.config.plotoptions.builder.BarBuilder;
import com.github.appreciated.apexcharts.config.plotoptions.builder.HollowBuilder;
import com.github.appreciated.apexcharts.config.plotoptions.builder.RadialBarBuilder;
import com.github.appreciated.apexcharts.config.responsive.builder.OptionsBuilder;
import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.config.subtitle.Align;
import com.github.appreciated.apexcharts.config.tooltip.builder.YBuilder;
import com.github.appreciated.apexcharts.config.xaxis.XAxisType;
import com.github.appreciated.apexcharts.config.yaxis.builder.TitleBuilder;
import com.github.appreciated.apexcharts.helper.Coordinate;
import com.github.appreciated.apexcharts.helper.Series;
import com.vaadin.flow.component.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

public class ExampleChartGenerator {

    public Component getPieChart() {
        ApexCharts pieChart = new ApexCharts()
                .withChart(ChartBuilder.get().withType(Type.pie).build())
                .withLabels("Team A", "Team B", "Team C", "Team D", "Team E")
                .withLegend(LegendBuilder.get()
                        .withPosition(Position.bottom)
                        .build())
                .withSeries(44.0, 55.0, 13.0, 43.0, 22.0)
                .withResponsive(ResponsiveBuilder.get()
                        .withBreakpoint(480.0)
                        .withOptions(OptionsBuilder.get()
                                .withChart(ChartBuilder.get()
                                        .withWidth("200px")
                                        .build())
                                .withLegend(LegendBuilder.get()
                                        .withPosition(Position.bottom)
                                        .build())
                                .build())
                        .build());
        return pieChart;
    }

    public Component getDonutChart() {
        ApexCharts donutChart = new ApexCharts()
                .withChart(ChartBuilder.get().withType(Type.donut).build())
                .withLegend(LegendBuilder.get()
                        .withPosition(Position.bottom)
                        .build())
                .withSeries(44.0, 55.0, 41.0, 17.0, 15.0)
                .withResponsive(ResponsiveBuilder.get()
                        .withBreakpoint(480.0)
                        .withOptions(OptionsBuilder.get()
                                .withChart(ChartBuilder.get()
                                        .withWidth("200px")
                                        .build())
                                .withLegend(LegendBuilder.get()
                                        .withPosition(Position.bottom)
                                        .build())
                                .build())
                        .build());
        return donutChart;
    }

    public Component getLineChart() {
        ApexCharts lineChart = new ApexCharts()
                .withChart(ChartBuilder.get()
                        .withType(Type.line)
                        .withZoom(ZoomBuilder.get()
                                .withEnabled(false)
                                .build())
                        .build())
                .withStroke(StrokeBuilder.get()
                        .withCurve(Curve.straight)
                        .build())
                .withTitle(TitleSubtitleBuilder.get()
                        .withText("Product Trends by Month")
                        .withAlign(Align.left)
                        .build())
                .withGrid(GridBuilder.get()
                        .withRow(RowBuilder.get()
                                .withColors("#f3f3f3", "transparent")
                                .withOpacity(0.5).build()
                        ).build())
                .withXaxis(XAxisBuilder.get()
                        .withCategories("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep")
                        .build())
                .withSeries(new Series("Desktops", 10.0, 41.0, 35.0, 51.0, 49.0, 62.0, 69.0, 91.0, 148.0));
        return lineChart;
    }

    public Component getAreaChart() {
        ApexCharts areaChart = new ApexCharts()
                .withChart(
                        ChartBuilder.get()
                                .withType(Type.area)
                                .withZoom(ZoomBuilder.get()
                                        .withEnabled(false)
                                        .build())
                                .build())
                .withDataLabels(DataLabelsBuilder.get()
                        .withEnabled(false)
                        .build())
                .withStroke(StrokeBuilder.get().withCurve(Curve.straight).build())
                .withSeries(new Series("STOCK ABC", 10.0, 41.0, 35.0, 51.0, 49.0, 62.0, 69.0, 91.0, 148.0))
                .withTitle(TitleSubtitleBuilder.get()
                        .withText("Fundamental Analysis of Stocks")
                        .withAlign(Align.left).build())
                .withSubtitle(TitleSubtitleBuilder.get()
                        .withText("Price Movements")
                        .withAlign(Align.left).build())
                .withLabels(IntStream.range(1, 10).boxed().map(day -> LocalDate.of(2000, 1, day).toString()).toArray(String[]::new))
                .withXaxis(XAxisBuilder.get()
                        .withType(XAxisType.datetime).build())
                .withYaxis(YAxisBuilder.get()
                        .withOpposite(true).build())
                .withLegend(LegendBuilder.get().withHorizontalAlign(HorizontalAlign.left).build());
        return areaChart;
    }

    public Component getHorizontalBarChart() {
        ApexCharts barChart = new ApexCharts()
                .withChart(ChartBuilder.get()
                        .withType(Type.bar)
                        .build())
                .withPlotOptions(PlotOptionsBuilder.get()
                        .withBar(BarBuilder.get()
                                .withHorizontal(true)
                                .build())
                        .build())
                .withDataLabels(DataLabelsBuilder.get()
                        .withEnabled(false)
                        .build())
                .withSeries(new Series(400.0, 430.0, 448.0, 470.0, 540.0, 580.0, 690.0, 1100.0, 1200.0, 1380.0))
                .withXaxis(XAxisBuilder.get()
                        .withCategories()
                        .build());
        return barChart;
    }

    public Component getVerticalBarChart() {
        ApexCharts barChart = new ApexCharts()
                .withChart(ChartBuilder.get()
                        .withType(Type.bar)
                        .build())
                .withPlotOptions(PlotOptionsBuilder.get()
                        .withBar(BarBuilder.get()
                                .withHorizontal(false)
                                .withColumnWidth("55%")
                                .build())
                        .build())
                .withDataLabels(DataLabelsBuilder.get()
                        .withEnabled(false).build())
                .withStroke(StrokeBuilder.get()
                        .withShow(true)
                        .withWidth(2.0)
                        .withColors("transparent")
                        .build())
                .withSeries(new Series("Net Profit", 44.0, 55.0, 57.0, 56.0, 61.0, 58.0, 63.0, 60.0, 66.0),
                        new Series("Revenue", 76.0, 85.0, 101.0, 98.0, 87.0, 105.0, 91.0, 114.0, 94.0),
                        new Series("Free Cash Flow", 35.0, 41.0, 36.0, 26.0, 45.0, 48.0, 52.0, 53.0, 41.0))
                .withYaxis(YAxisBuilder.get()
                        .withTitle(TitleBuilder.get()
                                .withText("$ (thousands)")
                                .build())
                        .build())
                .withXaxis(XAxisBuilder.get().withCategories("Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct").build())
                .withFill(FillBuilder.get()
                        .withOpacity(1.0).build())
                .withTooltip(TooltipBuilder.get()
                        .withY(YBuilder.get()
                                .withFormatter("function (val) {\n" + // Formatter currently not yet working
                                        "return \"$ \" + val + \" thousands\"\n" +
                                        "}").build())
                        .build());
        return barChart;
    }

    public Component getRadialBarChart() {
        ApexCharts barChart = new ApexCharts()
                .withChart(ChartBuilder.get()
                        .withType(Type.radialBar)
                        .build())
                .withPlotOptions(PlotOptionsBuilder.get()
                        .withRadialBar(RadialBarBuilder.get()
                                .withHollow(HollowBuilder.get()
                                        .withSize("70%")
                                        .build())
                                .build())
                        .build())
                .withSeries(70.0)
                .withLabels("Circket");
        return barChart;
    }

    public Component getCandleStickChart() {
        ApexCharts barChart = new ApexCharts()
                .withChart(ChartBuilder.get()
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
        return barChart;
    }

    public String getISOString(long l) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(l), ZoneId.systemDefault()).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    public Component getRadarChart() {
        ApexCharts radarChart = new ApexCharts()
                .withChart(ChartBuilder.get()
                        .withType(Type.radar)
                        .build())
                .withSeries(new Series("Series 1", 80, 50, 30, 40, 100, 20))
                .withTitle(TitleSubtitleBuilder.get()
                        .withText("Basic Radar Chart")
                        .build())
                .withLabels("January", "February", "March", "April", "May", "June");
        return radarChart;

    }

    public Component getScatterChart() {
        ApexCharts scatterChart = new ApexCharts()
                .withChart(ChartBuilder.get()
                        .withType(Type.scatter)
                        .withZoom(ZoomBuilder.get()
                                .withEnabled(true)
                                .withType(ZoomType.xy)
                                .build())
                        .build())
                .withSeries(
                        new Series("SAMPLE A",
                                new double[]{16.4, 5.4}, new double[]{21.7, 2}, new double[]{25.4, 3}, new double[]{19, 2}, new double[]{10.9, 1},
                                new double[]{13.6, 3.2}, new double[]{10.9, 7.4}, new double[]{10.9, 0}, new double[]{10.9, 8.2}, new double[]{16.4, 0},
                                new double[]{16.4, 1.8}, new double[]{13.6, 0.3}, new double[]{13.6, 0}, new double[]{29.9, 0}, new double[]{27.1, 2.3},
                                new double[]{16.4, 0}, new double[]{13.6, 3.7}, new double[]{10.9, 5.2}, new double[]{16.4, 6.5}, new double[]{10.9, 0},
                                new double[]{24.5, 7.1}, new double[]{10.9, 0}, new double[]{8.1, 4.7}, new double[]{19, 0}, new double[]{21.7, 1.8},
                                new double[]{27.1, 0}, new double[]{24.5, 0}, new double[]{27.1, 0}, new double[]{29.9, 1.5}, new double[]{27.1, 0.8},
                                new double[]{22.1, 2}),
                        new Series("SAMPLE B", new double[]{6.4, 13.4}, new double[]{1.7, 11}, new double[]{5.4, 8}, new double[]{9, 17}, new double[]{1.9, 4},
                                new double[]{3.6, 12.2}, new double[]{1.9, 14.4}, new double[]{1.9, 9}, new double[]{1.9, 13.2}, new double[]{1.4, 7}, new double[]{6.4, 8.8},
                                new double[]{3.6, 4.3}, new double[]{1.6, 10}, new double[]{9.9, 2}, new double[]{7.1, 15}, new double[]{1.4, 0}, new double[]{3.6, 13.7},
                                new double[]{1.9, 15.2}, new double[]{6.4, 16.5}, new double[]{0.9, 10}, new double[]{4.5, 17.1}, new double[]{10.9, 10}, new double[]{0.1, 14.7},
                                new double[]{9, 10}, new double[]{12.7, 11.8}, new double[]{2.1, 10}, new double[]{2.5, 10}, new double[]{27.1, 10}, new double[]{2.9, 11.5},
                                new double[]{7.1, 10.8}, new double[]{2.1, 12}),
                        new Series("SAMPLE C", new double[]{21.7, 3}, new double[]{23.6, 3.5}, new double[]{24.6, 3}, new double[]{29.9, 3}, new double[]{21.7, 20},
                                new double[]{23, 2}, new double[]{10.9, 3}, new double[]{28, 4}, new double[]{27.1, 0.3}, new double[]{16.4, 4}, new double[]{13.6, 0},
                                new double[]{19, 5}, new double[]{22.4, 3}, new double[]{24.5, 3}, new double[]{32.6, 3}, new double[]{27.1, 4}, new double[]{29.6, 6},
                                new double[]{31.6, 8}, new double[]{21.6, 5}, new double[]{20.9, 4}, new double[]{22.4, 0}, new double[]{32.6, 10.3}, new double[]{29.7, 20.8},
                                new double[]{24.5, 0.8}, new double[]{21.4, 0}, new double[]{21.7, 6.9}, new double[]{28.6, 7.7}, new double[]{15.4, 0}, new double[]{18.1, 0},
                                new double[]{33.4, 0}, new double[]{16.4, 0})
                )
                .withXaxis(XAxisBuilder.get()
                        .withTickAmount(10.0)
                        .build())
                .withYaxis(YAxisBuilder.get()
                        .withTickAmount(7.0)
                        .build());
        return scatterChart;
    }
}
