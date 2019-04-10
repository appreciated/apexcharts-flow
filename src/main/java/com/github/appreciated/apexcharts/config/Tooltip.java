package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.tooltip.*;

public class Tooltip {
    Boolean enabled;
    Boolean shared;
    Boolean followCursor;
    Boolean intersect;
    Boolean inverseOrder;
    OnDatasetHover onDatasetHover;
    X x;
    Y y;
    Z z;
    Marker marker;
    Items items;
    Fixed fixed;

    String custom; // TODO
    Boolean fillSeriesColor;
    String theme;
    Style style;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public Boolean getFollowCursor() {
        return followCursor;
    }

    public void setFollowCursor(Boolean followCursor) {
        this.followCursor = followCursor;
    }

    public Boolean getIntersect() {
        return intersect;
    }

    public void setIntersect(Boolean intersect) {
        this.intersect = intersect;
    }

    public Boolean getInverseOrder() {
        return inverseOrder;
    }

    public void setInverseOrder(Boolean inverseOrder) {
        this.inverseOrder = inverseOrder;
    }

    public OnDatasetHover getOnDatasetHover() {
        return onDatasetHover;
    }

    public void setOnDatasetHover(OnDatasetHover onDatasetHover) {
        this.onDatasetHover = onDatasetHover;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public Y getY() {
        return y;
    }

    public void setY(Y y) {
        this.y = y;
    }

    public Z getZ() {
        return z;
    }

    public void setZ(Z z) {
        this.z = z;
    }

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Fixed getFixed() {
        return fixed;
    }

    public void setFixed(Fixed fixed) {
        this.fixed = fixed;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public Boolean getFillSeriesColor() {
        return fillSeriesColor;
    }

    public void setFillSeriesColor(Boolean fillSeriesColor) {
        this.fillSeriesColor = fillSeriesColor;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
}
