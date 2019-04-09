package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.xaxis.*;

public class ApexXAxis {
    Type type;
    double[] categories;
    String[] labels;
    AxisBorder axisBorder;
    AxisTicks axisTicks;
    double tickAmount;
    double min;
    double max;
    double range;
    Boolean floating;
    String position;
    Title title;
    Crosshairs crosshairs;
    Tooltip tooltip;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double[] getCategories() {
        return categories;
    }

    public void setCategories(double[] categories) {
        this.categories = categories;
    }

    public String[] getLabels() {
        return labels;
    }

    public void setLabels(String[] labels) {
        this.labels = labels;
    }

    public AxisBorder getAxisBorder() {
        return axisBorder;
    }

    public void setAxisBorder(AxisBorder axisBorder) {
        this.axisBorder = axisBorder;
    }

    public AxisTicks getAxisTicks() {
        return axisTicks;
    }

    public void setAxisTicks(AxisTicks axisTicks) {
        this.axisTicks = axisTicks;
    }

    public double getTickAmount() {
        return tickAmount;
    }

    public void setTickAmount(double tickAmount) {
        this.tickAmount = tickAmount;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public Boolean getFloating() {
        return floating;
    }

    public void setFloating(Boolean floating) {
        this.floating = floating;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Crosshairs getCrosshairs() {
        return crosshairs;
    }

    public void setCrosshairs(Crosshairs crosshairs) {
        this.crosshairs = crosshairs;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }
}
