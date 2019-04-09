package com.github.appreciated.apexcharts.config.plotoptions;

class Polygons {
    String[] strokeColor;
    String[] connectorColors;
    Fill fill;
    class Fill {
        String[] colors;
    }

    public String[] getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(String[] strokeColor) {
        this.strokeColor = strokeColor;
    }

    public String[] getConnectorColors() {
        return connectorColors;
    }

    public void setConnectorColors(String[] connectorColors) {
        this.connectorColors = connectorColors;
    }

    public Fill getFill() {
        return fill;
    }

    public void setFill(Fill fill) {
        this.fill = fill;
    }
}
