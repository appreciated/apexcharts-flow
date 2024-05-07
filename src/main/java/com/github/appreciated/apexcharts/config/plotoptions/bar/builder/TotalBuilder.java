package com.github.appreciated.apexcharts.config.plotoptions.bar.builder;

import com.github.appreciated.apexcharts.config.plotoptions.bar.Style;
import com.github.appreciated.apexcharts.config.plotoptions.bar.Total;

public class TotalBuilder {

    private boolean enabled;
    private String formatter;
    private Double offsetX;
    private Double offsetY;
    private Style style;

    private TotalBuilder() {

    }

    public static TotalBuilder get() {
        return new TotalBuilder();
    }

    public TotalBuilder withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public TotalBuilder withFormatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public TotalBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public TotalBuilder withOffsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public TotalBuilder withStyle(Style style) {
        this.style = style;
        return this;
    }

    public Total build() {
        Total total = new Total();
        total.setEnabled(enabled);
        total.setFormatter(formatter);
        total.setOffsetX(offsetX);
        total.setOffsetY(offsetY);
        total.setStyle(style);
        return total;
    }
}
