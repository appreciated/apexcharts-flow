package com.github.appreciated;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.config.Chart;
import com.github.appreciated.apexcharts.config.builder.*;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.zoom.builder.ZoomBuilder;
import com.github.appreciated.apexcharts.config.grid.builder.RowBuilder;
import com.github.appreciated.apexcharts.config.legend.HorizontalAlign;
import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.config.subtitle.Align;
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
        add(getLineChart());
        add(getAreaChart());
    }

    private Component getPieChart() {
        Chart chart = new Chart();
        chart.setType(Type.pie);

        ApexCharts pieChart = new ApexCharts()
                .withChart(chart)
                .withLabels("Team A", "Team B", "Team C", "Team D", "Team E")
                .withSeries(44.0, 55.0, 13.0, 43.0, 22.0);
        //.withResponsive(new ApexResponsive())
        return pieChart;
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
                .withLabels((String[]) IntStream.range(1,10).boxed().map(day -> LocalDate.of(2000,1,day).toString()).toArray())
                .withXaxis(XAxisBuilder.get()
                        .withType(com.github.appreciated.apexcharts.config.xaxis.Type.datetime).build())
                .withYaxis(YAxisBuilder.get()
                        .withOpposite(true).build())
                .withLegend(LegendBuilder.get().withHorizontalAlign(HorizontalAlign.left).build());
        areaChart.setWidth("550px");
        areaChart.setHeight("350px");
        return areaChart;
    }

}
