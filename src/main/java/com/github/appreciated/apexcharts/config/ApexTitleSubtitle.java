package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.subtitle.Align;
import com.github.appreciated.apexcharts.config.subtitle.Style;

public class ApexTitleSubtitle {
    String text;
    Align align;
    double margin;
    double offsetX;
    double offsetY;
    double floating;
    Style style;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Align getAlign() {
        return align;
    }

    public void setAlign(Align align) {
        this.align = align;
    }

    public double getMargin() {
        return margin;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }

    public double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(double offsetX) {
        this.offsetX = offsetX;
    }

    public double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(double offsetY) {
        this.offsetY = offsetY;
    }

    public double getFloating() {
        return floating;
    }

    public void setFloating(double floating) {
        this.floating = floating;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
}