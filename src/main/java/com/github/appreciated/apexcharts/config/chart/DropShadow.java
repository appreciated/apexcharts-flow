package com.github.appreciated.apexcharts.config.chart;

public class DropShadow {
    private Boolean enabled;
    private Double top;
    private Double left;
    private Double blur;
    private Double opacity;

    public DropShadow() {
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Double getTop() {
        return top;
    }

    public Double getLeft() {
        return left;
    }

    public Double getBlur() {
        return blur;
    }

    public Double getOpacity() {
        return opacity;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setTop(Double top) {
        this.top = top;
    }

    public void setLeft(Double left) {
        this.left = left;
    }

    public void setBlur(Double blur) {
        this.blur = blur;
    }

    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }

}
