package com.github.appreciated.apexcharts.config.xaxis;

import com.github.appreciated.apexcharts.config.xaxis.title.Style;

public class Title {
    private String text;
    private Double offsetX;
    private Double offsetY;
    private Style style;


    public Title() {
    }

    public String getText() {
        return text;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public Style getStyle() {
        return style;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

}
