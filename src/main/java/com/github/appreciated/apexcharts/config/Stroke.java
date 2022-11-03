package com.github.appreciated.apexcharts.config;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.config.stroke.LineCap;

import java.util.List;

public class Stroke {
    private Boolean show;
    private Curve curve;
    private LineCap lineCap;
    private List<String> colors;
    @JsonIgnore
    private Double width;
    @JsonIgnore
    private List<Double> widthArray;
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

    public List<Double> getWidthArray() {
        return widthArray;
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

    public void setWidthArray(List<Double> widthArray) {
        this.widthArray = widthArray;
    }

    public void setDashArray(List<Double> dashArray) {
        this.dashArray = dashArray;
    }

    @JsonGetter("width")
    public Object serializeWidth() {
        if (width != null) {
            return width;
        }
        return widthArray;
    }

}
