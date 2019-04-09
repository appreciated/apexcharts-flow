package com.github.appreciated.apexcharts.config.xaxis;

import com.github.appreciated.apexcharts.config.xaxis.title.Style;

public class Title {
    String text;
    double offsetX;
    double offsetY;
    Style style;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
}
