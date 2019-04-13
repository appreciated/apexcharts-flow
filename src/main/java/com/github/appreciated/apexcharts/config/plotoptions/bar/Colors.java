package com.github.appreciated.apexcharts.config.plotoptions.bar;

import java.util.List;

public class Colors {
    private Ranges ranges;
    private List<String> backgroundBarColors;
    private Double backgroundBarOpacity;

    public Colors() {
    }

    public Ranges getRanges() {
        return ranges;
    }

    public List<String> getBackgroundBarColors() {
        return backgroundBarColors;
    }

    public Double getBackgroundBarOpacity() {
        return backgroundBarOpacity;
    }

    public void setRanges(Ranges ranges) {
        this.ranges = ranges;
    }

    public void setBackgroundBarColors(List<String> backgroundBarColors) {
        this.backgroundBarColors = backgroundBarColors;
    }

    public void setBackgroundBarOpacity(Double backgroundBarOpacity) {
        this.backgroundBarOpacity = backgroundBarOpacity;
    }

}
