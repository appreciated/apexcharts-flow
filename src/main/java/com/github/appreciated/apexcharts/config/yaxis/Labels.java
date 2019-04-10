package com.github.appreciated.apexcharts.config.yaxis;

import com.github.appreciated.apexcharts.config.yaxis.labels.Style;

public class Labels {
    Boolean show;
    Double minWidth;
    Double maxWidth;
    Double offsetX;
    Double offsetY;
    Double rotate;
    Align align;
    Double padding;
    Style style;
    String formatter;

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Double getMinWidth() {
        return minWidth;
    }

    public void setMinWidth(Double minWidth) {
        this.minWidth = minWidth;
    }

    public Double getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(Double maxWidth) {
        this.maxWidth = maxWidth;
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

    public Double getRotate() {
        return rotate;
    }

    public void setRotate(Double rotate) {
        this.rotate = rotate;
    }

    public Align getAlign() {
        return align;
    }

    public void setAlign(Align align) {
        this.align = align;
    }

    public Double getPadding() {
        return padding;
    }

    public void setPadding(Double padding) {
        this.padding = padding;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String getFormatter() {
        return formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }
}
