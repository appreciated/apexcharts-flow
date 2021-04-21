package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.Grid;
import com.github.appreciated.apexcharts.config.grid.*;

public class GridBuilder {
    private Boolean show;
    private String borderColor;
    private Double strokeDashArray;
    private Position position;
    private Xaxis xaxis;
    private Yaxis yaxis;
    private Row row;
    private Column column;
    private Padding padding;

    private GridBuilder() {
    }

    public static GridBuilder get() {
        return new GridBuilder();
    }

    public GridBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public GridBuilder withBorderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public GridBuilder withStrokeDashArray(Double strokeDashArray) {
        this.strokeDashArray = strokeDashArray;
        return this;
    }

    public GridBuilder withPosition(Position position) {
        this.position = position;
        return this;
    }

    public GridBuilder withXaxis(Xaxis xaxis) {
        this.xaxis = xaxis;
        return this;
    }

    public GridBuilder withYaxis(Yaxis yaxis) {
        this.yaxis = yaxis;
        return this;
    }

    public GridBuilder withRow(Row row) {
        this.row = row;
        return this;
    }

    public GridBuilder withColumn(Column column) {
        this.column = column;
        return this;
    }

    public GridBuilder withPadding(Padding padding) {
        this.padding = padding;
        return this;
    }

    public Grid build() {
        Grid grid = new Grid();
        grid.setShow(show);
        grid.setBorderColor(borderColor);
        grid.setStrokeDashArray(strokeDashArray);
        grid.setPosition(position);
        grid.setXaxis(xaxis);
        grid.setYaxis(yaxis);
        grid.setRow(row);
        grid.setColumn(column);
        grid.setPadding(padding);
        return grid;
    }
}
