package com.github.appreciated.apexcharts.config.chart;

import com.github.appreciated.apexcharts.config.chart.animations.AnimateGradually;
import com.github.appreciated.apexcharts.config.chart.animations.DynamicAnimation;
import com.github.appreciated.apexcharts.config.chart.animations.Easing;

public class Animations {
    Boolean enabled;
    Easing easing;
    double speed;
    AnimateGradually animateGradually;
    DynamicAnimation dynamicAnimation;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Easing getEasing() {
        return easing;
    }

    public void setEasing(Easing easing) {
        this.easing = easing;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public AnimateGradually getAnimateGradually() {
        return animateGradually;
    }

    public void setAnimateGradually(AnimateGradually animateGradually) {
        this.animateGradually = animateGradually;
    }

    public DynamicAnimation getDynamicAnimation() {
        return dynamicAnimation;
    }

    public void setDynamicAnimation(DynamicAnimation dynamicAnimation) {
        this.dynamicAnimation = dynamicAnimation;
    }
}
