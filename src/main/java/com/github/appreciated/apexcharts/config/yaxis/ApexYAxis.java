package com.github.appreciated.apexcharts.config.yaxis;

public class ApexYAxis {
    Boolean show;
    Boolean showAlways;
    String seriesName;
    Boolean opposite;
    Boolean logarithmic;
    double tickAmount;
    Boolean forceNiceScale;
    double min;
    double max;
    Boolean floating;
    double decimalsInFloat;
    Labels labels;
    AxisBorder axisBorder;
    AxisTicks axisTicks;
    Title title;
    Crosshairs crosshairs;
    Tooltip tooltip;

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Boolean getShowAlways() {
        return showAlways;
    }

    public void setShowAlways(Boolean showAlways) {
        this.showAlways = showAlways;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Boolean getOpposite() {
        return opposite;
    }

    public void setOpposite(Boolean opposite) {
        this.opposite = opposite;
    }

    public Boolean getLogarithmic() {
        return logarithmic;
    }

    public void setLogarithmic(Boolean logarithmic) {
        this.logarithmic = logarithmic;
    }

    public double getTickAmount() {
        return tickAmount;
    }

    public void setTickAmount(double tickAmount) {
        this.tickAmount = tickAmount;
    }

    public Boolean getForceNiceScale() {
        return forceNiceScale;
    }

    public void setForceNiceScale(Boolean forceNiceScale) {
        this.forceNiceScale = forceNiceScale;
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

    public Boolean getFloating() {
        return floating;
    }

    public void setFloating(Boolean floating) {
        this.floating = floating;
    }

    public double getDecimalsInFloat() {
        return decimalsInFloat;
    }

    public void setDecimalsInFloat(double decimalsInFloat) {
        this.decimalsInFloat = decimalsInFloat;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setLabels(Labels labels) {
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
