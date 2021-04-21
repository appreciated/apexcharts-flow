package com.github.appreciated.apexcharts.config.chart.animations.builder;

import com.github.appreciated.apexcharts.config.chart.animations.DynamicAnimation;

public class DynamicAnimationBuilder {
    private Boolean enabled;
    private Number speed;

    private DynamicAnimationBuilder() {
    }

    public static DynamicAnimationBuilder get() {
        return new DynamicAnimationBuilder();
    }

    public DynamicAnimationBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public DynamicAnimationBuilder withSpeed(Number speed) {
        this.speed = speed;
        return this;
    }

    public DynamicAnimation build() {
        DynamicAnimation dynamicAnimation = new DynamicAnimation();
        dynamicAnimation.setEnabled(enabled);
        dynamicAnimation.setSpeed(speed);
        return dynamicAnimation;
    }
}
