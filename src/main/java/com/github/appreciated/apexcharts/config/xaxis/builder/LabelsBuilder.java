package com.github.appreciated.apexcharts.config.xaxis.builder;

import com.github.appreciated.apexcharts.config.xaxis.Labels;
import com.github.appreciated.apexcharts.config.xaxis.labels.DatetimeFormatter;
import com.github.appreciated.apexcharts.config.xaxis.labels.Style;
import com.github.appreciated.apexcharts.helper.Formatter;

public class LabelsBuilder {
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
    private Boolean datetimeUTC;

    private LabelsBuilder() {
    }

    public static LabelsBuilder get() {
        return new LabelsBuilder();
    }

    public LabelsBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public LabelsBuilder withRotate(Double rotate) {
        this.rotate = rotate;
        return this;
    }

    public LabelsBuilder withRotateAlways(Boolean rotateAlways) {
        this.rotateAlways = rotateAlways;
        return this;
    }

    public LabelsBuilder withHideOverlappingLabels(Boolean hideOverlappingLabels) {
        this.hideOverlappingLabels = hideOverlappingLabels;
        return this;
    }

    public LabelsBuilder withShowDuplicates(Boolean showDuplicates) {
        this.showDuplicates = showDuplicates;
        return this;
    }

    public LabelsBuilder withTrim(Boolean trim) {
        this.trim = trim;
        return this;
    }

    public LabelsBuilder withMinHeight(Double minHeight) {
        this.minHeight = minHeight;
        return this;
    }

    public LabelsBuilder withMaxHeight(Double maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }

    public LabelsBuilder withStyle(Style style) {
        this.style = style;
        return this;
    }

    public LabelsBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public LabelsBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public LabelsBuilder withFormat(String format) {
        this.format = format;
        return this;
    }

    public LabelsBuilder withFormatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public LabelsBuilder withFormatter(Formatter formatter) {
        this.formatter = formatter.getString();
        return this;
    }

    public LabelsBuilder withDatetimeFormatter(DatetimeFormatter datetimeFormatter) {
        this.datetimeFormatter = datetimeFormatter;
        return this;
    }

    public LabelsBuilder withDatetimeUTC(Boolean datetimeUTC) {
        this.datetimeUTC = datetimeUTC;
        return this;
    }

    public Labels build() {
        Labels labels = new Labels();
        labels.setShow(show);
        labels.setRotate(rotate);
        labels.setRotateAlways(rotateAlways);
        labels.setHideOverlappingLabels(hideOverlappingLabels);
        labels.setShowDuplicates(showDuplicates);
        labels.setTrim(trim);
        labels.setMinHeight(minHeight);
        labels.setMaxHeight(maxHeight);
        labels.setStyle(style);
        labels.setOffsetX(offsetX);
        labels.setOffsetY(offsetY);
        labels.setFormat(format);
        labels.setFormatter(formatter);
        labels.setDatetimeFormatter(datetimeFormatter);
        labels.setDatetimeUTC(datetimeUTC);
        return labels;
    }
}
