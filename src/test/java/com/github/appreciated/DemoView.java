package com.github.appreciated;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.config.Chart;
import com.github.appreciated.apexcharts.config.builder.*;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.zoom.builder.ZoomBuilder;
import com.github.appreciated.apexcharts.config.grid.builder.RowBuilder;
import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.config.subtitle.Align;
import com.github.appreciated.apexcharts.helper.MapSeries;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        add(getPieChart());
        add(getLineChart());
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

    /**
     * var options = {
     * chart: {
     * //height: 350,
     * type: "line",
     * zoom: {
     * enabled: false
     * }
     * },
     * dataLabels: {
     * enabled: false
     * },
     * stroke: {
     * curve: "straight"
     * },
     * series: [{
     * name: "Desktops",
     * data: [10, 41, 35, 51, 49, 62, 69, 91, 148]
     * }],
     * title: {
     * text: "Product Trends by Month",
     * align: "left"
     * },
     * grid: {
     * row: {
     * colors: ["#f3f3f3", "transparent"], // takes an array which will be repeated on columns
     * opacity: 0.5
     * },
     * },
     * xaxis: {
     * categories: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep"],
     * }
     * }
     */
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
                .withSeries(new MapSeries("Desktops", 10.0, 41.0, 35.0, 51.0, 49.0, 62.0, 69.0, 91.0, 148.0));
        lineChart.setWidth("550px");
        lineChart.setHeight("350px");
        return lineChart;
    }


}
