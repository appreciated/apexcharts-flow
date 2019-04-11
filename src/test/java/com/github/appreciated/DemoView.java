package com.github.appreciated;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.config.builder.*;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.zoom.builder.ZoomBuilder;
import com.github.appreciated.apexcharts.config.grid.builder.RowBuilder;
import com.github.appreciated.apexcharts.config.legend.HorizontalAlign;
import com.github.appreciated.apexcharts.config.plotoptions.builder.BarBuilder;
import com.github.appreciated.apexcharts.config.plotoptions.builder.HollowBuilder;
import com.github.appreciated.apexcharts.config.plotoptions.builder.RadialBarBuilder;
import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.config.subtitle.Align;
import com.github.appreciated.apexcharts.config.tooltip.builder.YBuilder;
import com.github.appreciated.apexcharts.config.xaxis.XAxisType;
import com.github.appreciated.apexcharts.config.yaxis.builder.TitleBuilder;
import com.github.appreciated.apexcharts.helper.Coordinate;
import com.github.appreciated.apexcharts.helper.Series;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

@Route("")
public class DemoView extends Div {


    public DemoView() {
        add(getPieChart());
        add(getDonutChart());
        add(getLineChart());
        add(getAreaChart());
        add(getHorizontalBarChart());
        add(getVerticalBarChart());
        add(getRadialBarChart());
        add(getCandleStickChart());
    }

    private Component getPieChart() {
        ApexCharts pieChart = new ApexCharts()
                .withChart(ChartBuilder.get().withType(Type.pie).build())
                .withLabels("Team A", "Team B", "Team C", "Team D", "Team E")
                .withSeries(44.0, 55.0, 13.0, 43.0, 22.0);
        pieChart.setHeight("300px");
        return pieChart;
    }

    private Component getDonutChart() {
        ApexCharts donutChart = new ApexCharts()
                .withChart(ChartBuilder.get().withType(Type.donut).build())
                .withSeries(44.0, 55.0, 41.0, 17.0, 15.0);
        donutChart.setHeight("300px");
        return donutChart;
    }

    private Component getLineChart() {
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
        lineChart.setWidth("550px");
        lineChart.setHeight("350px");
        return lineChart;
    }

    private Component getAreaChart() {
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
        areaChart.setWidth("550px");
        areaChart.setHeight("350px");
        return areaChart;
    }

    private Component getHorizontalBarChart() {
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
        barChart.setWidth("550px");
        barChart.setHeight("350px");
        return barChart;
    }

    private Component getVerticalBarChart() {
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
        barChart.setWidth("550px");
        barChart.setHeight("350px");
        return barChart;
    }

    private Component getRadialBarChart() {
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
        barChart.setWidth("550px");
        barChart.setHeight("350px");
        return barChart;
    }

    private Component getCandleStickChart() {
        ApexCharts barChart = new ApexCharts()
                .withChart(ChartBuilder.get()
                        .withType(Type.candlestick)
                        .build())
                .withTitle(TitleSubtitleBuilder.get()
                        .withText("CandleStick Chart")
                        .withAlign(Align.left)
                        .build())
                .withSeries(new Series<>(
                        new Coordinate<>(getIsoFormattedString(1538778600000L), 6629.81, 6650.5, 6623.04, 6633.33),
                        new Coordinate<>(getIsoFormattedString(1538780400000L), 6632.01, 6643.59, 6620, 6630.11),
                        new Coordinate<>(getIsoFormattedString(1538782200000L), 6630.71, 6648.95, 6623.34, 6635.65),
                        new Coordinate<>(getIsoFormattedString(1538784000000L), 6635.65, 6651, 6629.67, 6638.24),
                        new Coordinate<>(getIsoFormattedString(1538785800000L), 6638.24, 6640, 6620, 6624.47),
                        new Coordinate<>(getIsoFormattedString(1538787600000L), 6624.53, 6636.03, 6621.68, 6624.31),
                        new Coordinate<>(getIsoFormattedString(1538789400000L), 6624.61, 6632.2, 6617, 6626.02),
                        new Coordinate<>(getIsoFormattedString(1538791200000L), 6627, 6627.62, 6584.22, 6603.02),
                        new Coordinate<>(getIsoFormattedString(1538793000000L), 6605, 6608.03, 6598.95, 6604.01),
                        new Coordinate<>(getIsoFormattedString(1538794800000L), 6604.5, 6614.4, 6602.26, 6608.02),
                        new Coordinate<>(getIsoFormattedString(1538796600000L), 6608.02, 6610.68, 6601.99, 6608.91),
                        new Coordinate<>(getIsoFormattedString(1538798400000L), 6608.91, 6618.99, 6608.01, 6612),
                        new Coordinate<>(getIsoFormattedString(1538800200000L), 6612, 6615.13, 6605.09, 6612),
                        new Coordinate<>(getIsoFormattedString(1538802000000L), 6612, 6624.12, 6608.43, 6622.95),
                        new Coordinate<>(getIsoFormattedString(1538803800000L), 6623.91, 6623.91, 6615, 6615.67),
                        new Coordinate<>(getIsoFormattedString(1538805600000L), 6618.69, 6618.74, 6610, 6610.4),
                        new Coordinate<>(getIsoFormattedString(1538807400000L), 6611, 6622.78, 6610.4, 6614.9),
                        new Coordinate<>(getIsoFormattedString(1538809200000L), 6614.9, 6626.2, 6613.33, 6623.45),
                        new Coordinate<>(getIsoFormattedString(1538811000000L), 6623.48, 6627, 6618.38, 6620.35),
                        new Coordinate<>(getIsoFormattedString(1538812800000L), 6619.43, 6620.35, 6610.05, 6615.53)
                ))
                .withXaxis(XAxisBuilder.get()
                        .withType(XAxisType.datetime)
                        .build())
                .withYaxis(YAxisBuilder.get()
                        .withTooltip(TooltipBuilder.get()
                                .withEnabled(true)
                                .build())
                        .build());
        barChart.setWidth("550px");
        barChart.setHeight("350px");
        return barChart;
    }

    private String getIsoFormattedString(long l) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(l), ZoneId.systemDefault()).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

}
