package com.github.appreciated.apexcharts.config.legend;

public class OnItemClick {
    private Boolean toggleDataSeries;

    public Boolean getToggleDataSeries() {
        return toggleDataSeries;
    }

    public void setToggleDataSeries(Boolean toggleDataSeries) {
        this.toggleDataSeries = toggleDataSeries;
    }

    public OnItemClick(Boolean toggleDataSeries) {
        this.toggleDataSeries = toggleDataSeries;
    }
}
