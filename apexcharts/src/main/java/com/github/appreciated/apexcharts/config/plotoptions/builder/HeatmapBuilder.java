package com.github.appreciated.apexcharts.config.plotoptions.builder;

import com.github.appreciated.apexcharts.config.plotoptions.Heatmap;
import com.github.appreciated.apexcharts.config.plotoptions.heatmap.ColorScale;

public class HeatmapBuilder {
    private Double radius;
    private Boolean enableShades;
    private Double shadeIntensity;
    private Boolean distributed;
    private ColorScale colorScale;

    private HeatmapBuilder() {
    }

    public static HeatmapBuilder get() {
        return new HeatmapBuilder();
    }

    public HeatmapBuilder withRadius(Double radius) {
        this.radius = radius;
        return this;
    }

    public HeatmapBuilder withEnableShades(Boolean enableShades) {
        this.enableShades = enableShades;
        return this;
    }

    public HeatmapBuilder withShadeIntensity(Double shadeIntensity) {
        this.shadeIntensity = shadeIntensity;
        return this;
    }

    public HeatmapBuilder withDistributed(Boolean distributed) {
        this.distributed = distributed;
        return this;
    }

    public HeatmapBuilder withColorScale(ColorScale colorScale) {
        this.colorScale = colorScale;
        return this;
    }

    public Heatmap build() {
        Heatmap heatmap = new Heatmap();
        heatmap.setRadius(radius);
        heatmap.setEnableShades(enableShades);
        heatmap.setShadeIntensity(shadeIntensity);
        heatmap.setDistributed(distributed);
        heatmap.setColorScale(colorScale);
        return heatmap;
    }
}
