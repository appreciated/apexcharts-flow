package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.DataLabels;
import com.github.appreciated.apexcharts.config.datalables.DropShadow;
import com.github.appreciated.apexcharts.config.datalables.Style;
import com.github.appreciated.apexcharts.config.datalables.TextAnchor;
import com.github.appreciated.apexcharts.helper.Formatter;

import java.util.List;

public class DataLabelsBuilder {
    private Boolean enabled;
    private List<Double> enabledOnSeries;
    private String formatter;
    private TextAnchor textAnchor;
    private Double offsetX;
    private Double offsetY;
    private Style style;
    private DropShadow dropShadow;

    private DataLabelsBuilder() {
    }

    public static DataLabelsBuilder get() {
        return new DataLabelsBuilder();
    }

    public DataLabelsBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public DataLabelsBuilder withEnabledOnSeries(List<Double> enabledOnSeries) {
        this.enabledOnSeries = enabledOnSeries;
        return this;
    }

    public DataLabelsBuilder withFormatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public DataLabelsBuilder withFormatter(Formatter formatter) {
        this.formatter = formatter.getString();
        return this;
    }

    public DataLabelsBuilder withTextAnchor(TextAnchor textAnchor) {
        this.textAnchor = textAnchor;
        return this;
    }

    public DataLabelsBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public DataLabelsBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public DataLabelsBuilder withStyle(Style style) {
        this.style = style;
        return this;
    }

    public DataLabelsBuilder withDropShadow(DropShadow dropShadow) {
        this.dropShadow = dropShadow;
        return this;
    }

    public DataLabels build() {
        DataLabels dataLabels = new DataLabels();
        dataLabels.setEnabled(enabled);
        dataLabels.setEnabledOnSeries(enabledOnSeries);
        dataLabels.setFormatter(formatter);
        dataLabels.setTextAnchor(textAnchor);
        dataLabels.setOffsetX(offsetX);
        dataLabels.setOffsetY(offsetY);
        dataLabels.setStyle(style);
        dataLabels.setDropShadow(dropShadow);
        return dataLabels;
    }
}
