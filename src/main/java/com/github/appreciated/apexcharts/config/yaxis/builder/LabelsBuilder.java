package com.github.appreciated.apexcharts.config.yaxis.builder;

import com.github.appreciated.apexcharts.config.yaxis.Align;
import com.github.appreciated.apexcharts.config.yaxis.Labels;
import com.github.appreciated.apexcharts.config.yaxis.labels.Style;
import com.github.appreciated.apexcharts.helper.Formatter;

public class LabelsBuilder {
    private Boolean show;
    private Double minWidth;
    private Double maxWidth;
    private Double offsetX;
    private Double offsetY;
    private Double rotate;
    private Align align;
    private Double padding;
    private Style style;
    private String formatter;

    private LabelsBuilder() {
    }

    public static LabelsBuilder get() {
        return new LabelsBuilder();
    }

    public LabelsBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public LabelsBuilder withMinWidth(Double minWidth) {
        this.minWidth = minWidth;
        return this;
    }

    public LabelsBuilder withMaxWidth(Double maxWidth) {
        this.maxWidth = maxWidth;
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

    public LabelsBuilder withRotate(Double rotate) {
        this.rotate = rotate;
        return this;
    }

    public LabelsBuilder withAlign(Align align) {
        this.align = align;
        return this;
    }

    public LabelsBuilder withPadding(Double padding) {
        this.padding = padding;
        return this;
    }

    public LabelsBuilder withStyle(Style style) {
        this.style = style;
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

    public Labels build() {
        Labels labels = new Labels();
        labels.setShow(show);
        labels.setMinWidth(minWidth);
        labels.setMaxWidth(maxWidth);
        labels.setOffsetX(offsetX);
        labels.setOffsetY(offsetY);
        labels.setRotate(rotate);
        labels.setAlign(align);
        labels.setPadding(padding);
        labels.setStyle(style);
        labels.setFormatter(formatter);
        return labels;
    }
}
