package com.github.appreciated.apexcharts.config.states;

public class Active {
    Boolean allowMultipleDataPointsSelection;
    Filter filter;
    class Filter {
        String type;
        double value;
    }
}
