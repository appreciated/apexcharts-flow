package com.github.appreciated.apexcharts.config.plotoptions;

import com.github.appreciated.apexcharts.config.plotoptions.bar.Colors;
import com.github.appreciated.apexcharts.config.plotoptions.bar.DataLabels;

public class Bar {
    private Boolean horizontal;
    private String columnWidth;
    private String barHeight;
    private Boolean distributed;
    private Colors colors;
    private DataLabels dataLabels;
    private Boolean rangeBarGroupRows;

    public Bar() {
    }

    public Boolean getHorizontal() {
        return horizontal;
    }

    public String getColumnWidth() {
        return columnWidth;
    }

    public String getBarHeight() {
        return barHeight;
    }

    public Boolean getDistributed() {
        return distributed;
    }

    public Colors getColors() {
        return colors;
    }

    public DataLabels getDataLabels() {
        return dataLabels;
    }

    public Boolean getRangeBarGroupRows() {
        return rangeBarGroupRows;
    }

    public void setHorizontal(Boolean horizontal) {
        this.horizontal = horizontal;
    }

    public void setColumnWidth(String columnWidth) {
        this.columnWidth = columnWidth;
    }

    public void setBarHeight(String barHeight) {
        this.barHeight = barHeight;
    }

    public void setDistributed(Boolean distributed) {
        this.distributed = distributed;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public void setDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
    }

    public void setRangeBarGroupRows(Boolean rangeBarGroupRows) {
        this.rangeBarGroupRows = rangeBarGroupRows;
    }

}
