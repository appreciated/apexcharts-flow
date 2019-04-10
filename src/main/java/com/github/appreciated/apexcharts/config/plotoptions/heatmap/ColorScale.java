package com.github.appreciated.apexcharts.config.plotoptions.heatmap;

public class ColorScale {
    Ranges ranges;
    Boolean inverse;
    Double min;
    Double max;

    public Ranges getRanges() {
        return ranges;
    }

    public void setRanges(Ranges ranges) {
        this.ranges = ranges;
    }

    public Boolean getInverse() {
        return inverse;
    }

    public void setInverse(Boolean inverse) {
        this.inverse = inverse;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }
}
