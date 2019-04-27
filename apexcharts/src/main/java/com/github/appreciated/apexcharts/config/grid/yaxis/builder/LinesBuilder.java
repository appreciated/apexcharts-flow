package com.github.appreciated.apexcharts.config.grid.yaxis.builder;

import com.github.appreciated.apexcharts.config.grid.yaxis.Lines;

public class LinesBuilder {
    private Boolean show;
    private Double offsetX;
    private Double offsetY;

    private LinesBuilder() {
    }

    public static LinesBuilder get() {
        return new LinesBuilder();
    }

    public LinesBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public LinesBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public LinesBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public Lines build() {
        Lines lines = new Lines();
        lines.setShow(show);
        lines.setOffsetX(offsetX);
        lines.setOffsetY(offsetY);
        return lines;
    }
}
