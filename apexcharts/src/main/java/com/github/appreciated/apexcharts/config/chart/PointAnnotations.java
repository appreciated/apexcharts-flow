package com.github.appreciated.apexcharts.config.chart;

import com.github.appreciated.apexcharts.config.annotations.AnnotationLabel;

public class PointAnnotations {
    private Double x;
    private Double y;
    private Double yAxisIndex;
    private Double seriesIndex;
    private Marker marker;
    private AnnotationLabel label;

    public PointAnnotations() {
    }

    public Double getyAxisIndex() {
        return yAxisIndex;
    }

    public void setyAxisIndex(Double yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }


    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Double getYAxisIndex() {
        return yAxisIndex;
    }

    public Double getSeriesIndex() {
        return seriesIndex;
    }

    public Marker getMarker() {
        return marker;
    }

    public AnnotationLabel getLabel() {
        return label;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void setYAxisIndex(Double yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }

    public void setSeriesIndex(Double seriesIndex) {
        this.seriesIndex = seriesIndex;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public void setLabel(AnnotationLabel label) {
        this.label = label;
    }

}
