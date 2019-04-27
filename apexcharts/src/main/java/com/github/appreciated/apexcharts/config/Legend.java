package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.legend.*;

public class Legend {
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

    public Legend() {
    }

    public Boolean getShow() {
        return show;
    }

    public Boolean getShowForSingleSeries() {
        return showForSingleSeries;
    }

    public Boolean getShowForNullSeries() {
        return showForNullSeries;
    }

    public Boolean getShowForZeroSeries() {
        return showForZeroSeries;
    }

    public Boolean getFloating() {
        return floating;
    }

    public Position getPosition() {
        return position;
    }

    public HorizontalAlign getHorizontalAlign() {
        return horizontalAlign;
    }

    public String getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
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

    public Markers getMarkers() {
        return markers;
    }

    public ItemMargin getItemMargin() {
        return itemMargin;
    }

    public ContainerMargin getContainerMargin() {
        return containerMargin;
    }

    public OnItemClick getOnItemClick() {
        return onItemClick;
    }

    public OnItemHover getOnItemHover() {
        return onItemHover;
    }

    public String getFormatter() {
        return formatter;
    }

    public String getTextAnchor() {
        return textAnchor;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setShowForSingleSeries(Boolean showForSingleSeries) {
        this.showForSingleSeries = showForSingleSeries;
    }

    public void setShowForNullSeries(Boolean showForNullSeries) {
        this.showForNullSeries = showForNullSeries;
    }

    public void setShowForZeroSeries(Boolean showForZeroSeries) {
        this.showForZeroSeries = showForZeroSeries;
    }

    public void setFloating(Boolean floating) {
        this.floating = floating;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setHorizontalAlign(HorizontalAlign horizontalAlign) {
        this.horizontalAlign = horizontalAlign;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
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

    public void setMarkers(Markers markers) {
        this.markers = markers;
    }

    public void setItemMargin(ItemMargin itemMargin) {
        this.itemMargin = itemMargin;
    }

    public void setContainerMargin(ContainerMargin containerMargin) {
        this.containerMargin = containerMargin;
    }

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public void setOnItemHover(OnItemHover onItemHover) {
        this.onItemHover = onItemHover;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public void setTextAnchor(String textAnchor) {
        this.textAnchor = textAnchor;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

}
