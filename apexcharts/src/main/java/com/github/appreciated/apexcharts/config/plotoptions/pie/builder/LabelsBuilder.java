package com.github.appreciated.apexcharts.config.plotoptions.pie.builder;

import com.github.appreciated.apexcharts.config.plotoptions.pie.Labels;
import com.github.appreciated.apexcharts.config.plotoptions.pie.Name;
import com.github.appreciated.apexcharts.config.plotoptions.pie.Total;
import com.github.appreciated.apexcharts.config.plotoptions.pie.Value;

public class LabelsBuilder {
    private Boolean show;
    private Name name;
    private Value value;
    private Total total;

    private LabelsBuilder() {
    }

    public static LabelsBuilder get() {
        return new LabelsBuilder();
    }

    public LabelsBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public LabelsBuilder withName(Name name) {
        this.name = name;
        return this;
    }

    public LabelsBuilder withValue(Value value) {
        this.value = value;
        return this;
    }

    public LabelsBuilder withTotal(Total total) {
        this.total = total;
        return this;
    }

    public Labels build() {
        Labels labels = new Labels();
        labels.setShow(show);
        labels.setName(name);
        labels.setValue(value);
        labels.setTotal(total);
        return labels;
    }
}
