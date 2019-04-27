package com.github.appreciated.apexcharts.config.chart;

public class Brush {
    private Boolean enabled;
    private Boolean autoScaleYaxis;
    private String target;

    public Brush() {
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Boolean getAutoScaleYaxis() {
        return autoScaleYaxis;
    }

    public String getTarget() {
        return target;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setAutoScaleYaxis(Boolean autoScaleYaxis) {
        this.autoScaleYaxis = autoScaleYaxis;
    }

    public void setTarget(String target) {
        this.target = target;
    }

}
