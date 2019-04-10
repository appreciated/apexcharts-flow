package com.github.appreciated;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.config.*;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.zoom.Zoom;
import com.github.appreciated.apexcharts.config.grid.Row;
import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.config.subtitle.Align;
import com.github.appreciated.apexcharts.helper.MapSeries;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import java.util.Arrays;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        add(getPieChart());
        add(getLineChart());
    }

    /**
     *     var options = {
     *       chart: {
     *         //height: 350,
     *         type: "line",
     *         zoom: {
     *           enabled: false
     *         }
     *       },
     *       dataLabels: {
     *         enabled: false
     *       },
     *       stroke: {
     *         curve: "straight"
     *       },
     *       series: [{
     *         name: "Desktops",
     *         data: [10, 41, 35, 51, 49, 62, 69, 91, 148]
     *       }],
     *       title: {
     *         text: "Product Trends by Month",
     *         align: "left"
     *       },
     *       grid: {
     *         row: {
     *           colors: ["#f3f3f3", "transparent"], // takes an array which will be repeated on columns
     *           opacity: 0.5
     *         },
     *       },
     *       xaxis: {
     *         categories: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep"],
     *       }
     *     }
     */
    private Component getLineChart() {
        Chart chart = new Chart();
        chart.setType(Type.line);

        Zoom zoom = new Zoom();
        zoom.setEnabled(true);
        chart.setZoom(zoom);

        Stroke stroke = new Stroke();
        stroke.setCurve(Curve.straight);

        TitleSubtitle title = new TitleSubtitle();
        title.setText("Product Trends by Month");
        title.setAlign(Align.left);

        Grid grid = new Grid();
        Row row = new Row();
        row.setColors(Arrays.asList("#f3f3f3", "transparent"));
        row.setOpacity(0.5);
        grid.setRow(row);

        XAxis xaxis = new XAxis();
        xaxis.setCategories(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep"));

        ApexCharts lineChart = new ApexCharts()
                .withChart(chart)
                .withStroke(stroke)
                .withTitle(title)
                .withGrid(grid)
                .withXaxis(xaxis)
                .withLabels("Team A", "Team B", "Team C", "Team D", "Team E")
                .withSeries(new MapSeries("Desktops",10.0, 41.0, 35.0, 51.0, 49.0, 62.0, 69.0, 91.0, 148.0));
        return lineChart;
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




}
