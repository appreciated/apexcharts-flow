package com.github.appreciated.apexcharts.config.plotoptions.builder;

import com.github.appreciated.apexcharts.config.plotoptions.Pie;
import com.github.appreciated.apexcharts.config.plotoptions.pie.DataLabels;
import com.github.appreciated.apexcharts.config.plotoptions.pie.Donut;

public class PieBuilder {
    private Double size;
    private Double customScale;
    private Double offsetX;
    private Double offsetY;
    private Double startAngle;
    private Double endAngle;
    private Boolean expandOnClick;
    private DataLabels dataLabels;
    private Donut donut;

    private PieBuilder() {
    }

    public static PieBuilder get() {
        return new PieBuilder();
    }

    public PieBuilder withSize(Double size) {
        this.size = size;
        return this;
    }

    public PieBuilder withCustomScale(Double customScale) {
        this.customScale = customScale;
        return this;
    }

    public PieBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public PieBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public PieBuilder withExpandOnClick(Boolean expandOnClick) {
        this.expandOnClick = expandOnClick;
        return this;
    }

    public PieBuilder withDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public PieBuilder withDonut(Donut donut) {
        this.donut = donut;
        return this;
    }

    public PieBuilder withStartAngle(Double startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public PieBuilder withEndAngle(Double endAngle) {
        this.endAngle = endAngle;
        return this;
    }

    public Pie build() {
        Pie pie = new Pie();
        pie.setSize(size);
        pie.setCustomScale(customScale);
        pie.setOffsetX(offsetX);
        pie.setOffsetY(offsetY);
        pie.setExpandOnClick(expandOnClick);
        pie.setDataLabels(dataLabels);
        pie.setDonut(donut);
        pie.setStartAngle(startAngle);
        pie.setEndAngle(endAngle);
        return pie;
    }
}
