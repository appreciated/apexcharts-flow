package com.github.appreciated.apexcharts.config.chart;

import com.github.appreciated.apexcharts.config.chart.datalables.DropShadow;
import com.github.appreciated.apexcharts.config.chart.datalables.Style;
import com.github.appreciated.apexcharts.config.chart.datalables.TextAnchor;

public class ApexDataLabels {
    Boolean enabled;
    double[] enabledOnSeries;
    String formatter;
    TextAnchor textAnchor;
    double offsetX;
    double offsetY;
    Style style;
    DropShadow dropShadow;


    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public double[] getEnabledOnSeries() {
        return enabledOnSeries;
    }

    public void setEnabledOnSeries(double[] enabledOnSeries) {
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
