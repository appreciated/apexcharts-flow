package com.github.appreciated.apexcharts;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(value = "form-layout")
public class FormLayoutView extends FormLayout {
    public FormLayoutView() {
        ExampleChartGenerator generator = new ExampleChartGenerator();
        for (ApexCharts chart : ExampleChartGenerator.getCharts()) {
            chart.getStyle().set("align-self", "center");
            add(new Div(chart));
        }
    }
}
