package com.github.appreciated.apexcharts.config.chart;

import com.github.appreciated.apexcharts.config.chart.plotoptions.*;

public class ApexPlotOptions {
    Bar bar;
    Candlestick candlestick;
    Heatmap heatmap;
    Pie pie;
    Radar radar;
    RadialBar radialBar;

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public Candlestick getCandlestick() {
        return candlestick;
    }

    public void setCandlestick(Candlestick candlestick) {
        this.candlestick = candlestick;
    }

    public Heatmap getHeatmap() {
        return heatmap;
    }

    public void setHeatmap(Heatmap heatmap) {
        this.heatmap = heatmap;
    }

    public Pie getPie() {
        return pie;
    }

    public void setPie(Pie pie) {
        this.pie = pie;
    }

    public Radar getRadar() {
        return radar;
    }

    public void setRadar(Radar radar) {
        this.radar = radar;
    }

    public RadialBar getRadialBar() {
        return radialBar;
    }

    public void setRadialBar(RadialBar radialBar) {
        this.radialBar = radialBar;
    }
}
