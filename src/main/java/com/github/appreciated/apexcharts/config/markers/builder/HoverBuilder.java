package com.github.appreciated.apexcharts.config.markers.builder;

import com.github.appreciated.apexcharts.config.markers.Hover;

public class HoverBuilder {
    private Double size;
    private Double sizeOffset;

    private HoverBuilder() {
    }

    public static HoverBuilder get() {
        return new HoverBuilder();
    }

    public HoverBuilder withSize(Double size) {
        this.size = size;
        return this;
    }

    public HoverBuilder withSizeOffset(Double sizeOffset) {
        this.sizeOffset = sizeOffset;
        return this;
    }

    public Hover build() {
        Hover hover = new Hover();
        hover.setSize(size);
        hover.setSizeOffset(sizeOffset);
        return hover;
    }
}
