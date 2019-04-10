package com.github.appreciated;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.config.ApexChart;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {

        ApexChart chart = new ApexChart();
        chart.setType(Type.pie);

        ApexCharts charts = new ApexCharts()
                .withChart(chart)
                .withLabels("Team A", "Team B", "Team C", "Team D", "Team E")
                .withSeries(44.0, 55.0, 13.0, 43.0, 22.0);
        //.withResponsive(new ApexResponsive())
        add(charts);
    }
}
