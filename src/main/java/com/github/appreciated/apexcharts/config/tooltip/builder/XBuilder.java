package com.github.appreciated.apexcharts.config.tooltip.builder;

import com.github.appreciated.apexcharts.config.tooltip.X;
import com.github.appreciated.apexcharts.helper.Formatter;

public class XBuilder {
    private Boolean show;
    private String format;
    private String formatter;

    private XBuilder() {
    }

    public static XBuilder get() {
        return new XBuilder();
    }

    public XBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public XBuilder withFormat(String format) {
        this.format = format;
        return this;
    }

    public XBuilder withFormatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public XBuilder withFormatter(Formatter formatter) {
        this.formatter = formatter.getString();
        return this;
    }

    public X build() {
        X x = new X();
        x.setShow(show);
        x.setFormat(format);
        x.setFormatter(formatter);
        return x;
    }
}
