package com.github.appreciated.apexcharts.config.chart.plotoptions;

import com.github.appreciated.apexcharts.config.chart.plotoptions.pie.Donut;

public class Pie {
    double size;
    double customScale;
    double offsetX;
    double offsetY;
    Boolean expandOnClick;
    DataLabels dataLabels;
    Donut donut;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getCustomScale() {
        return customScale;
    }

    public void setCustomScale(double customScale) {
        this.customScale = customScale;
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
