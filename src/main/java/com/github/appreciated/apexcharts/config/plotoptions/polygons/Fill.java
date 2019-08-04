package com.github.appreciated.apexcharts.config.plotoptions.polygons;

import java.util.List;

public class Fill {
    private List<String> colors;

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public Fill(List<String> colors) {
        this.colors = colors;
    }
}
