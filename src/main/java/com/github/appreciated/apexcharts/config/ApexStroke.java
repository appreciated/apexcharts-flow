package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.config.stroke.LineCap;

import java.util.List;

public class ApexStroke {
    Boolean show;
    Curve curve;
    LineCap lineCap;
    String colors;
    double width;
    List<Double> dashArray;

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Curve getCurve() {
        return curve;
    }

    public void setCurve(Curve curve) {
        this.curve = curve;
    }

    public LineCap getLineCap() {
        return lineCap;
    }

    public void setLineCap(LineCap lineCap) {
        this.lineCap = lineCap;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public List<Double> getDashArray() {
        return dashArray;
    }

    public void setDashArray(List<Double> dashArray) {
        this.dashArray = dashArray;
    }
}
