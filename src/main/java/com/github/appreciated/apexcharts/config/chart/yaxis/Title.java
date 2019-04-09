package com.github.appreciated.apexcharts.config.chart.yaxis;

import com.github.appreciated.apexcharts.config.chart.yaxis.title.Style;

class Title {
    String text;
    Number rotate;
    Number offsetX;
    Number offsetY;
    Style style;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Number getRotate() {
        return rotate;
    }

    public void setRotate(Number rotate) {
        this.rotate = rotate;
    }

    public Number getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(Number offsetX) {
        this.offsetX = offsetX;
    }

    public Number getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(Number offsetY) {
        this.offsetY = offsetY;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
}
