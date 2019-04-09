package com.github.appreciated.apexcharts.config.chart.plotoptions.radar;

import com.github.appreciated.apexcharts.config.chart.plotoptions.polygons.Fill;

import java.util.List;

public class Polygons {
    List<String> strokeColor;
    List<String> connectorColors;
    Fill fill;

    public List<String> getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(List<String> strokeColor) {
        this.strokeColor = strokeColor;
    }

    public List<String> getConnectorColors() {
        return connectorColors;
    }

    public void setConnectorColors(List<String> connectorColors) {
        this.connectorColors = connectorColors;
    }

    public Fill getFill() {
        return fill;
    }

    public void setFill(Fill fill) {
        this.fill = fill;
    }
}
