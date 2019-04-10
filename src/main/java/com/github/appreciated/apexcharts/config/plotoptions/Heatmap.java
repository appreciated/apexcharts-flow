package com.github.appreciated.apexcharts.config.plotoptions;

import com.github.appreciated.apexcharts.config.plotoptions.heatmap.ColorScale;

public class Heatmap {
    Double radius;
    Boolean enableShades;
    Double shadeIntensity;
    Boolean distributed;
    ColorScale colorScale;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Boolean getEnableShades() {
        return enableShades;
    }

    public void setEnableShades(Boolean enableShades) {
        this.enableShades = enableShades;
    }

    public Double getShadeIntensity() {
        return shadeIntensity;
    }

    public void setShadeIntensity(Double shadeIntensity) {
        this.shadeIntensity = shadeIntensity;
    }

    public Boolean getDistributed() {
        return distributed;
    }

    public void setDistributed(Boolean distributed) {
        this.distributed = distributed;
    }

    public ColorScale getColorScale() {
        return colorScale;
    }

    public void setColorScale(ColorScale colorScale) {
        this.colorScale = colorScale;
    }
}
