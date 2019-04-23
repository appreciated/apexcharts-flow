package com.github.appreciated;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        ExampleChartGenerator generator = new ExampleChartGenerator();
        add(generator.getPieChart());
        add(generator.getDonutChart());
        add(generator.getLineChart());
        add(generator.getAreaChart());
        add(generator.getBubbleChart());
        add(generator.getHorizontalBarChart());
        add(generator.getVerticalBarChart());
        add(generator.getRadialBarChart());
        add(generator.getGradientRadialBarChart());
        add(generator.getMultiRadialBarChart());
        add(generator.getCandleStickChart());
        add(generator.getRadarChart());
        add(generator.getScatterChart());
        add(generator.getHeatMapChart());
        setSizeFull();
        getStyle().set("overflow", "auto");
    }

}
