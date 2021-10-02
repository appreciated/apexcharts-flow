package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.Tooltip;
import com.github.appreciated.apexcharts.config.XAxis;
import com.github.appreciated.apexcharts.config.xaxis.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class XAxisBuilder {
    private XAxisType type;
    private List<String> categories;
    private AxisBorder axisBorder;
    private AxisTicks axisTicks;
    private BigDecimal tickAmount;
    private TickPlacement tickPlacement;
    private Double min;
    private Double max;
    private Double range;
    private Boolean floating;
    private String position;
    private Title title;
    private Crosshairs crosshairs;
    private com.github.appreciated.apexcharts.config.Tooltip tooltip;
    private Labels labels;

    private XAxisBuilder() {
    }

    public static XAxisBuilder get() {
        return new XAxisBuilder();
    }

    public XAxisBuilder withType(XAxisType type) {
        this.type = type;
        return this;
    }

    public XAxisBuilder withCategories(String... categories) {
        this.categories = Arrays.asList(categories);
        return this;
    }

    public XAxisBuilder withCategories(List<String> categories) {
        this.categories = categories;
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

    public XAxisBuilder withTickAmount(BigDecimal tickAmount) {
        this.tickAmount = tickAmount;
        return this;
    }

    public XAxisBuilder withTickPlacement(TickPlacement tickPlacement) {
        this.tickPlacement = tickPlacement;
        return this;
    }

    public XAxisBuilder withMin(Double min) {
        this.min = min;
        return this;
    }

    public XAxisBuilder withMax(Double max) {
        this.max = max;
        return this;
    }

    public XAxisBuilder withRange(Double range) {
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

    public XAxisBuilder withLabels(Labels labels) {
        this.labels = labels;
        return this;
    }

    public XAxis build() {
        XAxis xAxis = new XAxis();
        xAxis.setType(type);
        xAxis.setCategories(categories);
        xAxis.setAxisBorder(axisBorder);
        xAxis.setAxisTicks(axisTicks);
        xAxis.setTickAmount(tickAmount);
        xAxis.setTickPlacement(tickPlacement);
        xAxis.setMin(min);
        xAxis.setMax(max);
        xAxis.setRange(range);
        xAxis.setFloating(floating);
        xAxis.setPosition(position);
        xAxis.setTitle(title);
        xAxis.setCrosshairs(crosshairs);
        xAxis.setTooltip(tooltip);
        xAxis.setLabels(labels);
        return xAxis;
    }
}
