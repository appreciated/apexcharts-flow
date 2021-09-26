package com.github.appreciated.apexcharts.config.chart;

import com.github.appreciated.apexcharts.config.chart.zoom.ZoomType;
import com.github.appreciated.apexcharts.config.chart.zoom.ZoomedArea;

public class Zoom {
    private Boolean enabled;
    private ZoomType type;
    private ZoomedArea zoomedArea;
    private Boolean autoScaleYaxis;


    public Zoom() {
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public ZoomType getType() {
        return type;
    }

    public ZoomedArea getZoomedArea() {
        return zoomedArea;
    }

    public Boolean getAutoScaleYaxis() {
        return autoScaleYaxis;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setType(ZoomType type) {
        this.type = type;
    }

    public void setZoomedArea(ZoomedArea zoomedArea) {
        this.zoomedArea = zoomedArea;
    }

    public void setAutoScaleYaxis(final Boolean autoScaleYaxis) {
        this.autoScaleYaxis = autoScaleYaxis;
    }

}