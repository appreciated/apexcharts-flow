package com.github.appreciated.apexcharts.config.chart.chart.zoom;

public class Zoom {
    Boolean enabled;
    Type type;
    ZoomedArea zoomedArea;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public ZoomedArea getZoomedArea() {
        return zoomedArea;
    }

    public void setZoomedArea(ZoomedArea zoomedArea) {
        this.zoomedArea = zoomedArea;
    }
}