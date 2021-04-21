package com.github.appreciated.apexcharts.config.theme;

public class Monochrome {
    private Boolean enabled;
    private String color;
    private ShadeTo shadeTo;
    private Double shadeIntensity;


    public Monochrome() {
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public String getColor() {
        return color;
    }

    public ShadeTo getShadeTo() {
        return shadeTo;
    }

    public Double getShadeIntensity() {
        return shadeIntensity;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setShadeTo(ShadeTo shadeTo) {
        this.shadeTo = shadeTo;
    }

    public void setShadeIntensity(Double shadeIntensity) {
        this.shadeIntensity = shadeIntensity;
    }

}
