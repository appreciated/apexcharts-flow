package com.github.appreciated.apexcharts.config.tooltip;

public class Fixed {
    private Boolean enabled;
    private String position;
    private Double offsetX;
    private Double offsetY;


    public Fixed() {
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public String getPosition() {
        return position;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

}
