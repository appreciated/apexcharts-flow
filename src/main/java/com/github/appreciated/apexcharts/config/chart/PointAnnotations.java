package com.github.appreciated.apexcharts.config.chart;

import com.github.appreciated.apexcharts.config.annotations.AnnotationLabel;

public class PointAnnotations {
    double x;
    double y;
    double yAxisIndex;
    double seriesIndex;
    Marker marker;
    AnnotationLabel label;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getyAxisIndex() {
        return yAxisIndex;
    }

    public void setyAxisIndex(double yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }

    public double getSeriesIndex() {
        return seriesIndex;
    }

    public void setSeriesIndex(double seriesIndex) {
        this.seriesIndex = seriesIndex;
    }

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public AnnotationLabel getLabel() {
        return label;
    }

    public void setLabel(AnnotationLabel label) {
        this.label = label;
    }
}
