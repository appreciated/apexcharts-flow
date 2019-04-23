package com.github.appreciated.apexcharts.config.fill.builder;

import com.github.appreciated.apexcharts.config.fill.Image;

import java.util.List;

public class ImageBuilder {
    private List<String> src;
    private Double width;
    private Double height;

    private ImageBuilder() {
    }

    public static ImageBuilder get() {
        return new ImageBuilder();
    }

    public ImageBuilder withSrc(List<String> src) {
        this.src = src;
        return this;
    }

    public ImageBuilder withWidth(Double width) {
        this.width = width;
        return this;
    }

    public ImageBuilder withHeight(Double height) {
        this.height = height;
        return this;
    }

    public Image build() {
        Image image = new Image();
        image.setSrc(src);
        image.setWidth(width);
        image.setHeight(height);
        return image;
    }
}
