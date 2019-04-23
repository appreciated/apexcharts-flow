package com.github.appreciated.apexcharts.config.states;


public class Active {
    private Boolean allowMultipleDataPointsSelection;
    private Filter filter;

    public Boolean getAllowMultipleDataPointsSelection() {
        return allowMultipleDataPointsSelection;
    }

    public void setAllowMultipleDataPointsSelection(Boolean allowMultipleDataPointsSelection) {
        this.allowMultipleDataPointsSelection = allowMultipleDataPointsSelection;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}
