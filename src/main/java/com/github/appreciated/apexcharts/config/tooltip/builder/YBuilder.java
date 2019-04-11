package com.github.appreciated.apexcharts.config.tooltip.builder;

import com.github.appreciated.apexcharts.config.tooltip.Y;
import com.github.appreciated.apexcharts.config.tooltip.y.Title;

public class YBuilder {
    private String formatter;
    private Title title;

    private YBuilder() {
    }

    public static YBuilder get() {
        return new YBuilder();
    }

    public YBuilder withFormatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public YBuilder withTitle(Title title) {
        this.title = title;
        return this;
    }

    public Y build() {
        Y y = new Y();
        y.setFormatter(formatter);
        y.setTitle(title);
        return y;
    }
}
