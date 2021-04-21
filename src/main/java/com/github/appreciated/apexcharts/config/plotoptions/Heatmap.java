package com.github.appreciated.apexcharts.config.plotoptions;

import com.github.appreciated.apexcharts.config.plotoptions.heatmap.ColorScale;

public class Heatmap {
    private Double radius;
    private Boolean enableShades;
    private Double shadeIntensity;
    private Boolean distributed;
    private ColorScale colorScale;

    public Heatmap() {
    }

    public Double getRadius() {
        return radius;
    }

    public Boolean getEnableShades() {
        return enableShades;
    }

    public Double getShadeIntensity() {
        return shadeIntensity;
    }

    public Boolean getDistributed() {
        return distributed;
    }

    public ColorScale getColorScale() {
        return colorScale;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public void setEnableShades(Boolean enableShades) {
        this.enableShades = enableShades;
    }

    public void setShadeIntensity(Double shadeIntensity) {
        this.shadeIntensity = shadeIntensity;
    }

    public void setDistributed(Boolean distributed) {
        this.distributed = distributed;
    }

    public void setColorScale(ColorScale colorScale) {
        this.colorScale = colorScale;
    }

}
