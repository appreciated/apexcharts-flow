package com.github.appreciated.apexcharts.config.plotoptions;

import com.github.appreciated.apexcharts.config.plotoptions.radar.Polygons;

public class Radar {
    private Double size;
    private Double offsetX;
    private Double offsetY;
    private Polygons polygons;

    public Radar() {
    }

    public Double getSize() {
        return size;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public Polygons getPolygons() {
        return polygons;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public void setPolygons(Polygons polygons) {
        this.polygons = polygons;
    }

}
