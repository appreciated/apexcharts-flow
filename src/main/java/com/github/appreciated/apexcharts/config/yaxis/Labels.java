package com.github.appreciated.apexcharts.config.yaxis;

import com.github.appreciated.apexcharts.config.yaxis.labels.Style;

public class Labels {
    private Boolean show;
    private Double minWidth;
    private Double maxWidth;
    private Double offsetX;
    private Double offsetY;
    private Double rotate;
    private Align align;
    private Double padding;
    private Style style;
    private String formatter;


    public Labels() {
    }

    public Boolean getShow() {
        return show;
    }

    public Double getMinWidth() {
        return minWidth;
    }

    public Double getMaxWidth() {
        return maxWidth;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public Double getRotate() {
        return rotate;
    }

    public Align getAlign() {
        return align;
    }

    public Double getPadding() {
        return padding;
    }

    public Style getStyle() {
        return style;
    }

    public String getFormatter() {
        return formatter;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setMinWidth(Double minWidth) {
        this.minWidth = minWidth;
    }

    public void setMaxWidth(Double maxWidth) {
        this.maxWidth = maxWidth;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public void setRotate(Double rotate) {
        this.rotate = rotate;
    }

    public void setAlign(Align align) {
        this.align = align;
    }

    public void setPadding(Double padding) {
        this.padding = padding;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

}
