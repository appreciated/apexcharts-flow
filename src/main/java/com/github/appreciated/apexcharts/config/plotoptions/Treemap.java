package com.github.appreciated.apexcharts.config.plotoptions;

import com.github.appreciated.apexcharts.config.plotoptions.xmap.ColorScale;

public class Treemap {
    private Boolean enableShades;
    private Double shadeIntensity;
    private Boolean reverseNegativeShade;
    private Boolean distributed;
    private Boolean useFillColorAsStroke;
    private ColorScale colorScale;

    private Double radius;

    public Treemap() {
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

    public Boolean getReverseNegativeShade() {
        return reverseNegativeShade;
    }

    public void setReverseNegativeShade(Boolean reverseNegativeShade) {
        this.reverseNegativeShade = reverseNegativeShade;
    }

    public Boolean getDistributed() {
        return distributed;
    }

    public void setDistributed(Boolean distributed) {
        this.distributed = distributed;
    }

    public Boolean getUseFillColorAsStroke() {
        return useFillColorAsStroke;
    }

    public void setUseFillColorAsStroke(Boolean useFillColorAsStroke) {
        this.useFillColorAsStroke = useFillColorAsStroke;
    }

    public ColorScale getColorScale() {
        return colorScale;
    }

    public void setColorScale(ColorScale colorScale) {
        this.colorScale = colorScale;
    }
}
