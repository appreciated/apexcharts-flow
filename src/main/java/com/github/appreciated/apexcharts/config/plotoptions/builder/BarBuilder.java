package com.github.appreciated.apexcharts.config.plotoptions.builder;

import com.github.appreciated.apexcharts.config.plotoptions.Bar;
import com.github.appreciated.apexcharts.config.plotoptions.bar.Colors;
import com.github.appreciated.apexcharts.config.plotoptions.bar.DataLabels;

public class BarBuilder {
    private Boolean horizontal;
    private String columnWidth;
    private String barHeight;
    private Boolean distributed;
    private Colors colors;
    private DataLabels dataLabels;
    private Boolean rangeBarGroupRows;

    private BarBuilder() {
    }

    public static BarBuilder get() {
        return new BarBuilder();
    }

    public BarBuilder withHorizontal(Boolean horizontal) {
        this.horizontal = horizontal;
        return this;
    }

    public BarBuilder withColumnWidth(String columnWidth) {
        this.columnWidth = columnWidth;
        return this;
    }

    public BarBuilder withBarHeight(String barHeight) {
        this.barHeight = barHeight;
        return this;
    }

    public BarBuilder withDistributed(Boolean distributed) {
        this.distributed = distributed;
        return this;
    }

    public BarBuilder withColors(Colors colors) {
        this.colors = colors;
        return this;
    }

    public BarBuilder withDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public BarBuilder withRangeBarGroupRows(Boolean rangeBarGroupRows) {
        this.rangeBarGroupRows = rangeBarGroupRows;
        return this;
    }


    public Bar build() {
        Bar bar = new Bar();
        bar.setHorizontal(horizontal);
        bar.setColumnWidth(columnWidth);
        bar.setBarHeight(barHeight);
        bar.setDistributed(distributed);
        bar.setColors(colors);
        bar.setDataLabels(dataLabels);
        bar.setRangeBarGroupRows(rangeBarGroupRows);
        return bar;
    }
}
