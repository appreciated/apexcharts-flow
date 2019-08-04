package com.github.appreciated.apexcharts.config.chart.builder;

import com.github.appreciated.apexcharts.config.chart.Brush;

public class BrushBuilder {
    private Boolean enabled;
    private Boolean autoScaleYaxis;
    private String target;

    private BrushBuilder() {
    }

    public static BrushBuilder get() {
        return new BrushBuilder();
    }

    public BrushBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public BrushBuilder withAutoScaleYaxis(Boolean autoScaleYaxis) {
        this.autoScaleYaxis = autoScaleYaxis;
        return this;
    }

    public BrushBuilder withTarget(String target) {
        this.target = target;
        return this;
    }

    public Brush build() {
        Brush brush = new Brush();
        brush.setEnabled(enabled);
        brush.setAutoScaleYaxis(autoScaleYaxis);
        brush.setTarget(target);
        return brush;
    }
}
