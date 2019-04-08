package com.github.appreciated;

import com.github.appreciated.apexcharts.ApexChart;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        add(new ApexChart());
    }
}
