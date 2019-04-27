package com.github.appreciated.apexcharts.config.chart;

import com.github.appreciated.apexcharts.config.chart.selection.Fill;
import com.github.appreciated.apexcharts.config.chart.selection.Stroke;
import com.github.appreciated.apexcharts.config.chart.selection.Xaxis;
import com.github.appreciated.apexcharts.config.chart.selection.Yaxis;

public class Selection {
    private Boolean enabled;
    private String type;
    private Fill fill;
    private Stroke stroke;
    private Xaxis xaxis;
    private Yaxis yaxis;


    public Selection() {
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public String getType() {
        return type;
    }

    public Fill getFill() {
        return fill;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public Xaxis getXaxis() {
        return xaxis;
    }

    public Yaxis getYaxis() {
        return yaxis;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFill(Fill fill) {
        this.fill = fill;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public void setXaxis(Xaxis xaxis) {
        this.xaxis = xaxis;
    }

    public void setYaxis(Yaxis yaxis) {
        this.yaxis = yaxis;
    }

}
