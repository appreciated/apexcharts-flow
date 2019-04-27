package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.PlotOptions;
import com.github.appreciated.apexcharts.config.plotoptions.*;

public class PlotOptionsBuilder {
    private Bar bar;
    private Candlestick candlestick;
    private Heatmap heatmap;
    private Pie pie;
    private Radar radar;
    private RadialBar radialBar;

    private PlotOptionsBuilder() {
    }

    public static PlotOptionsBuilder get() {
        return new PlotOptionsBuilder();
    }

    public PlotOptionsBuilder withBar(Bar bar) {
        this.bar = bar;
        return this;
    }

    public PlotOptionsBuilder withCandlestick(Candlestick candlestick) {
        this.candlestick = candlestick;
        return this;
    }

    public PlotOptionsBuilder withHeatmap(Heatmap heatmap) {
        this.heatmap = heatmap;
        return this;
    }

    public PlotOptionsBuilder withPie(Pie pie) {
        this.pie = pie;
        return this;
    }

    public PlotOptionsBuilder withRadar(Radar radar) {
        this.radar = radar;
        return this;
    }

    public PlotOptionsBuilder withRadialBar(RadialBar radialBar) {
        this.radialBar = radialBar;
        return this;
    }

    public PlotOptions build() {
        PlotOptions plotOptions = new PlotOptions();
        plotOptions.setBar(bar);
        plotOptions.setCandlestick(candlestick);
        plotOptions.setHeatmap(heatmap);
        plotOptions.setPie(pie);
        plotOptions.setRadar(radar);
        plotOptions.setRadialBar(radialBar);
        return plotOptions;
    }
}
