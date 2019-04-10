package com.github.appreciated.apexcharts.config.grid;

import java.util.List;

public class Row {
    private List<String> colors;
    private double opacity;


    public Row() {
    }

    public List<String> getColors() {
        return colors;
    }

    public double getOpacity() {
        return opacity;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }

}
