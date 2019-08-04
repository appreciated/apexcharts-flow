package com.github.appreciated.apexcharts.config.chart.builder;

import com.github.appreciated.apexcharts.config.chart.Animations;
import com.github.appreciated.apexcharts.config.chart.animations.AnimateGradually;
import com.github.appreciated.apexcharts.config.chart.animations.DynamicAnimation;
import com.github.appreciated.apexcharts.config.chart.animations.Easing;

public class AnimationsBuilder {
    private Boolean enabled;
    private Easing easing;
    private Double speed;
    private AnimateGradually animateGradually;
    private DynamicAnimation dynamicAnimation;

    private AnimationsBuilder() {
    }

    public static AnimationsBuilder get() {
        return new AnimationsBuilder();
    }

    public AnimationsBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public AnimationsBuilder withEasing(Easing easing) {
        this.easing = easing;
        return this;
    }

    public AnimationsBuilder withSpeed(Double speed) {
        this.speed = speed;
        return this;
    }

    public AnimationsBuilder withAnimateGradually(AnimateGradually animateGradually) {
        this.animateGradually = animateGradually;
        return this;
    }

    public AnimationsBuilder withDynamicAnimation(DynamicAnimation dynamicAnimation) {
        this.dynamicAnimation = dynamicAnimation;
        return this;
    }

    public Animations build() {
        Animations animations = new Animations();
        animations.setEnabled(enabled);
        animations.setEasing(easing);
        animations.setSpeed(speed);
        animations.setAnimateGradually(animateGradually);
        animations.setDynamicAnimation(dynamicAnimation);
        return animations;
    }
}
