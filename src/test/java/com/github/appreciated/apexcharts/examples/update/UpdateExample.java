package com.github.appreciated.apexcharts.examples.update;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.TitleSubtitle;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.builder.DataLabelsBuilder;
import com.github.appreciated.apexcharts.config.builder.PlotOptionsBuilder;
import com.github.appreciated.apexcharts.config.builder.TitleSubtitleBuilder;
import com.github.appreciated.apexcharts.config.builder.XAxisBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.plotoptions.builder.BarBuilder;
import com.github.appreciated.apexcharts.helper.Series;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.UUID;

@Route("update")
public class UpdateExample extends VerticalLayout {

    public TitleSubtitle getRandomTitle() {
        return TitleSubtitleBuilder.get().withText(UUID.randomUUID().toString()).build();
    }

    public UpdateExample() {
        ApexCharts chart = ApexChartsBuilder.get().withChart(ChartBuilder.get()
                .withType(Type.BAR)
                .build())
                .withPlotOptions(PlotOptionsBuilder.get()
                        .withBar(BarBuilder.get()
                                .withHorizontal(true)
                                .build())
                        .build())
                .withDataLabels(DataLabelsBuilder.get()
                        .withEnabled(false)
                        .build())
                .withSeries(new Series<>(400.0, 430.0, 448.0, 470.0, 540.0, 580.0, 690.0, 1100.0, 1200.0, 1380.0))
                .withXaxis(XAxisBuilder.get()
                        .withCategories()
                        .build())
                .withTitle(getRandomTitle())
                .build();
        chart.setHeight("400px");
        Button update = new Button("Update", buttonClickEvent -> {
            chart.setTitle(getRandomTitle());
            chart.updateConfig();
            Notification.show("The chart was updated!");
        });
        add(chart, update);
    }
}
