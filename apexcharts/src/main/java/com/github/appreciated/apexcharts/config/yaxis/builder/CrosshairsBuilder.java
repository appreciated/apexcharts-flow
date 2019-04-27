package com.github.appreciated.apexcharts.config.yaxis.builder;

import com.github.appreciated.apexcharts.config.yaxis.Crosshairs;
import com.github.appreciated.apexcharts.config.yaxis.Stroke;

public class CrosshairsBuilder {
    private Boolean show;
    private String position;
    private Stroke stroke;

    private CrosshairsBuilder() {
    }

    public static CrosshairsBuilder get() {
        return new CrosshairsBuilder();
    }

    public CrosshairsBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public CrosshairsBuilder withPosition(String position) {
        this.position = position;
        return this;
    }

    public CrosshairsBuilder withStroke(Stroke stroke) {
        this.stroke = stroke;
        return this;
    }

    public Crosshairs build() {
        Crosshairs crosshairs = new Crosshairs();
        crosshairs.setShow(show);
        crosshairs.setPosition(position);
        crosshairs.setStroke(stroke);
        return crosshairs;
    }
}
