package com.github.appreciated.apexcharts.config.plotoptions;

import com.github.appreciated.apexcharts.config.plotoptions.radialbar.Hollow;
import com.github.appreciated.apexcharts.config.plotoptions.radialbar.RadialBarDataLabels;
import com.github.appreciated.apexcharts.config.plotoptions.radialbar.Track;

public class RadialBar {
    private Double size;
    private Boolean inverseOrder;
    private Double startAngle;
    private Double endAngle;
    private Double offsetX;
    private Double offsetY;
    private Hollow hollow;
    private Track track;
    private RadialBarDataLabels dataLabels;

    public RadialBar() {
    }

    public Double getSize() {
        return size;
    }

    public Boolean getInverseOrder() {
        return inverseOrder;
    }

    public Double getStartAngle() {
        return startAngle;
    }

    public Double getEndAngle() {
        return endAngle;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public Hollow getHollow() {
        return hollow;
    }

    public Track getTrack() {
        return track;
    }

    public RadialBarDataLabels getDataLabels() {
        return dataLabels;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public void setInverseOrder(Boolean inverseOrder) {
        this.inverseOrder = inverseOrder;
    }

    public void setStartAngle(Double startAngle) {
        this.startAngle = startAngle;
    }

    public void setEndAngle(Double endAngle) {
        this.endAngle = endAngle;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public void setHollow(Hollow hollow) {
        this.hollow = hollow;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public void setDataLabels(RadialBarDataLabels dataLabels) {
        this.dataLabels = dataLabels;
    }

}
