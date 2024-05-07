package com.github.appreciated.apexcharts.config.plotoptions.bar;

public class Total {
    private boolean enabled;
    private String formatter;
    private Double offsetX;
    private Double offsetY;
    private Style style;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getFormatter() {
        return formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
}
