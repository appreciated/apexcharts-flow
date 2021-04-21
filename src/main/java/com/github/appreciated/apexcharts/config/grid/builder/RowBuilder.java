package com.github.appreciated.apexcharts.config.grid.builder;

import com.github.appreciated.apexcharts.config.grid.Row;

import java.util.Arrays;
import java.util.List;

public class RowBuilder {
    private List<String> colors;
    private Double opacity;

    private RowBuilder() {
    }

    public static RowBuilder get() {
        return new RowBuilder();
    }

    public RowBuilder withColors(List<String> colors) {
        this.colors = colors;
        return this;
    }

    public RowBuilder withColors(String... colors) {
        this.colors = Arrays.asList(colors);
        return this;
    }

    public RowBuilder withOpacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    public Row build() {
        Row row = new Row();
        row.setColors(colors);
        row.setOpacity(opacity);
        return row;
    }
}
