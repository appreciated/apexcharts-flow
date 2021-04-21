package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.yaxis.*;

public class YAxis {
    private Boolean show;
    private Boolean showAlways;
    private String seriesName;
    private Boolean opposite;
    private Boolean logarithmic;
    private Double tickAmount;
    private Boolean forceNiceScale;
    private Object min;
    private Object max;
    private Boolean floating;
    private Double decimalsInFloat;
    private Labels labels;
    private AxisBorder axisBorder;
    private AxisTicks axisTicks;
    private Title title;
    private Crosshairs crosshairs;
    private Tooltip tooltip;


    public YAxis() {
    }

    public Boolean getShow() {
        return show;
    }

    public Boolean getShowAlways() {
        return showAlways;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public Boolean getOpposite() {
        return opposite;
    }

    public Boolean getLogarithmic() {
        return logarithmic;
    }

    public Double getTickAmount() {
        return tickAmount;
    }

    public Boolean getForceNiceScale() {
        return forceNiceScale;
    }

    public Object getMin() {
        return min;
    }

    public Object getMax() {
        return max;
    }

    public Boolean getFloating() {
        return floating;
    }

    public Double getDecimalsInFloat() {
        return decimalsInFloat;
    }

    public Labels getLabels() {
        return labels;
    }

    public AxisBorder getAxisBorder() {
        return axisBorder;
    }

    public AxisTicks getAxisTicks() {
        return axisTicks;
    }

    public Title getTitle() {
        return title;
    }

    public Crosshairs getCrosshairs() {
        return crosshairs;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setShowAlways(Boolean showAlways) {
        this.showAlways = showAlways;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public void setOpposite(Boolean opposite) {
        this.opposite = opposite;
    }

    public void setLogarithmic(Boolean logarithmic) {
        this.logarithmic = logarithmic;
    }

    public void setTickAmount(Double tickAmount) {
        this.tickAmount = tickAmount;
    }

    public void setForceNiceScale(Boolean forceNiceScale) {
        this.forceNiceScale = forceNiceScale;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public void setMin(Object min) {
        this.min = min;
    }

    public void setMax(Object max) {
        this.max = max;
    }

    public void setFloating(Boolean floating) {
        this.floating = floating;
    }

    public void setDecimalsInFloat(Double decimalsInFloat) {
        this.decimalsInFloat = decimalsInFloat;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    public void setAxisBorder(AxisBorder axisBorder) {
        this.axisBorder = axisBorder;
    }

    public void setAxisTicks(AxisTicks axisTicks) {
        this.axisTicks = axisTicks;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public void setCrosshairs(Crosshairs crosshairs) {
        this.crosshairs = crosshairs;
    }

    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

}
