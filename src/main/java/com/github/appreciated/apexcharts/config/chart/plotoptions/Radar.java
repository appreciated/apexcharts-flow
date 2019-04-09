package com.github.appreciated.apexcharts.config.chart.plotoptions;

import com.github.appreciated.apexcharts.config.chart.plotoptions.radar.Polygons;

public class Radar {
    double size;
    double offsetX;
    double offsetY;
    Polygons polygons;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(double offsetX) {
        this.offsetX = offsetX;
    }

    public double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(double offsetY) {
        this.offsetY = offsetY;
    }

    public Polygons getPolygons() {
        return polygons;
    }

    public void setPolygons(Polygons polygons) {
        this.polygons = polygons;
    }
}
