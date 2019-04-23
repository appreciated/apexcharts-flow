package com.github.appreciated.apexcharts.config.plotoptions.radialbar.builder;

import com.github.appreciated.apexcharts.config.plotoptions.radialbar.DataLabels;
import com.github.appreciated.apexcharts.config.plotoptions.radialbar.Name;
import com.github.appreciated.apexcharts.config.plotoptions.radialbar.Total;
import com.github.appreciated.apexcharts.config.plotoptions.radialbar.Value;

public class DataLabelsBuilder {
    private Boolean show;
    private Name name;
    private Value value;
    private Total total;

    private DataLabelsBuilder() {
    }

    public static DataLabelsBuilder get() {
        return new DataLabelsBuilder();
    }

    public DataLabelsBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public DataLabelsBuilder withName(Name name) {
        this.name = name;
        return this;
    }

    public DataLabelsBuilder withValue(Value value) {
        this.value = value;
        return this;
    }

    public DataLabelsBuilder withTotal(Total total) {
        this.total = total;
        return this;
    }

    public DataLabels build() {
        DataLabels dataLabels = new DataLabels();
        dataLabels.setShow(show);
        dataLabels.setName(name);
        dataLabels.setValue(value);
        dataLabels.setTotal(total);
        return dataLabels;
    }
}
