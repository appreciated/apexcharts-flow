package com.github.appreciated.apexcharts.config.yaxis;

import com.github.appreciated.apexcharts.config.yaxis.title.Style;

public class Title {
    private String text;
    private Number rotate;
    private Number offsetX;
    private Number offsetY;
    private Style style;


    public Title() {
    }

    public String getText() {
        return text;
    }

    public Number getRotate() {
        return rotate;
    }

    public Number getOffsetX() {
        return offsetX;
    }

    public Number getOffsetY() {
        return offsetY;
    }

    public Style getStyle() {
        return style;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setRotate(Number rotate) {
        this.rotate = rotate;
    }

    public void setOffsetX(Number offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Number offsetY) {
        this.offsetY = offsetY;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

}
