package com.github.appreciated.apexcharts.config.plotoptions;

import com.github.appreciated.apexcharts.config.plotoptions.radialbar.DataLabels;
import com.github.appreciated.apexcharts.config.plotoptions.radialbar.Track;

public class RadialBar {
    Double size;
    Boolean inverseOrder;
    Double startAngle;
    Double endAngle;
    Double offsetX;
    Double offsetY;
    Hollow hollow;
    Track track;
    DataLabels dataLabels;

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Boolean getInverseOrder() {
        return inverseOrder;
    }

    public void setInverseOrder(Boolean inverseOrder) {
        this.inverseOrder = inverseOrder;
    }

    public Double getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(Double startAngle) {
        this.startAngle = startAngle;
    }

    public Double getEndAngle() {
        return endAngle;
    }

    public void setEndAngle(Double endAngle) {
        this.endAngle = endAngle;
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

    public Hollow getHollow() {
        return hollow;
    }

    public void setHollow(Hollow hollow) {
        this.hollow = hollow;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public DataLabels getDataLabels() {
        return dataLabels;
    }

    public void setDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
    }
}
