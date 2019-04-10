package com.github.appreciated.apexcharts.config.plotoptions;

import com.github.appreciated.apexcharts.config.plotoptions.radar.Polygons;

public class Radar {
    Double size;
    Double offsetX;
    Double offsetY;
    Polygons polygons;

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public Polygons getPolygons() {
        return polygons;
    }

    public void setPolygons(Polygons polygons) {
        this.polygons = polygons;
    }
}
