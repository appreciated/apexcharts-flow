package com.github.appreciated.apexcharts.examples.locale;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.builder.LegendBuilder;
import com.github.appreciated.apexcharts.config.builder.LocaleBuilder;
import com.github.appreciated.apexcharts.config.builder.ResponsiveBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.legend.Position;
import com.github.appreciated.apexcharts.config.responsive.builder.OptionsBuilder;
import com.vaadin.flow.router.Route;

@Route("locale")
public class LocaleExampleView extends ApexChartsBuilder {

    public LocaleExampleView() {
        withChart(
                ChartBuilder.get()
                        .withLocales(LocaleBuilder.get().withName("fr").build())
                        .withDefaultLocale("fr")
                        .withType(Type.DONUT).build())
                .withLegend(LegendBuilder.get()
                        .withPosition(Position.RIGHT)
                        .build())
                .withSeries(44.0, 55.0, 41.0, 17.0, 15.0)
                .withResponsive(ResponsiveBuilder.get()
                        .withBreakpoint(480.0)
                        .withOptions(OptionsBuilder.get()
                                .withLegend(LegendBuilder.get()
                                        .withPosition(Position.BOTTOM)
                                        .build())
                                .build())
                        .build()).build();
    }

}
