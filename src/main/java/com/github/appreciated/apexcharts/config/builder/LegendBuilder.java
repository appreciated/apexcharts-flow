package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.Legend;
import com.github.appreciated.apexcharts.config.Markers;
import com.github.appreciated.apexcharts.config.legend.*;
import com.github.appreciated.apexcharts.helper.Formatter;

public class LegendBuilder {
    private Boolean show;
    private Boolean showForSingleSeries;
    private Boolean showForNullSeries;
    private Boolean showForZeroSeries;
    private Boolean floating;
    private Position position;
    private HorizontalAlign horizontalAlign;
    private String fontSize;
    private String fontFamily;
    private Double width;
    private Double height;
    private Double offsetX;
    private Double offsetY;
    private Markers markers;
    private ItemMargin itemMargin;
    private ContainerMargin containerMargin;
    private OnItemClick onItemClick;
    private OnItemHover onItemHover;
    private String formatter;
    private String textAnchor;
    private Labels labels;

    private LegendBuilder() {
    }

    public static LegendBuilder get() {
        return new LegendBuilder();
    }

    public LegendBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public LegendBuilder withShowForSingleSeries(Boolean showForSingleSeries) {
        this.showForSingleSeries = showForSingleSeries;
        return this;
    }

    public LegendBuilder withShowForNullSeries(Boolean showForNullSeries) {
        this.showForNullSeries = showForNullSeries;
        return this;
    }

    public LegendBuilder withShowForZeroSeries(Boolean showForZeroSeries) {
        this.showForZeroSeries = showForZeroSeries;
        return this;
    }

    public LegendBuilder withFloating(Boolean floating) {
        this.floating = floating;
        return this;
    }

    public LegendBuilder withPosition(Position position) {
        this.position = position;
        return this;
    }

    public LegendBuilder withHorizontalAlign(HorizontalAlign horizontalAlign) {
        this.horizontalAlign = horizontalAlign;
        return this;
    }

    public LegendBuilder withFontSize(String fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public LegendBuilder withFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public LegendBuilder withWidth(Double width) {
        this.width = width;
        return this;
    }

    public LegendBuilder withHeight(Double height) {
        this.height = height;
        return this;
    }

    public LegendBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public LegendBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public LegendBuilder withMarkers(Markers markers) {
        this.markers = markers;
        return this;
    }

    public LegendBuilder withItemMargin(ItemMargin itemMargin) {
        this.itemMargin = itemMargin;
        return this;
    }

    public LegendBuilder withContainerMargin(ContainerMargin containerMargin) {
        this.containerMargin = containerMargin;
        return this;
    }

    public LegendBuilder withOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
        return this;
    }

    public LegendBuilder withOnItemHover(OnItemHover onItemHover) {
        this.onItemHover = onItemHover;
        return this;
    }

    public LegendBuilder withFormatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public LegendBuilder withFormatter(Formatter formatter) {
        this.formatter = formatter.getString();
        return this;
    }

    public LegendBuilder withTextAnchor(String textAnchor) {
        this.textAnchor = textAnchor;
        return this;
    }

    public LegendBuilder withLabels(Labels labels) {
        this.labels = labels;
        return this;
    }

    public Legend build() {
        Legend legend = new Legend();
        legend.setShow(show);
        legend.setShowForSingleSeries(showForSingleSeries);
        legend.setShowForNullSeries(showForNullSeries);
        legend.setShowForZeroSeries(showForZeroSeries);
        legend.setFloating(floating);
        legend.setPosition(position);
        legend.setHorizontalAlign(horizontalAlign);
        legend.setFontSize(fontSize);
        legend.setFontFamily(fontFamily);
        legend.setWidth(width);
        legend.setHeight(height);
        legend.setOffsetX(offsetX);
        legend.setOffsetY(offsetY);
        legend.setMarkers(markers);
        legend.setItemMargin(itemMargin);
        legend.setContainerMargin(containerMargin);
        legend.setOnItemClick(onItemClick);
        legend.setOnItemHover(onItemHover);
        legend.setFormatter(formatter);
        legend.setTextAnchor(textAnchor);
        legend.setLabels(labels);
        return legend;
    }
}
