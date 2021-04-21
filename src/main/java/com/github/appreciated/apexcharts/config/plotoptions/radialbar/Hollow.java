package com.github.appreciated.apexcharts.config.plotoptions.radialbar;

import com.github.appreciated.apexcharts.config.chart.DropShadow;
import com.github.appreciated.apexcharts.config.plotoptions.hollow.HollowPosition;

public class Hollow {
    private Double margin;
    private String size;
    private String background;
    private String image;
    private Double width;
    private Double height;
    private Double offsetX;
    private Double offsetY;
    private Boolean clipped;
    private HollowPosition position;
    private DropShadow dropShadow;

    public Hollow() {
    }

    public Double getMargin() {
        return margin;
    }

    public String getSize() {
        return size;
    }

    public String getBackground() {
        return background;
    }

    public String getImage() {
        return image;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public Boolean getClipped() {
        return clipped;
    }

    public HollowPosition getPosition() {
        return position;
    }

    public void setMargin(Double margin) {
        this.margin = margin;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public void setClipped(Boolean clipped) {
        this.clipped = clipped;
    }

    public void setPosition(HollowPosition position) {
        this.position = position;
    }

    public DropShadow getDropShadow() {
        return dropShadow;
    }

    public void setDropShadow(DropShadow dropShadow) {
        this.dropShadow = dropShadow;
    }
}
