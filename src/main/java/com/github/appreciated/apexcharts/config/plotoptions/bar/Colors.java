package com.github.appreciated.apexcharts.config.plotoptions.bar;

import java.util.List;

public class Colors {
    Ranges ranges;
    List<String> backgroundBarColors;
    Double backgroundBarOpacity;

    public Ranges getRanges() {
        return ranges;
    }

    public void setRanges(Ranges ranges) {
        this.ranges = ranges;
    }

    public List<String> getBackgroundBarColors() {
        return backgroundBarColors;
    }

    public void setBackgroundBarColors(List<String> backgroundBarColors) {
        this.backgroundBarColors = backgroundBarColors;
    }

    public Double getBackgroundBarOpacity() {
        return backgroundBarOpacity;
    }

    public void setBackgroundBarOpacity(Double backgroundBarOpacity) {
        this.backgroundBarOpacity = backgroundBarOpacity;
    }
}
