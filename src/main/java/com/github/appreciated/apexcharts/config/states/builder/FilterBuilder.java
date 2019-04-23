package com.github.appreciated.apexcharts.config.states.builder;

import com.github.appreciated.apexcharts.config.states.Filter;

public class FilterBuilder {
    private String type;
    private Double value;

    private FilterBuilder() {
    }

    public static FilterBuilder get() {
        return new FilterBuilder();
    }

    public FilterBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public FilterBuilder withValue(Double value) {
        this.value = value;
        return this;
    }

    public Filter build() {
        Filter filter = new Filter();
        filter.setType(type);
        filter.setValue(value);
        return filter;
    }
}
