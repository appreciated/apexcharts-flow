package com.github.appreciated.apexcharts.config.plotoptions.bar.builder;

import com.github.appreciated.apexcharts.config.plotoptions.bar.DataLabels;
import com.github.appreciated.apexcharts.config.plotoptions.bar.Total;

public class DataLabelsBuilder {
    private String position;
    private Integer maxItems;
    private boolean hideOverflowingLabels;
    private String orientation;
    private Total total;

    private DataLabelsBuilder() {
    }

    public static DataLabelsBuilder get() {
        return new DataLabelsBuilder();
    }

    public DataLabelsBuilder withPosition(String position) {
        this.position = position;
        return this;
    }

    public DataLabelsBuilder withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    public DataLabelsBuilder withHideOverflowingLabels(boolean hideOverflowingLabels) {
        this.hideOverflowingLabels = hideOverflowingLabels;
        return this;
    }

    public DataLabelsBuilder withOrientation(String orientation) {
        this.orientation = orientation;
        return this;
    }

    public DataLabelsBuilder withTotal(Total total) {
        this.total = total;
        return this;
    }

    public DataLabels build() {
        DataLabels dataLabels = new DataLabels();
        dataLabels.setPosition(position);
        dataLabels.setMaxItems(maxItems);
        dataLabels.setHideOverflowingLabels(hideOverflowingLabels);
        dataLabels.setOrientation(orientation);
        dataLabels.setTotal(total);
        return dataLabels;
    }
}
