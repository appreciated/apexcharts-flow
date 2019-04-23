package com.github.appreciated.apexcharts.config.states.builder;

import com.github.appreciated.apexcharts.config.states.Active;
import com.github.appreciated.apexcharts.config.states.Filter;

public class ActiveBuilder {
    private Boolean allowMultipleDataPointsSelection;
    private Filter filter;

    private ActiveBuilder() {
    }

    public static ActiveBuilder get() {
        return new ActiveBuilder();
    }

    public ActiveBuilder withAllowMultipleDataPointsSelection(Boolean allowMultipleDataPointsSelection) {
        this.allowMultipleDataPointsSelection = allowMultipleDataPointsSelection;
        return this;
    }

    public ActiveBuilder withFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    public Active build() {
        Active active = new Active();
        active.setAllowMultipleDataPointsSelection(allowMultipleDataPointsSelection);
        active.setFilter(filter);
        return active;
    }
}
