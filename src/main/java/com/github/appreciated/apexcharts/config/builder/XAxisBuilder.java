package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.Tooltip;
import com.github.appreciated.apexcharts.config.XAxis;
import com.github.appreciated.apexcharts.config.xaxis.*;

import java.util.Arrays;
import java.util.List;

public class XAxisBuilder {
    private Type type;
    private List<String> categories;
    private List<String> labels;
    private AxisBorder axisBorder;
    private AxisTicks axisTicks;
    private double tickAmount;
    private double min;
    private double max;
    private double range;
    private Boolean floating;
    private String position;
    private Title title;
    private Crosshairs crosshairs;
    private com.github.appreciated.apexcharts.config.Tooltip tooltip;

    private XAxisBuilder() {
    }

    public static XAxisBuilder get() {
        return new XAxisBuilder();
    }

    public XAxisBuilder withType(Type type) {
        this.type = type;
        return this;
    }

    public XAxisBuilder withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public XAxisBuilder withCategories(String ... categories) {
        this.categories = Arrays.asList(categories);
        return this;
    }

    public XAxisBuilder withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public XAxisBuilder withAxisBorder(AxisBorder axisBorder) {
        this.axisBorder = axisBorder;
        return this;
    }

    public XAxisBuilder withAxisTicks(AxisTicks axisTicks) {
        this.axisTicks = axisTicks;
        return this;
    }

    public XAxisBuilder withTickAmount(double tickAmount) {
        this.tickAmount = tickAmount;
        return this;
    }

    public XAxisBuilder withMin(double min) {
        this.min = min;
        return this;
    }

    public XAxisBuilder withMax(double max) {
        this.max = max;
        return this;
    }

    public XAxisBuilder withRange(double range) {
        this.range = range;
        return this;
    }

    public XAxisBuilder withFloating(Boolean floating) {
        this.floating = floating;
        return this;
    }

    public XAxisBuilder withPosition(String position) {
        this.position = position;
        return this;
    }

    public XAxisBuilder withTitle(Title title) {
        this.title = title;
        return this;
    }

    public XAxisBuilder withCrosshairs(Crosshairs crosshairs) {
        this.crosshairs = crosshairs;
        return this;
    }

    public XAxisBuilder withTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public XAxis build() {
        XAxis xAxis = new XAxis();
        xAxis.setType(type);
        xAxis.setCategories(categories);
        xAxis.setLabels(labels);
        xAxis.setAxisBorder(axisBorder);
        xAxis.setAxisTicks(axisTicks);
        xAxis.setTickAmount(tickAmount);
        xAxis.setMin(min);
        xAxis.setMax(max);
        xAxis.setRange(range);
        xAxis.setFloating(floating);
        xAxis.setPosition(position);
        xAxis.setTitle(title);
        xAxis.setCrosshairs(crosshairs);
        xAxis.setTooltip(tooltip);
        return xAxis;
    }
}
