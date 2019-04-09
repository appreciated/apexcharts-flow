package com.github.appreciated;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.config.ApexChart;
import com.github.appreciated.apexcharts.config.Type;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {

        ApexCharts chart = new ApexCharts()
                .withChart(new ApexChart().withType(Type.pie))
                .withLabels("Team A", "Team B", "Team C", "Team D", "Team E")
                .withSeries(44, 55, 13, 43, 22);
                //.withResponsive(new ApexResponsive())
        add(chart);
    }
}
