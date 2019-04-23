package com.github.appreciated.apexcharts.config.fill;

import java.util.List;

public class Image {
    private List<String> src;
    private Double width;
    private Double height;


    public Image() {
    }

    public List<String> getSrc() {
        return src;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public void setSrc(List<String> src) {
        this.src = src;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

}
