package com.github.appreciated.apexcharts.config;

class DiscretePoint {
    Double seriesIndex;
    Double dataPointIndex;
    String fillColor;
    String strokeColor;
    Double size;

    public Double getSeriesIndex() {
        return seriesIndex;
    }

    public void setSeriesIndex(Double seriesIndex) {
        this.seriesIndex = seriesIndex;
    }

    public Double getDataPointIndex() {
        return dataPointIndex;
    }

    public void setDataPointIndex(Double dataPointIndex) {
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

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }
}
