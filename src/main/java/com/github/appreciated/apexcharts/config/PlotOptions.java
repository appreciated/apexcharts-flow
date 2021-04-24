package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.plotoptions.*;
import com.github.appreciated.apexcharts.config.plotoptions.boxplot.BoxPlot;

public class PlotOptions {
    private Bar bar;
    private Candlestick candlestick;
    private Heatmap heatmap;
    private Pie pie;
    private Radar radar;
    private RadialBar radialBar;
    private BoxPlot boxPlot;


    public PlotOptions() {
    }

    public Bar getBar() {
        return bar;
    }

    public Candlestick getCandlestick() {
        return candlestick;
    }

    public Heatmap getHeatmap() {
        return heatmap;
    }

    public Pie getPie() {
        return pie;
    }

    public Radar getRadar() {
        return radar;
    }

    public RadialBar getRadialBar() {
        return radialBar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public void setCandlestick(Candlestick candlestick) {
        this.candlestick = candlestick;
    }

    public void setHeatmap(Heatmap heatmap) {
        this.heatmap = heatmap;
    }

    public void setPie(Pie pie) {
        this.pie = pie;
    }

    public void setRadar(Radar radar) {
        this.radar = radar;
    }

    public void setRadialBar(RadialBar radialBar) {
        this.radialBar = radialBar;
    }

    public BoxPlot getBoxPlot() {
        return boxPlot;
    }

    public void setBoxPlot(BoxPlot boxPlot) {
        this.boxPlot = boxPlot;
    }
}
