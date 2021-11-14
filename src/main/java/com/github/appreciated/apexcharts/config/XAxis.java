package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.xaxis.*;

import java.math.BigDecimal;
import java.util.List;

public class XAxis {
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
    private Tooltip tooltip;
    private Labels labels;

    public XAxis() {
    }

    public XAxisType getType() {
        return type;
    }

    public List<String> getCategories() {
        return categories;
    }

    public AxisBorder getAxisBorder() {
        return axisBorder;
    }

    public AxisTicks getAxisTicks() {
        return axisTicks;
    }

    public BigDecimal getTickAmount() {
        return tickAmount;
    }

    public TickPlacement getTickPlacement() {
        return tickPlacement;
    }

    public Double getMin() {
        return min;
    }

    public Double getMax() {
        return max;
    }

    public Double getRange() {
        return range;
    }

    public Boolean getFloating() {
        return floating;
    }

    public String getPosition() {
        return position;
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

    public Labels getLabels() {
        return labels;
    }

    public void setType(XAxisType type) {
        this.type = type;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public void setAxisBorder(AxisBorder axisBorder) {
        this.axisBorder = axisBorder;
    }

    public void setAxisTicks(AxisTicks axisTicks) {
        this.axisTicks = axisTicks;
    }

    public void setTickAmount(BigDecimal tickAmount) {
        this.tickAmount = tickAmount;
    }

    public void setTickPlacement(TickPlacement tickPlacement) {
        this.tickPlacement = tickPlacement;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public void setRange(Double range) {
        this.range = range;
    }

    public void setFloating(Boolean floating) {
        this.floating = floating;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

}
