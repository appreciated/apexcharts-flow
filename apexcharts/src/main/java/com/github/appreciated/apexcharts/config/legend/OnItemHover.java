package com.github.appreciated.apexcharts.config.legend;

public class OnItemHover {
    private Boolean highlightDataSeries;

    public Boolean getHighlightDataSeries() {
        return highlightDataSeries;
    }

    public void setHighlightDataSeries(Boolean highlightDataSeries) {
        this.highlightDataSeries = highlightDataSeries;
    }

    public OnItemHover(Boolean highlightDataSeries) {
        this.highlightDataSeries = highlightDataSeries;
    }
}
