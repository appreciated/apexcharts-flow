package com.github.appreciated.apexcharts.config.chart.zoom;

public class Zoom {
    private Boolean enabled;
    private Type type;
    private ZoomedArea zoomedArea;


    public Zoom() {
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Type getType() {
        return type;
    }

    public ZoomedArea getZoomedArea() {
        return zoomedArea;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setZoomedArea(ZoomedArea zoomedArea) {
        this.zoomedArea = zoomedArea;
    }

}