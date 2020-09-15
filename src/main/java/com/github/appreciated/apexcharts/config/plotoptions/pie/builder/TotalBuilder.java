package com.github.appreciated.apexcharts.config.plotoptions.pie.builder;

import com.github.appreciated.apexcharts.config.plotoptions.pie.Total;
import com.github.appreciated.apexcharts.helper.Formatter;

public class TotalBuilder {
    private Boolean show;
    private String label;
    private String color;
    private String formatter;

    private TotalBuilder() {
    }

    public static TotalBuilder get() {
        return new TotalBuilder();
    }

    public TotalBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public TotalBuilder withLabel(String label) {
        this.label = label;
        return this;
    }

    public TotalBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public TotalBuilder withFormatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public TotalBuilder withFormatter(Formatter formatter) {
        this.formatter = formatter.getString();
        return this;
    }

    public Total build() {
        Total total = new Total();
        total.setShow(show);
        total.setLabel(label);
        total.setColor(color);
        total.setFormatter(formatter);
        return total;
    }
}
