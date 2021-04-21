package com.github.appreciated.apexcharts.config.plotoptions.builder;

import com.github.appreciated.apexcharts.config.plotoptions.Radar;
import com.github.appreciated.apexcharts.config.plotoptions.radar.Polygons;

public class RadarBuilder {
    private Double size;
    private Double offsetX;
    private Double offsetY;
    private Polygons polygons;

    private RadarBuilder() {
    }

    public static RadarBuilder get() {
        return new RadarBuilder();
    }

    public RadarBuilder withSize(Double size) {
        this.size = size;
        return this;
    }

    public RadarBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public RadarBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public RadarBuilder withPolygons(Polygons polygons) {
        this.polygons = polygons;
        return this;
    }

    public Radar build() {
        Radar radar = new Radar();
        radar.setSize(size);
        radar.setOffsetX(offsetX);
        radar.setOffsetY(offsetY);
        radar.setPolygons(polygons);
        return radar;
    }
}
