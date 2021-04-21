package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.annotations.XAxisAnnotations;
import com.github.appreciated.apexcharts.config.annotations.YAxisAnnotations;
import com.github.appreciated.apexcharts.config.chart.PointAnnotations;

import java.util.List;

public class Annotations {
    private String position;
    private List<YAxisAnnotations> yaxis;
    private List<XAxisAnnotations> xaxis;
    private List<PointAnnotations> points;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<YAxisAnnotations> getYaxis() {
        return yaxis;
    }

    public void setYaxis(List<YAxisAnnotations> yaxis) {
        this.yaxis = yaxis;
    }

    public List<XAxisAnnotations> getXaxis() {
        return xaxis;
    }

    public void setXaxis(List<XAxisAnnotations> xaxis) {
        this.xaxis = xaxis;
    }

    public List<PointAnnotations> getPoints() {
        return points;
    }

    public void setPoints(List<PointAnnotations> points) {
        this.points = points;
    }
}
