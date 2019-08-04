package com.github.appreciated.apexcharts.config.chart;

import com.github.appreciated.apexcharts.config.chart.animations.AnimateGradually;
import com.github.appreciated.apexcharts.config.chart.animations.DynamicAnimation;
import com.github.appreciated.apexcharts.config.chart.animations.Easing;

public class Animations {
    private Boolean enabled;
    private Easing easing;
    private Double speed;
    private AnimateGradually animateGradually;
    private DynamicAnimation dynamicAnimation;

    public Animations() {
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Easing getEasing() {
        return easing;
    }

    public Double getSpeed() {
        return speed;
    }

    public AnimateGradually getAnimateGradually() {
        return animateGradually;
    }

    public DynamicAnimation getDynamicAnimation() {
        return dynamicAnimation;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setEasing(Easing easing) {
        this.easing = easing;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public void setAnimateGradually(AnimateGradually animateGradually) {
        this.animateGradually = animateGradually;
    }

    public void setDynamicAnimation(DynamicAnimation dynamicAnimation) {
        this.dynamicAnimation = dynamicAnimation;
    }

}
