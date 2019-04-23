package com.github.appreciated.apexcharts.config.plotoptions.heatmap;

public class ColorScale {
    private Ranges ranges;
    private Boolean inverse;
    private Double min;
    private Double max;


    public ColorScale() {
    }

    public Ranges getRanges() {
        return ranges;
    }

    public Boolean getInverse() {
        return inverse;
    }

    public Double getMin() {
        return min;
    }

    public Double getMax() {
        return max;
    }

    public void setRanges(Ranges ranges) {
        this.ranges = ranges;
    }

    public void setInverse(Boolean inverse) {
        this.inverse = inverse;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public void setMax(Double max) {
        this.max = max;
    }

}
