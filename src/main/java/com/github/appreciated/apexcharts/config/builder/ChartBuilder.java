package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.Chart;
import com.github.appreciated.apexcharts.config.chart.*;
import com.github.appreciated.apexcharts.config.chart.toolbar.Toolbar;
import com.github.appreciated.apexcharts.config.chart.zoom.Zoom;

public class ChartBuilder {
    private Type type;
    private String foreColor;
    private String fontFamily;
    private String background;
    private Double offsetX;
    private Double offsetY;
    private DropShadow dropShadow;
    private Brush brush;
    private String id;
    private String defaultLocale;
    private Sparkline sparkline;
    private Boolean stacked;
    private StackType stackType;
    private Toolbar toolbar;
    private Zoom zoom;
    private Selection selection;
    private Animations animations;

    private ChartBuilder() {
    }

    public static ChartBuilder get() {
        return new ChartBuilder();
    }

    public ChartBuilder withType(Type type) {
        this.type = type;
        return this;
    }

    public ChartBuilder withForeColor(String foreColor) {
        this.foreColor = foreColor;
        return this;
    }

    public ChartBuilder withFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public ChartBuilder withBackground(String background) {
        this.background = background;
        return this;
    }

    public ChartBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public ChartBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public ChartBuilder withDropShadow(DropShadow dropShadow) {
        this.dropShadow = dropShadow;
        return this;
    }

    public ChartBuilder withBrush(Brush brush) {
        this.brush = brush;
        return this;
    }

    public ChartBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public ChartBuilder withDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
        return this;
    }

    public ChartBuilder withSparkline(Sparkline sparkline) {
        this.sparkline = sparkline;
        return this;
    }

    public ChartBuilder withStacked(Boolean stacked) {
        this.stacked = stacked;
        return this;
    }

    public ChartBuilder withStackType(StackType stackType) {
        this.stackType = stackType;
        return this;
    }

    public ChartBuilder withToolbar(Toolbar toolbar) {
        this.toolbar = toolbar;
        return this;
    }

    public ChartBuilder withZoom(Zoom zoom) {
        this.zoom = zoom;
        return this;
    }

    public ChartBuilder withSelection(Selection selection) {
        this.selection = selection;
        return this;
    }

    public ChartBuilder withAnimations(Animations animations) {
        this.animations = animations;
        return this;
    }

    public Chart build() {
        Chart chart = new Chart();
        chart.setType(type);
        chart.setForeColor(foreColor);
        chart.setFontFamily(fontFamily);
        chart.setBackground(background);
        chart.setOffsetX(offsetX);
        chart.setOffsetY(offsetY);
        chart.setDropShadow(dropShadow);
        chart.setBrush(brush);
        chart.setId(id);
        chart.setDefaultLocale(defaultLocale);
        chart.setSparkline(sparkline);
        chart.setStacked(stacked);
        chart.setStackType(stackType);
        chart.setToolbar(toolbar);
        chart.setZoom(zoom);
        chart.setSelection(selection);
        chart.setAnimations(animations);
        return chart;
    }
}
