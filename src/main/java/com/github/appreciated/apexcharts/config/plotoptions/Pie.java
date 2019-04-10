package com.github.appreciated.apexcharts.config.plotoptions;

import com.github.appreciated.apexcharts.config.plotoptions.pie.Donut;

public class Pie {
    Double size;
    Double customScale;
    Double offsetX;
    Double offsetY;
    Boolean expandOnClick;
    DataLabels dataLabels;
    Donut donut;

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getCustomScale() {
        return customScale;
    }

    public void setCustomScale(Double customScale) {
        this.customScale = customScale;
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

    public Boolean getExpandOnClick() {
        return expandOnClick;
    }

    public void setExpandOnClick(Boolean expandOnClick) {
        this.expandOnClick = expandOnClick;
    }

    public DataLabels getDataLabels() {
        return dataLabels;
    }

    public void setDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }
}
