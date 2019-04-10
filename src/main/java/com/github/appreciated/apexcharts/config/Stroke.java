package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.config.stroke.LineCap;

import java.util.List;

public class Stroke {
    private Boolean show;
    private Curve curve;
    private LineCap lineCap;
    private List<String> colors;
    private Double width;
    private List<Double> dashArray;


    public Stroke() {
    }

    public Boolean getShow() {
        return show;
    }

    public Curve getCurve() {
        return curve;
    }

    public LineCap getLineCap() {
        return lineCap;
    }

    public List<String> getColors() {
        return colors;
    }

    public Double getWidth() {
        return width;
    }

    public List<Double> getDashArray() {
        return dashArray;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setCurve(Curve curve) {
        this.curve = curve;
    }

    public void setLineCap(LineCap lineCap) {
        this.lineCap = lineCap;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setDashArray(List<Double> dashArray) {
        this.dashArray = dashArray;
    }

}
