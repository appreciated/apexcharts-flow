package com.github.appreciated.apexcharts.config.plotoptions;

import com.github.appreciated.apexcharts.config.plotoptions.pie.DataLabels;
import com.github.appreciated.apexcharts.config.plotoptions.pie.Donut;

public class Pie {
    private Double size;
    private Double customScale;
    private Double offsetX;
    private Double offsetY;
    private Boolean expandOnClick;
    private DataLabels dataLabels;
    private Donut donut;

    public Pie() {
    }

    public Double getSize() {
        return size;
    }

    public Double getCustomScale() {
        return customScale;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public Boolean getExpandOnClick() {
        return expandOnClick;
    }

    public DataLabels getDataLabels() {
        return dataLabels;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public void setCustomScale(Double customScale) {
        this.customScale = customScale;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public void setExpandOnClick(Boolean expandOnClick) {
        this.expandOnClick = expandOnClick;
    }

    public void setDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

}
