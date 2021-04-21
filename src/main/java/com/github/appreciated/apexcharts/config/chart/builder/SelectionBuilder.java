package com.github.appreciated.apexcharts.config.chart.builder;

import com.github.appreciated.apexcharts.config.chart.Selection;
import com.github.appreciated.apexcharts.config.chart.selection.Fill;
import com.github.appreciated.apexcharts.config.chart.selection.Stroke;
import com.github.appreciated.apexcharts.config.chart.selection.Xaxis;
import com.github.appreciated.apexcharts.config.chart.selection.Yaxis;

public class SelectionBuilder {
    private Boolean enabled;
    private String type;
    private Fill fill;
    private Stroke stroke;
    private Xaxis xaxis;
    private Yaxis yaxis;

    private SelectionBuilder() {
    }

    public static SelectionBuilder get() {
        return new SelectionBuilder();
    }

    public SelectionBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public SelectionBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public SelectionBuilder withFill(Fill fill) {
        this.fill = fill;
        return this;
    }

    public SelectionBuilder withStroke(Stroke stroke) {
        this.stroke = stroke;
        return this;
    }

    public SelectionBuilder withXaxis(Xaxis xaxis) {
        this.xaxis = xaxis;
        return this;
    }

    public SelectionBuilder withYaxis(Yaxis yaxis) {
        this.yaxis = yaxis;
        return this;
    }

    public Selection build() {
        Selection selection = new Selection();
        selection.setEnabled(enabled);
        selection.setType(type);
        selection.setFill(fill);
        selection.setStroke(stroke);
        selection.setXaxis(xaxis);
        selection.setYaxis(yaxis);
        return selection;
    }
}
