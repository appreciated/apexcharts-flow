package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.Tooltip;
import com.github.appreciated.apexcharts.config.tooltip.*;

public class TooltipBuilder {
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
    private String custom;
    private Boolean fillSeriesColor;
    private String theme;
    private Style style;

    private TooltipBuilder() {
    }

    public static TooltipBuilder get() {
        return new TooltipBuilder();
    }

    public TooltipBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public TooltipBuilder withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    public TooltipBuilder withFollowCursor(Boolean followCursor) {
        this.followCursor = followCursor;
        return this;
    }

    public TooltipBuilder withIntersect(Boolean intersect) {
        this.intersect = intersect;
        return this;
    }

    public TooltipBuilder withInverseOrder(Boolean inverseOrder) {
        this.inverseOrder = inverseOrder;
        return this;
    }

    public TooltipBuilder withOnDatasetHover(OnDatasetHover onDatasetHover) {
        this.onDatasetHover = onDatasetHover;
        return this;
    }

    public TooltipBuilder withX(X x) {
        this.x = x;
        return this;
    }

    public TooltipBuilder withY(Y y) {
        this.y = y;
        return this;
    }

    public TooltipBuilder withZ(Z z) {
        this.z = z;
        return this;
    }

    public TooltipBuilder withMarker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public TooltipBuilder withItems(Items items) {
        this.items = items;
        return this;
    }

    public TooltipBuilder withFixed(Fixed fixed) {
        this.fixed = fixed;
        return this;
    }

    public TooltipBuilder withCustom(String custom) {
        this.custom = custom;
        return this;
    }

    public TooltipBuilder withFillSeriesColor(Boolean fillSeriesColor) {
        this.fillSeriesColor = fillSeriesColor;
        return this;
    }

    public TooltipBuilder withTheme(String theme) {
        this.theme = theme;
        return this;
    }

    public TooltipBuilder withStyle(Style style) {
        this.style = style;
        return this;
    }

    public Tooltip build() {
        Tooltip tooltip = new Tooltip();
        tooltip.setEnabled(enabled);
        tooltip.setShared(shared);
        tooltip.setFollowCursor(followCursor);
        tooltip.setIntersect(intersect);
        tooltip.setInverseOrder(inverseOrder);
        tooltip.setOnDatasetHover(onDatasetHover);
        tooltip.setX(x);
        tooltip.setY(y);
        tooltip.setZ(z);
        tooltip.setMarker(marker);
        tooltip.setItems(items);
        tooltip.setFixed(fixed);
        tooltip.setCustom(custom);
        tooltip.setFillSeriesColor(fillSeriesColor);
        tooltip.setTheme(theme);
        tooltip.setStyle(style);
        return tooltip;
    }
}
