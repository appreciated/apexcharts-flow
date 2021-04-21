package com.github.appreciated.apexcharts.config.plotoptions.bar;

import java.util.Arrays;
import java.util.List;

public class Colors {
    private List<Ranges> ranges;
    private List<String> backgroundBarColors;
    private Double backgroundBarOpacity;
    private Double backgroundBarRadius;

    public Colors() {
    }

    public List<Ranges> getRanges() {
        return ranges;
    }

    public List<String> getBackgroundBarColors() {
        return backgroundBarColors;
    }

    public Double getBackgroundBarOpacity() {
        return backgroundBarOpacity;
    }

    public Double getBackgroundBarRadius() {
        return backgroundBarRadius;
    }

    public void setRanges(List<Ranges> ranges) {
        this.ranges = ranges;
    }

    public void setRanges(Ranges... ranges) {
        this.ranges = Arrays.asList(ranges);
    }

    public void setBackgroundBarColors(List<String> backgroundBarColors) {
        this.backgroundBarColors = backgroundBarColors;
    }

    public void setBackgroundBarOpacity(Double backgroundBarOpacity) {
        this.backgroundBarOpacity = backgroundBarOpacity;
    }

    public void setBackgroundBarRadius(Double backgroundBarRadius) {
        this.backgroundBarRadius = backgroundBarRadius;
    }
}
