package com.github.appreciated.apexcharts.config.chart.zoom;

public class Zoom {
    private Boolean enabled;
    private ZoomType type;
    private ZoomedArea zoomedArea;


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

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setType(ZoomType type) {
        this.type = type;
    }

    public void setZoomedArea(ZoomedArea zoomedArea) {
        this.zoomedArea = zoomedArea;
    }

}