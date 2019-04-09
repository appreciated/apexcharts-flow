package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.grid.*;

public class ApexGrid {
    Boolean show;
    String borderColor;
    double strokeDashArray;
    Position position;
    Xaxis xaxis;
    Yaxis yaxis;
    Row row;
    Column column;
    Padding padding;

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public double getStrokeDashArray() {
        return strokeDashArray;
    }

    public void setStrokeDashArray(double strokeDashArray) {
        this.strokeDashArray = strokeDashArray;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Xaxis getXaxis() {
        return xaxis;
    }

    public void setXaxis(Xaxis xaxis) {
        this.xaxis = xaxis;
    }

    public Yaxis getYaxis() {
        return yaxis;
    }

    public void setYaxis(Yaxis yaxis) {
        this.yaxis = yaxis;
    }

    public Row getRow() {
        return row;
    }

    public void setRow(Row row) {
        this.row = row;
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    public Padding getPadding() {
        return padding;
    }

    public void setPadding(Padding padding) {
        this.padding = padding;
    }
}
