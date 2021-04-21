package com.github.appreciated.apexcharts.config.plotoptions.radar;

import com.github.appreciated.apexcharts.config.plotoptions.polygons.Fill;

import java.util.List;

public class Polygons {
    private List<String> strokeColor;
    private List<String> connectorColors;
    private Fill fill;


    public Polygons() {
    }

    public List<String> getStrokeColor() {
        return strokeColor;
    }

    public List<String> getConnectorColors() {
        return connectorColors;
    }

    public Fill getFill() {
        return fill;
    }

    public void setStrokeColor(List<String> strokeColor) {
        this.strokeColor = strokeColor;
    }

    public void setConnectorColors(List<String> connectorColors) {
        this.connectorColors = connectorColors;
    }

    public void setFill(Fill fill) {
        this.fill = fill;
    }

}
