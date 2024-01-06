package com.github.appreciated.apexcharts.config.plotoptions.builder;

import com.github.appreciated.apexcharts.config.plotoptions.Treemap;
import com.github.appreciated.apexcharts.config.plotoptions.xmap.ColorScale;

public class TreemapBuilder {
    private Boolean enableShades;
    private Double shadeIntensity;
    private Boolean reverseNegativeShade;
    private Boolean distributed;
    private Boolean useFillColorAsStroke;
    private ColorScale colorScale;

    private TreemapBuilder() {
    }

    public static TreemapBuilder get() {
        return new TreemapBuilder();
    }


    public TreemapBuilder withEnableShades(Boolean enableShades) {
        this.enableShades = enableShades;
        return this;
    }

    public TreemapBuilder withShadeIntensity(Double shadeIntensity) {
        this.shadeIntensity = shadeIntensity;
        return this;
    }

    public TreemapBuilder withReverseNegativeShade(Boolean reverseNegativeShade) {
        this.reverseNegativeShade = reverseNegativeShade;
        return this;
    }

    public TreemapBuilder withDistributed(Boolean distributed) {
        this.distributed = distributed;
        return this;
    }

    public TreemapBuilder withUseFillColorAsStroke(Boolean useFillColorAsStroke) {
        this.useFillColorAsStroke = useFillColorAsStroke;
        return this;
    }

    public TreemapBuilder withColorScale(ColorScale colorScale) {
        this.colorScale = colorScale;
        return this;
    }

    public Treemap build() {
        Treemap treemap = new Treemap();
        treemap.setEnableShades(enableShades);
        treemap.setShadeIntensity(shadeIntensity);
        treemap.setReverseNegativeShade(reverseNegativeShade);
        treemap.setDistributed(distributed);
        treemap.setUseFillColorAsStroke(useFillColorAsStroke);
        treemap.setColorScale(colorScale);
        return treemap;
    }
}
