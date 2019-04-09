package com.github.appreciated.apexcharts.config.plotoptions;

import com.github.appreciated.apexcharts.config.plotoptions.heatmap.ColorScale;

public class Heatmap {
    double radius;
    Boolean enableShades;
    double shadeIntensity;
    Boolean distributed;
    ColorScale colorScale;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Boolean getEnableShades() {
        return enableShades;
    }

    public void setEnableShades(Boolean enableShades) {
        this.enableShades = enableShades;
    }

    public double getShadeIntensity() {
        return shadeIntensity;
    }

    public void setShadeIntensity(double shadeIntensity) {
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
