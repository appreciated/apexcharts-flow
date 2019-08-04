package com.github.appreciated.apexcharts.config.xaxis;

import com.github.appreciated.apexcharts.config.xaxis.labels.DatetimeFormatter;
import com.github.appreciated.apexcharts.config.xaxis.labels.Style;

public class Labels {
    private Boolean show;
    private Double rotate;
    private Boolean rotateAlways;
    private Boolean hideOverlappingLabels;
    private Boolean showDuplicates;
    private Boolean trim;
    private Double minHeight;
    private Double maxHeight;
    private Style style;
    private Double offsetX;
    private Double offsetY;
    private String format;

    private String formatter;
    private DatetimeFormatter datetimeFormatter;


    public Labels() {
    }

    public Boolean getShow() {
        return show;
    }

    public Double getRotate() {
        return rotate;
    }

    public Boolean getRotateAlways() {
        return rotateAlways;
    }

    public Boolean getHideOverlappingLabels() {
        return hideOverlappingLabels;
    }

    public Boolean getShowDuplicates() {
        return showDuplicates;
    }

    public Boolean getTrim() {
        return trim;
    }

    public Double getMinHeight() {
        return minHeight;
    }

    public Double getMaxHeight() {
        return maxHeight;
    }

    public Style getStyle() {
        return style;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public String getFormat() {
        return format;
    }

    public String getFormatter() {
        return formatter;
    }

    public DatetimeFormatter getDatetimeFormatter() {
        return datetimeFormatter;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setRotate(Double rotate) {
        this.rotate = rotate;
    }

    public void setRotateAlways(Boolean rotateAlways) {
        this.rotateAlways = rotateAlways;
    }

    public void setHideOverlappingLabels(Boolean hideOverlappingLabels) {
        this.hideOverlappingLabels = hideOverlappingLabels;
    }

    public void setShowDuplicates(Boolean showDuplicates) {
        this.showDuplicates = showDuplicates;
    }

    public void setTrim(Boolean trim) {
        this.trim = trim;
    }

    public void setMinHeight(Double minHeight) {
        this.minHeight = minHeight;
    }

    public void setMaxHeight(Double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public void setDatetimeFormatter(DatetimeFormatter datetimeFormatter) {
        this.datetimeFormatter = datetimeFormatter;
    }

}
