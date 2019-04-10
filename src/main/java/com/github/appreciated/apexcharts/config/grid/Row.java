package com.github.appreciated.apexcharts.config.grid;

import java.util.List;

public class Row {
    private List<String> colors;
    private Double opacity;


    public Row() {
    }

    public List<String> getColors() {
        return colors;
    }

    public Double getOpacity() {
        return opacity;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }

}
