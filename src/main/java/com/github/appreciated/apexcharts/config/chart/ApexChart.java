package com.github.appreciated.apexcharts.config.chart;

import com.github.appreciated.apexcharts.config.chart.chart.*;
import com.github.appreciated.apexcharts.config.chart.chart.toolbar.Toolbar;
import com.github.appreciated.apexcharts.config.chart.chart.zoom.Zoom;

public class ApexChart {
    Type type;
    String foreColor;
    String fontFamily;
    String background;
    double offsetX;
    double offsetY;
    DropShadow dropShadow;
    Brush brush;
    String id;
    //ApexLocale[] locales;
    String defaultLocale;
    Sparkline sparkline;
    Boolean stacked;
    StackType stackType;
    Toolbar toolbar;
    Zoom zoom;
    Selection selection;
    Animations animations;

    public ApexChart withType(Type type) {
        this.type = type;
        return this;
    }

    public ApexChart withForeColor(String foreColor) {
        this.foreColor = foreColor;
        return this;
    }

    public ApexChart withFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public ApexChart withBackground(String background) {
        this.background = background;
        return this;
    }

    public ApexChart withOffsetX(double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public ApexChart withOffsetY(double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public ApexChart withDropShadow(DropShadow dropShadow) {
        this.dropShadow = dropShadow;
        return this;
    }

    public ApexChart withBrush(Brush brush) {
        this.brush = brush;
        return this;
    }

    public ApexChart withId(String id) {
        this.id = id;
        return this;
    }

    public ApexChart withDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
        return this;
    }

    public ApexChart withSparkline(Sparkline sparkline) {
        this.sparkline = sparkline;
        return this;
    }

    public ApexChart withStacked(Boolean stacked) {
        this.stacked = stacked;
        return this;
    }

    public ApexChart withStackType(StackType stackType) {
        this.stackType = stackType;
        return this;
    }

    public ApexChart withToolbar(Toolbar toolbar) {
        this.toolbar = toolbar;
        return this;
    }

    public ApexChart withZoom(Zoom zoom) {
        this.zoom = zoom;
        return this;
    }

    public ApexChart withSelection(Selection selection) {
        this.selection = selection;
        return this;
    }

    public ApexChart withAnimations(Animations animations) {
        this.animations = animations;
        return this;
    }
}


