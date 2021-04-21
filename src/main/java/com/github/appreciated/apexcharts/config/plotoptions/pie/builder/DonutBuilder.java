package com.github.appreciated.apexcharts.config.plotoptions.pie.builder;

import com.github.appreciated.apexcharts.config.plotoptions.pie.Donut;
import com.github.appreciated.apexcharts.config.plotoptions.pie.Labels;

public class DonutBuilder {
    private String size;
    private String background;
    private Labels labels;

    private DonutBuilder() {
    }

    public static DonutBuilder get() {
        return new DonutBuilder();
    }

    public DonutBuilder withSize(String size) {
        this.size = size;
        return this;
    }

    public DonutBuilder withBackground(String background) {
        this.background = background;
        return this;
    }

    public DonutBuilder withLabels(Labels labels) {
        this.labels = labels;
        return this;
    }

    public Donut build() {
        Donut donut = new Donut();
        donut.setSize(size);
        donut.setBackground(background);
        donut.setLabels(labels);
        return donut;
    }
}
