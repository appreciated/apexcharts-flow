package com.github.appreciated.apexcharts.config.plotoptions.builder;

import com.github.appreciated.apexcharts.config.plotoptions.RadialBar;
import com.github.appreciated.apexcharts.config.plotoptions.radialbar.Hollow;
import com.github.appreciated.apexcharts.config.plotoptions.radialbar.RadialBarDataLabels;
import com.github.appreciated.apexcharts.config.plotoptions.radialbar.Track;

public class RadialBarBuilder {
    private Double size;
    private Boolean inverseOrder;
    private Double startAngle;
    private Double endAngle;
    private Double offsetX;
    private Double offsetY;
    private Hollow hollow;
    private Track track;
    private RadialBarDataLabels dataLabels;

    private RadialBarBuilder() {
    }

    public static RadialBarBuilder get() {
        return new RadialBarBuilder();
    }

    public RadialBarBuilder withSize(Double size) {
        this.size = size;
        return this;
    }

    public RadialBarBuilder withInverseOrder(Boolean inverseOrder) {
        this.inverseOrder = inverseOrder;
        return this;
    }

    public RadialBarBuilder withStartAngle(Double startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public RadialBarBuilder withEndAngle(Double endAngle) {
        this.endAngle = endAngle;
        return this;
    }

    public RadialBarBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public RadialBarBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public RadialBarBuilder withHollow(Hollow hollow) {
        this.hollow = hollow;
        return this;
    }

    public RadialBarBuilder withTrack(Track track) {
        this.track = track;
        return this;
    }

    public RadialBarBuilder withDataLabels(RadialBarDataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public RadialBar build() {
        RadialBar radialBar = new RadialBar();
        radialBar.setSize(size);
        radialBar.setInverseOrder(inverseOrder);
        radialBar.setStartAngle(startAngle);
        radialBar.setEndAngle(endAngle);
        radialBar.setOffsetX(offsetX);
        radialBar.setOffsetY(offsetY);
        radialBar.setHollow(hollow);
        radialBar.setTrack(track);
        radialBar.setDataLabels(dataLabels);
        return radialBar;
    }
}
