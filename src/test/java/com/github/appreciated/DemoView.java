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
import com.github.appreciated.apexcharts.config.yaxis.builder.TitleBuilder;
import com.github.appreciated.apexcharts.helper.Series;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import java.time.LocalDate;
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
                        .withType(com.github.appreciated.apexcharts.config.xaxis.Type.datetime).build())
                .withYaxis(YAxisBuilder.get()
                        .withOpposite(true).build())
                .withLegend(LegendBuilder.get().withHorizontalAlign(HorizontalAlign.left).build());
        areaChart.setWidth("550px");
        areaChart.setHeight("350px");
        return areaChart;
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


}
