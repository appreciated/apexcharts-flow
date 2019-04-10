package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.datalables.DropShadow;
import com.github.appreciated.apexcharts.config.datalables.Style;
import com.github.appreciated.apexcharts.config.datalables.TextAnchor;

import java.util.List;

public class DataLabels {
    Boolean enabled;
    List<Double> enabledOnSeries;
    String formatter;
    TextAnchor textAnchor;
    Double offsetX;
    Double offsetY;
    Style style;
    DropShadow dropShadow;


    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Double> getEnabledOnSeries() {
        return enabledOnSeries;
    }

    public void setEnabledOnSeries(List<Double> enabledOnSeries) {
        this.enabledOnSeries = enabledOnSeries;
    }

    public String getFormatter() {
        return formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public TextAnchor getTextAnchor() {
        return textAnchor;
    }

    public void setTextAnchor(TextAnchor textAnchor) {
        this.textAnchor = textAnchor;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public DropShadow getDropShadow() {
        return dropShadow;
    }

    public void setDropShadow(DropShadow dropShadow) {
        this.dropShadow = dropShadow;
    }
}
