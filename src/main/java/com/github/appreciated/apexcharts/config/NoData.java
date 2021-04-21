package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.nodata.Align;
import com.github.appreciated.apexcharts.config.nodata.Style;
import com.github.appreciated.apexcharts.config.nodata.VerticalAlign;

public class NoData {
    private String text;
    private Align align;
    private VerticalAlign verticalAlign;
    private Double offsetX;
    private Double offsetY;
    private Style style;


    public NoData() {
    }

    public String getText() {
        return text;
    }

    public Align getAlign() {
        return align;
    }

    public VerticalAlign getVerticalAlign() {
        return verticalAlign;
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

    public void setAlign(Align align) {
        this.align = align;
    }

    public void setVerticalAlign(VerticalAlign verticalAlign) {
        this.verticalAlign = verticalAlign;
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
