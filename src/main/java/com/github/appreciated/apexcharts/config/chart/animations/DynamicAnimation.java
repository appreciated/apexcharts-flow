package com.github.appreciated.apexcharts.config.chart.animations;

public class DynamicAnimation {
    private Boolean enabled;
    private Number speed;


    public DynamicAnimation() {
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Number getSpeed() {
        return speed;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setSpeed(Number speed) {
        this.speed = speed;
    }

}
