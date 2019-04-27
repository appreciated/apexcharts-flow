package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.subtitle.Align;
import com.github.appreciated.apexcharts.config.subtitle.Style;

public class TitleSubtitle {
    private String text;
    private Align align;
    private Double margin;
    private Double offsetX;
    private Double offsetY;
    private Double floating;
    private Style style;


    public TitleSubtitle() {
    }

    public String getText() {
        return text;
    }

    public Align getAlign() {
        return align;
    }

    public Double getMargin() {
        return margin;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public Double getFloating() {
        return floating;
    }

    public Style getStyle() {
        return style;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAlign(Align align) {
        this.align = align;
    }

    public void setMargin(Double margin) {
        this.margin = margin;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public void setFloating(Double floating) {
        this.floating = floating;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

}