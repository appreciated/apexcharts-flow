package com.github.appreciated.apexcharts.config.chart.builder;

import com.github.appreciated.apexcharts.config.chart.Zoom;
import com.github.appreciated.apexcharts.config.chart.zoom.ZoomType;
import com.github.appreciated.apexcharts.config.chart.zoom.ZoomedArea;

public class ZoomBuilder {
    private Boolean enabled;
    private ZoomType type;
    private ZoomedArea zoomedArea;
    private Boolean autoScaleYaxis;

    private ZoomBuilder() {
    }

    public static ZoomBuilder get() {
        return new ZoomBuilder();
    }

    public ZoomBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public ZoomBuilder withType(ZoomType type) {
        this.type = type;
        return this;
    }

    public ZoomBuilder withZoomedArea(ZoomedArea zoomedArea) {
        this.zoomedArea = zoomedArea;
        return this;
    }

    public ZoomBuilder withAutoScaleYaxis(Boolean autoScaleYaxis) {
        this.autoScaleYaxis = autoScaleYaxis;
        return this;
    }

    public Zoom build() {
        Zoom zoom = new Zoom();
        zoom.setEnabled(enabled);
        zoom.setType(type);
        zoom.setZoomedArea(zoomedArea);
        zoom.setAutoScaleYaxis(autoScaleYaxis);
        return zoom;
    }
}
