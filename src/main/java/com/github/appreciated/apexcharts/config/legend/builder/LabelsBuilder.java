package com.github.appreciated.apexcharts.config.legend.builder;

import com.github.appreciated.apexcharts.config.legend.Labels;

public class LabelsBuilder {
    private String color;
    private Boolean useSeriesColors;

    private LabelsBuilder() {
    }

    public static LabelsBuilder get() {
        return new LabelsBuilder();
    }

    public LabelsBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public LabelsBuilder withUseSeriesColors(Boolean useSeriesColors) {
        this.useSeriesColors = useSeriesColors;
        return this;
    }

    public Labels build() {
        Labels labels = new Labels();
        labels.setColor(color);
        labels.setUseSeriesColors(useSeriesColors);
        return labels;
    }
}
