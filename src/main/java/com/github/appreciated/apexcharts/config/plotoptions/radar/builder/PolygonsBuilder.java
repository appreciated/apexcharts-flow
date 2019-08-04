package com.github.appreciated.apexcharts.config.plotoptions.radar.builder;

import com.github.appreciated.apexcharts.config.plotoptions.polygons.Fill;
import com.github.appreciated.apexcharts.config.plotoptions.radar.Polygons;

import java.util.List;

public class PolygonsBuilder {
    private List<String> strokeColor;
    private List<String> connectorColors;
    private Fill fill;

    private PolygonsBuilder() {
    }

    public static PolygonsBuilder get() {
        return new PolygonsBuilder();
    }

    public PolygonsBuilder withStrokeColor(List<String> strokeColor) {
        this.strokeColor = strokeColor;
        return this;
    }

    public PolygonsBuilder withConnectorColors(List<String> connectorColors) {
        this.connectorColors = connectorColors;
        return this;
    }

    public PolygonsBuilder withFill(Fill fill) {
        this.fill = fill;
        return this;
    }

    public Polygons build() {
        Polygons polygons = new Polygons();
        polygons.setStrokeColor(strokeColor);
        polygons.setConnectorColors(connectorColors);
        polygons.setFill(fill);
        return polygons;
    }
}
