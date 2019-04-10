package com.github.appreciated.apexcharts.config.chart.zoom.builder;

import com.github.appreciated.apexcharts.config.chart.zoom.Type;
import com.github.appreciated.apexcharts.config.chart.zoom.Zoom;
import com.github.appreciated.apexcharts.config.chart.zoom.ZoomedArea;

public class ZoomBuilder {
    private Boolean enabled;
    private Type type;
    private ZoomedArea zoomedArea;

    private ZoomBuilder() {
    }

    public static ZoomBuilder get() {
        return new ZoomBuilder();
    }

    public ZoomBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public ZoomBuilder withType(Type type) {
        this.type = type;
        return this;
    }

    public ZoomBuilder withZoomedArea(ZoomedArea zoomedArea) {
        this.zoomedArea = zoomedArea;
        return this;
    }

    public Zoom build() {
        Zoom zoom = new Zoom();
        zoom.setEnabled(enabled);
        zoom.setType(type);
        zoom.setZoomedArea(zoomedArea);
        return zoom;
    }
}
