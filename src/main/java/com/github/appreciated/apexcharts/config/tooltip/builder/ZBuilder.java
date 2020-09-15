package com.github.appreciated.apexcharts.config.tooltip.builder;

import com.github.appreciated.apexcharts.config.tooltip.Z;
import com.github.appreciated.apexcharts.helper.Formatter;

public class ZBuilder {
    private String formatter;
    private String title;

    private ZBuilder() {
    }

    public static ZBuilder get() {
        return new ZBuilder();
    }

    public ZBuilder withFormatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public ZBuilder withFormatter(Formatter formatter) {
        this.formatter = formatter.getString();
        return this;
    }

    public ZBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public Z build() {
        Z z = new Z();
        z.setFormatter(formatter);
        z.setTitle(title);
        return z;
    }
}
