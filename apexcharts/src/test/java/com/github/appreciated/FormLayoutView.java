package com.github.appreciated;

import com.github.appreciated.apexcharts.ApexCharts;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.material.Material;

@Route(value = "form-layout")
@Theme(value = Material.class)
public class FormLayoutView extends FormLayout {
    public FormLayoutView() {
        ExampleChartGenerator generator = new ExampleChartGenerator();
        for (ApexCharts chart : generator.getCharts()) {
            chart.getStyle().set("align-self", "center");
            add(chart);
        }
    }
}
