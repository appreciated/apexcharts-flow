package com.github.appreciated.apexcharts.config.chart.animations.builder;

import com.github.appreciated.apexcharts.config.chart.animations.AnimateGradually;

public class AnimateGraduallyBuilder {
    private Boolean enabled;
    private Number delay;

    private AnimateGraduallyBuilder() {
    }

    public static AnimateGraduallyBuilder get() {
        return new AnimateGraduallyBuilder();
    }

    public AnimateGraduallyBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public AnimateGraduallyBuilder withDelay(Number delay) {
        this.delay = delay;
        return this;
    }

    public AnimateGradually build() {
        AnimateGradually animateGradually = new AnimateGradually();
        animateGradually.setEnabled(enabled);
        animateGradually.setDelay(delay);
        return animateGradually;
    }
}
