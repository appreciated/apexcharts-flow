package com.github.appreciated.apexcharts.config.theme;

public class Monochrome {
    private Boolean enabled;
    private String color;
    private ShadeTo shadeTo;
    private Double shadeIntensity;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ShadeTo getShadeTo() {
        return shadeTo;
    }

    public void setShadeTo(ShadeTo shadeTo) {
        this.shadeTo = shadeTo;
    }

    public Double getShadeIntensity() {
        return shadeIntensity;
    }

    public void setShadeIntensity(Double shadeIntensity) {
        this.shadeIntensity = shadeIntensity;
    }
}
