package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.Tooltip;
import com.github.appreciated.apexcharts.config.YAxis;
import com.github.appreciated.apexcharts.config.yaxis.*;

import java.time.LocalDate;
import java.time.ZoneId;

public class YAxisBuilder {
    private Boolean show;
    private Boolean showAlways;
    private Boolean showForNullSeries;
    private String seriesName;
    private Boolean opposite;
    private Boolean reversed;
    private Boolean logarithmic;
    private Double logBase;
    private Double tickAmount;
    private Boolean forceNiceScale;
    private Object min;
    private Object max;
    private Boolean floating;
    private Double decimalsInFloat;
    private Double stepSize;
    private Labels labels;
    private AxisBorder axisBorder;
    private AxisTicks axisTicks;
    private Title title;
    private Crosshairs crosshairs;
    private com.github.appreciated.apexcharts.config.Tooltip tooltip;

    private YAxisBuilder() {
    }

    public static YAxisBuilder get() {
        return new YAxisBuilder();
    }

    public YAxisBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public YAxisBuilder withShowAlways(Boolean showAlways) {
        this.showAlways = showAlways;
        return this;
    }

    public YAxisBuilder withShowForNullSeries(Boolean showForNullSeries) {
        this.showForNullSeries = showForNullSeries;
        return this;
    }

    public YAxisBuilder withSeriesName(String seriesName) {
        this.seriesName = seriesName;
        return this;
    }

    public YAxisBuilder withOpposite(Boolean opposite) {
        this.opposite = opposite;
        return this;
    }

    public YAxisBuilder withReversed(Boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public YAxisBuilder withLogarithmic(Boolean logarithmic) {
        this.logarithmic = logarithmic;
        return this;
    }

    public YAxisBuilder withLogBase(Double logBase) {
        this.logBase = logBase;
        return this;
    }

    public YAxisBuilder withTickAmount(Double tickAmount) {
        this.tickAmount = tickAmount;
        return this;
    }

    public YAxisBuilder withForceNiceScale(Boolean forceNiceScale) {
        this.forceNiceScale = forceNiceScale;
        return this;
    }

    public YAxisBuilder withMin(Double min) {
        this.min = min;
        return this;
    }

    public YAxisBuilder withMax(Double max) {
        this.max = max;
        return this;
    }

    public YAxisBuilder withMin(Object min) {
        this.min = min;
        return this;
    }

    public YAxisBuilder withMax(Object max) {
        this.max = max;
        return this;
    }

    public YAxisBuilder withMin(LocalDate min) {
        ZoneId zoneId = ZoneId.systemDefault();
        this.min = min.atStartOfDay(zoneId).toInstant().toEpochMilli();
        return this;
    }

    public YAxisBuilder withMax(LocalDate max) {
        ZoneId zoneId = ZoneId.systemDefault();
        this.max = max.atStartOfDay(zoneId).toInstant().toEpochMilli();
        return this;
    }

    public YAxisBuilder withFloating(Boolean floating) {
        this.floating = floating;
        return this;
    }

    public YAxisBuilder withDecimalsInFloat(Double decimalsInFloat) {
        this.decimalsInFloat = decimalsInFloat;
        return this;
    }

    public YAxisBuilder withStepSize(Double stepSize) {
        this.stepSize = stepSize;
        return this;
    }

    public YAxisBuilder withLabels(Labels labels) {
        this.labels = labels;
        return this;
    }

    public YAxisBuilder withAxisBorder(AxisBorder axisBorder) {
        this.axisBorder = axisBorder;
        return this;
    }

    public YAxisBuilder withAxisTicks(AxisTicks axisTicks) {
        this.axisTicks = axisTicks;
        return this;
    }

    public YAxisBuilder withTitle(Title title) {
        this.title = title;
        return this;
    }

    public YAxisBuilder withCrosshairs(Crosshairs crosshairs) {
        this.crosshairs = crosshairs;
        return this;
    }

    public YAxisBuilder withTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public YAxis build() {
        YAxis yAxis = new YAxis();
        yAxis.setShow(show);
        yAxis.setShowAlways(showAlways);
        yAxis.setShowForNullSeries(showForNullSeries);
        yAxis.setSeriesName(seriesName);
        yAxis.setOpposite(opposite);
        yAxis.setReversed(reversed);
        yAxis.setLogarithmic(logarithmic);
        yAxis.setLogBase(logBase);
        yAxis.setTickAmount(tickAmount);
        yAxis.setForceNiceScale(forceNiceScale);
        yAxis.setMin(min);
        yAxis.setMax(max);
        yAxis.setFloating(floating);
        yAxis.setDecimalsInFloat(decimalsInFloat);
        yAxis.setStepSize(stepSize);
        yAxis.setLabels(labels);
        yAxis.setAxisBorder(axisBorder);
        yAxis.setAxisTicks(axisTicks);
        yAxis.setTitle(title);
        yAxis.setCrosshairs(crosshairs);
        yAxis.setTooltip(tooltip);
        return yAxis;
    }
}
