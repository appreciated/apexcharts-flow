package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.tooltip.*;

public class Tooltip {
    private Boolean enabled;
    private Boolean shared;
    private Boolean followCursor;
    private Boolean intersect;
    private Boolean inverseOrder;
    private OnDatasetHover onDatasetHover;
    private X x;
    private Y y;
    private Z z;
    private Marker marker;
    private Items items;
    private Fixed fixed;

    private String custom; // TODO
    private Boolean fillSeriesColor;
    private String theme;
    private Style style;


    public Tooltip() {
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Boolean getShared() {
        return shared;
    }

    public Boolean getFollowCursor() {
        return followCursor;
    }

    public Boolean getIntersect() {
        return intersect;
    }

    public Boolean getInverseOrder() {
        return inverseOrder;
    }

    public OnDatasetHover getOnDatasetHover() {
        return onDatasetHover;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public Z getZ() {
        return z;
    }

    public Marker getMarker() {
        return marker;
    }

    public Items getItems() {
        return items;
    }

    public Fixed getFixed() {
        return fixed;
    }

    public String getCustom() {
        return custom;
    }

    public Boolean getFillSeriesColor() {
        return fillSeriesColor;
    }

    public String getTheme() {
        return theme;
    }

    public Style getStyle() {
        return style;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public void setFollowCursor(Boolean followCursor) {
        this.followCursor = followCursor;
    }

    public void setIntersect(Boolean intersect) {
        this.intersect = intersect;
    }

    public void setInverseOrder(Boolean inverseOrder) {
        this.inverseOrder = inverseOrder;
    }

    public void setOnDatasetHover(OnDatasetHover onDatasetHover) {
        this.onDatasetHover = onDatasetHover;
    }

    public void setX(X x) {
        this.x = x;
    }

    public void setY(Y y) {
        this.y = y;
    }

    public void setZ(Z z) {
        this.z = z;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public void setFixed(Fixed fixed) {
        this.fixed = fixed;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public void setFillSeriesColor(Boolean fillSeriesColor) {
        this.fillSeriesColor = fillSeriesColor;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

}
