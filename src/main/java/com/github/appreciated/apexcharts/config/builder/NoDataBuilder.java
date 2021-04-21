package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.NoData;
import com.github.appreciated.apexcharts.config.nodata.Align;
import com.github.appreciated.apexcharts.config.nodata.Style;
import com.github.appreciated.apexcharts.config.nodata.VerticalAlign;

public class NoDataBuilder {
    private String text;
    private Align align;
    private VerticalAlign verticalAlign;
    private Double offsetX;
    private Double offsetY;
    private Style style;

    private NoDataBuilder() {
    }

    public static NoDataBuilder get() {
        return new NoDataBuilder();
    }

    public NoDataBuilder withText(String text) {
        this.text = text;
        return this;
    }

    public NoDataBuilder withAlign(Align align) {
        this.align = align;
        return this;
    }

    public NoDataBuilder withVerticalAlign(VerticalAlign verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public NoDataBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public NoDataBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public NoDataBuilder withStyle(Style style) {
        this.style = style;
        return this;
    }

    public NoData build() {
        NoData noData = new NoData();
        noData.setText(text);
        noData.setAlign(align);
        noData.setVerticalAlign(verticalAlign);
        noData.setOffsetX(offsetX);
        noData.setOffsetY(offsetY);
        noData.setStyle(style);
        return noData;
    }
}
