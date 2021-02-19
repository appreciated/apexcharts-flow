package com.github.appreciated.apexcharts;

import com.github.appreciated.apexcharts.config.builder.TitleSubtitleBuilder;
import com.github.appreciated.apexcharts.examples.ExampleChartGenerator;
import com.github.appreciated.apexcharts.examples.bar.RangedVerticalBarChartExample;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.Arrays;

@Route("")
public class DemoView extends HorizontalLayout {
    VerticalLayout left = new VerticalLayout();
    VerticalLayout right = new VerticalLayout();

    public DemoView() {
        Arrays.stream(ExampleChartGenerator.getCharts()).map(ApexChartsBuilder::build).forEach(left::add);
        Arrays.stream(ExampleChartGenerator.getColoredCharts()).map(ApexChartsBuilder::build).forEach(right::add);

        ApexChartsBuilder rangedVerticalBarChartBuilder = new RangedVerticalBarChartExample();
        ApexCharts verticalBarChartExample = rangedVerticalBarChartBuilder
                .withTitle(TitleSubtitleBuilder.get().withText("Revenue Example").build())
                .build();

        Button toggleButton = new Button("Toggle", click -> verticalBarChartExample.toggleSeries("Revenue"));
        Button hideButton = new Button("Hide", click -> verticalBarChartExample.hideSeries("Revenue"));
        Button showButton = new Button("Show", click -> verticalBarChartExample.showSeries("Revenue"));
        Button resetButton = new Button("Reset", click -> verticalBarChartExample.resetSeries(true, true));

        Div div = new Div();
        HorizontalLayout hl = new HorizontalLayout();

        hl.add(toggleButton, hideButton, showButton, resetButton);
        div.add(verticalBarChartExample, new Span("Revenue series control: "), hl);
        left.add(div);

        div.setWidthFull();

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
