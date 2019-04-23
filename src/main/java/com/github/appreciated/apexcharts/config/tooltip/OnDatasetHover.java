package com.github.appreciated.apexcharts.config.tooltip;

public class OnDatasetHover {
    private Boolean highlightDAtaSeries;

    public Boolean getHighlightDAtaSeries() {
        return highlightDAtaSeries;
    }

    public void setHighlightDAtaSeries(Boolean highlightDAtaSeries) {
        this.highlightDAtaSeries = highlightDAtaSeries;
    }

    public OnDatasetHover(Boolean highlightDAtaSeries) {
        this.highlightDAtaSeries = highlightDAtaSeries;
    }
}
