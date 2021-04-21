package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.Stroke;
import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.config.stroke.LineCap;

import java.util.Arrays;
import java.util.List;

public class StrokeBuilder {
    private Boolean show;
    private Curve curve;
    private LineCap lineCap;
    private List<String> colors;
    private Double width;
    private List<Double> dashArray;

    private StrokeBuilder() {
    }

    public static StrokeBuilder get() {
        return new StrokeBuilder();
    }

    public StrokeBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public StrokeBuilder withCurve(Curve curve) {
        this.curve = curve;
        return this;
    }

    public StrokeBuilder withLineCap(LineCap lineCap) {
        this.lineCap = lineCap;
        return this;
    }

    public StrokeBuilder withColors(String... colors) {
        this.colors = Arrays.asList(colors);
        return this;
    }

    public StrokeBuilder withWidth(Double width) {
        this.width = width;
        return this;
    }

    public StrokeBuilder withDashArray(List<Double> dashArray) {
        this.dashArray = dashArray;
        return this;
    }

    public Stroke build() {
        Stroke stroke = new Stroke();
        stroke.setShow(show);
        stroke.setCurve(curve);
        stroke.setLineCap(lineCap);
        stroke.setColors(colors);
        stroke.setWidth(width);
        stroke.setDashArray(dashArray);
        return stroke;
    }
}
