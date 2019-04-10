package com.github.appreciated.apexcharts.config.chart;

import com.github.appreciated.apexcharts.config.annotations.AnnotationLabel;

public class PointAnnotations {
    Double x;
    Double y;
    Double yAxisIndex;
    Double seriesIndex;
    Marker marker;
    AnnotationLabel label;

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getyAxisIndex() {
        return yAxisIndex;
    }

    public void setyAxisIndex(Double yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }

    public Double getSeriesIndex() {
        return seriesIndex;
    }

    public void setSeriesIndex(Double seriesIndex) {
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
