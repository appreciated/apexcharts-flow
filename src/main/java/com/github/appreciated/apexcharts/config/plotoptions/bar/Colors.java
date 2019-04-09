package com.github.appreciated.apexcharts.config.plotoptions.bar;

import java.util.List;

public class Colors {
    Ranges ranges;
    List<String> backgroundBarColors;
    double backgroundBarOpacity;

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

    public double getBackgroundBarOpacity() {
        return backgroundBarOpacity;
    }

    public void setBackgroundBarOpacity(double backgroundBarOpacity) {
        this.backgroundBarOpacity = backgroundBarOpacity;
    }
}
