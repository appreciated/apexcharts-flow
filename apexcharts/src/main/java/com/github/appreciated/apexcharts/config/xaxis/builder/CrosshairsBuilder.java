package com.github.appreciated.apexcharts.config.xaxis.builder;

import com.github.appreciated.apexcharts.config.chart.DropShadow;
import com.github.appreciated.apexcharts.config.xaxis.Crosshairs;
import com.github.appreciated.apexcharts.config.xaxis.crosshairs.Fill;
import com.github.appreciated.apexcharts.config.xaxis.crosshairs.Stroke;

public class CrosshairsBuilder {
    private Boolean show;
    private String width;
    private String position;
    private Double opacity;
    private Stroke stroke;
    private Fill fill;
    private DropShadow dropShadow;

    private CrosshairsBuilder() {
    }

    public static CrosshairsBuilder get() {
        return new CrosshairsBuilder();
    }

    public CrosshairsBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public CrosshairsBuilder withWidth(String width) {
        this.width = width;
        return this;
    }

    public CrosshairsBuilder withPosition(String position) {
        this.position = position;
        return this;
    }

    public CrosshairsBuilder withOpacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    public CrosshairsBuilder withStroke(Stroke stroke) {
        this.stroke = stroke;
        return this;
    }

    public CrosshairsBuilder withFill(Fill fill) {
        this.fill = fill;
        return this;
    }

    public CrosshairsBuilder withDropShadow(DropShadow dropShadow) {
        this.dropShadow = dropShadow;
        return this;
    }

    public Crosshairs build() {
        Crosshairs crosshairs = new Crosshairs();
        crosshairs.setShow(show);
        crosshairs.setWidth(width);
        crosshairs.setPosition(position);
        crosshairs.setOpacity(opacity);
        crosshairs.setStroke(stroke);
        crosshairs.setFill(fill);
        crosshairs.setDropShadow(dropShadow);
        return crosshairs;
    }
}
