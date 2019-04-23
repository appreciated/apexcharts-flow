package com.github.appreciated.apexcharts.config.yaxis.builder;

import com.github.appreciated.apexcharts.config.yaxis.Tooltip;

public class TooltipBuilder {
    private Boolean enabled;
    private Number offsetX;

    private TooltipBuilder() {
    }

    public static TooltipBuilder get() {
        return new TooltipBuilder();
    }

    public TooltipBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public TooltipBuilder withOffsetX(Number offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public Tooltip build() {
        Tooltip tooltip = new Tooltip();
        tooltip.setEnabled(enabled);
        tooltip.setOffsetX(offsetX);
        return tooltip;
    }
}
