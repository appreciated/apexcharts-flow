package com.github.appreciated.apexcharts.config.tooltip.builder;

import com.github.appreciated.apexcharts.config.tooltip.Fixed;

public class FixedBuilder {
    private Boolean enabled;
    private String position;
    private Double offsetX;
    private Double offsetY;

    private FixedBuilder() {
    }

    public static FixedBuilder get() {
        return new FixedBuilder();
    }

    public FixedBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public FixedBuilder withPosition(String position) {
        this.position = position;
        return this;
    }

    public FixedBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public FixedBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public Fixed build() {
        Fixed fixed = new Fixed();
        fixed.setEnabled(enabled);
        fixed.setPosition(position);
        fixed.setOffsetX(offsetX);
        fixed.setOffsetY(offsetY);
        return fixed;
    }
}
