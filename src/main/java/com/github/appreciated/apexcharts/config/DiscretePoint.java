package com.github.appreciated.apexcharts.config;

class DiscretePoint {
    double seriesIndex;
    double dataPointIndex;
    String fillColor;
    String strokeColor;
    double size;

    public double getSeriesIndex() {
        return seriesIndex;
    }

    public void setSeriesIndex(double seriesIndex) {
        this.seriesIndex = seriesIndex;
    }

    public double getDataPointIndex() {
        return dataPointIndex;
    }

    public void setDataPointIndex(double dataPointIndex) {
        this.dataPointIndex = dataPointIndex;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
