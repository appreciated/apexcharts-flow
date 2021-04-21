package com.github.appreciated.apexcharts.config.plotoptions.pie;

public class Donut {
    private String size;
    private String background;
    private Labels labels;


    public Donut() {
    }

    public String getSize() {
        return size;
    }

    public String getBackground() {
        return background;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

}
