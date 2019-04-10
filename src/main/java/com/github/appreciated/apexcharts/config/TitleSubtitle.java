package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.subtitle.Align;
import com.github.appreciated.apexcharts.config.subtitle.Style;

public class TitleSubtitle {
    private String text;
    private Align align;
    private double margin;
    private double offsetX;
    private double offsetY;
    private double floating;
    private Style style;


    public TitleSubtitle() {
    }

    public String getText() {
        return text;
    }

    public Align getAlign() {
        return align;
    }

    public double getMargin() {
        return margin;
    }

    public double getOffsetX() {
        return offsetX;
    }

    public double getOffsetY() {
        return offsetY;
    }

    public double getFloating() {
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

    public void setMargin(double margin) {
        this.margin = margin;
    }

    public void setOffsetX(double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(double offsetY) {
        this.offsetY = offsetY;
    }

    public void setFloating(double floating) {
        this.floating = floating;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

}