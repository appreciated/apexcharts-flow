package com.github.appreciated.apexcharts.config.plotoptions.builder;

import com.github.appreciated.apexcharts.config.plotoptions.Hollow;
import com.github.appreciated.apexcharts.config.plotoptions.hollow.Position;

public class HollowBuilder {
    private Double margin;
    private String size;
    private String background;
    private String image;
    private Double width;
    private Double height;
    private Double offsetX;
    private Double offsetY;
    private Boolean clipped;
    private Position position;

    private HollowBuilder() {
    }

    public static HollowBuilder get() {
        return new HollowBuilder();
    }

    public HollowBuilder withMargin(Double margin) {
        this.margin = margin;
        return this;
    }

    public HollowBuilder withSize(String size) {
        this.size = size;
        return this;
    }

    public HollowBuilder withBackground(String background) {
        this.background = background;
        return this;
    }

    public HollowBuilder withImage(String image) {
        this.image = image;
        return this;
    }

    public HollowBuilder withWidth(Double width) {
        this.width = width;
        return this;
    }

    public HollowBuilder withHeight(Double height) {
        this.height = height;
        return this;
    }

    public HollowBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public HollowBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public HollowBuilder withClipped(Boolean clipped) {
        this.clipped = clipped;
        return this;
    }

    public HollowBuilder withPosition(Position position) {
        this.position = position;
        return this;
    }

    public Hollow build() {
        Hollow hollow = new Hollow();
        hollow.setMargin(margin);
        hollow.setSize(size);
        hollow.setBackground(background);
        hollow.setImage(image);
        hollow.setWidth(width);
        hollow.setHeight(height);
        hollow.setOffsetX(offsetX);
        hollow.setOffsetY(offsetY);
        hollow.setClipped(clipped);
        hollow.setPosition(position);
        return hollow;
    }
}
