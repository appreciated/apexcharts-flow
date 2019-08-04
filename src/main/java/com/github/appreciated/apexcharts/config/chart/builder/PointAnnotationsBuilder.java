package com.github.appreciated.apexcharts.config.chart.builder;

import com.github.appreciated.apexcharts.config.annotations.AnnotationLabel;
import com.github.appreciated.apexcharts.config.chart.Marker;
import com.github.appreciated.apexcharts.config.chart.PointAnnotations;

public class PointAnnotationsBuilder {
    private Double x;
    private Double y;
    private Double yAxisIndex;
    private Double seriesIndex;
    private Marker marker;
    private AnnotationLabel label;

    private PointAnnotationsBuilder() {
    }

    public static PointAnnotationsBuilder get() {
        return new PointAnnotationsBuilder();
    }

    public PointAnnotationsBuilder withX(Double x) {
        this.x = x;
        return this;
    }

    public PointAnnotationsBuilder withY(Double y) {
        this.y = y;
        return this;
    }

    public PointAnnotationsBuilder withYAxisIndex(Double yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }

    public PointAnnotationsBuilder withSeriesIndex(Double seriesIndex) {
        this.seriesIndex = seriesIndex;
        return this;
    }

    public PointAnnotationsBuilder withMarker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public PointAnnotationsBuilder withLabel(AnnotationLabel label) {
        this.label = label;
        return this;
    }

    public PointAnnotations build() {
        PointAnnotations pointAnnotations = new PointAnnotations();
        pointAnnotations.setX(x);
        pointAnnotations.setY(y);
        pointAnnotations.setYAxisIndex(yAxisIndex);
        pointAnnotations.setSeriesIndex(seriesIndex);
        pointAnnotations.setMarker(marker);
        pointAnnotations.setLabel(label);
        return pointAnnotations;
    }
}
