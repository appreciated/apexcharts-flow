package com.github.appreciated.apexcharts;

import com.github.appreciated.apexcharts.examples.ExampleChartGenerator;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import com.vaadin.flow.theme.material.Material;

import java.util.Arrays;

@Route("")
@Theme(value = Material.class, variant = Lumo.LIGHT)
public class DemoView extends HorizontalLayout {
    VerticalLayout left = new VerticalLayout();
    VerticalLayout right = new VerticalLayout();

    public DemoView() {
        Arrays.stream(ExampleChartGenerator.getCharts()).map(ApexChartsBuilder::build).forEach(left::add);
        Arrays.stream(ExampleChartGenerator.getColoredCharts()).map(ApexChartsBuilder::build).forEach(right::add);
        setSizeFull();
        getStyle()
                .set("overflow", "auto");
        setSizeUndefined();
        add(left, right);
        left.setHeight("unset");
        left.setWidth("50%");
        right.setWidth("50%");
        right.setHeight("unset");
    }

}
