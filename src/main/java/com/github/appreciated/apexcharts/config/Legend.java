package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.legend.*;

public class Legend {
    Boolean show;
    Boolean showForSingleSeries;
    Boolean showForNullSeries;
    Boolean showForZeroSeries;
    Boolean floating;
    Position position;
    HorizontalAlign horizontalAlign;
    String fontSize;
    String fontFamily;
    double width;
    double height;
    double offsetX;
    double offsetY;
    Markers markers;
    ItemMargin itemMargin;
    ContainerMargin containerMargin;
    OnItemClick onItemClick;
    OnItemHover onItemHover;

    String formatter;
    String textAnchor;
    Labels labels;

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Boolean getShowForSingleSeries() {
        return showForSingleSeries;
    }

    public void setShowForSingleSeries(Boolean showForSingleSeries) {
        this.showForSingleSeries = showForSingleSeries;
    }

    public Boolean getShowForNullSeries() {
        return showForNullSeries;
    }

    public void setShowForNullSeries(Boolean showForNullSeries) {
        this.showForNullSeries = showForNullSeries;
    }

    public Boolean getShowForZeroSeries() {
        return showForZeroSeries;
    }

    public void setShowForZeroSeries(Boolean showForZeroSeries) {
        this.showForZeroSeries = showForZeroSeries;
    }

    public Boolean getFloating() {
        return floating;
    }

    public void setFloating(Boolean floating) {
        this.floating = floating;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public HorizontalAlign getHorizontalAlign() {
        return horizontalAlign;
    }

    public void setHorizontalAlign(HorizontalAlign horizontalAlign) {
        this.horizontalAlign = horizontalAlign;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(double offsetX) {
        this.offsetX = offsetX;
    }

    public double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(double offsetY) {
        this.offsetY = offsetY;
    }

    public Markers getMarkers() {
        return markers;
    }

    public void setMarkers(Markers markers) {
        this.markers = markers;
    }

    public ItemMargin getItemMargin() {
        return itemMargin;
    }

    public void setItemMargin(ItemMargin itemMargin) {
        this.itemMargin = itemMargin;
    }

    public ContainerMargin getContainerMargin() {
        return containerMargin;
    }

    public void setContainerMargin(ContainerMargin containerMargin) {
        this.containerMargin = containerMargin;
    }

    public OnItemClick getOnItemClick() {
        return onItemClick;
    }

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public OnItemHover getOnItemHover() {
        return onItemHover;
    }

    public void setOnItemHover(OnItemHover onItemHover) {
        this.onItemHover = onItemHover;
    }

    public String getFormatter() {
        return formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public String getTextAnchor() {
        return textAnchor;
    }

    public void setTextAnchor(String textAnchor) {
        this.textAnchor = textAnchor;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }
}
