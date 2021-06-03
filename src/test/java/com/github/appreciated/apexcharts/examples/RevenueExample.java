package com.github.appreciated.apexcharts.examples;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.TitleSubtitleBuilder;
import com.github.appreciated.apexcharts.examples.bar.RangedVerticalBarChartExample;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class RevenueExample extends Div {

    public RevenueExample() {
        ApexChartsBuilder rangedVerticalBarChartBuilder = new RangedVerticalBarChartExample();
        ApexCharts verticalBarChartExample = rangedVerticalBarChartBuilder
                .withTitle(TitleSubtitleBuilder.get().withText("Revenue Example").build())
                .build();

        Button toggleButton = new Button("Toggle", click -> verticalBarChartExample.toggleSeries("Revenue"));
        Button hideButton = new Button("Hide", click -> verticalBarChartExample.hideSeries("Revenue"));
        Button showButton = new Button("Show", click -> verticalBarChartExample.showSeries("Revenue"));
        Button resetButton = new Button("Reset", click -> verticalBarChartExample.resetSeries(true, true));

        HorizontalLayout hl = new HorizontalLayout();
        hl.add(toggleButton, hideButton, showButton, resetButton);
        add(verticalBarChartExample, new Span("Revenue series control: "), hl);
        setWidthFull();
    }
}
