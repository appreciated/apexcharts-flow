package com.github.appreciated.apexcharts;

import com.github.appreciated.apexcharts.examples.ExampleChartGenerator;
import com.github.appreciated.apexcharts.examples.RevenueExample;
import com.github.appreciated.apexcharts.examples.event.ScatterChartWithEventsExample;
import com.github.appreciated.apexcharts.examples.tooltip.ScatterChartWithCustomTooltipsExample;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.Arrays;

@Route("")
public class DemoView extends HorizontalLayout {
    VerticalLayout left = new VerticalLayout();
    VerticalLayout right = new VerticalLayout();

    public DemoView() {
        initLayouts();
        addExamples();
    }

    private void initLayouts() {
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

    private void addExamples() {
        Arrays.stream(ExampleChartGenerator.getCharts()).map(ApexChartsBuilder::build).forEach(left::add);
        Arrays.stream(ExampleChartGenerator.getColoredCharts()).map(ApexChartsBuilder::build).forEach(right::add);
        left.add(new RevenueExample());
        right.add(new ScatterChartWithEventsExample().build());
        left.add(new ScatterChartWithCustomTooltipsExample().build());
    }

}
