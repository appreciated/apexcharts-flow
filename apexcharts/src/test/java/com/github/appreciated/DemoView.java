package com.github.appreciated;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import java.util.Arrays;

@Route("")
//@Theme(value = Material.class,variant = Material.DARK)
public class DemoView extends Div {

    public DemoView() {
        ExampleChartGenerator generator = new ExampleChartGenerator();
        Arrays.stream(generator.getCharts()).forEach(this::add);
        setSizeFull();
        getStyle()
                .set("display", "flex")
                .set("flex-direction", "column")
                .set("overflow", "auto");
        setSizeUndefined();
    }

}
