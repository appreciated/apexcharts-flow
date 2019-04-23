package com.github.appreciated.apexcharts.config.plotoptions.candlestick.builder;

import com.github.appreciated.apexcharts.config.plotoptions.candlestick.Colors;

public class ColorsBuilder {
    private String upward;
    private String downward;

    private ColorsBuilder() {
    }

    public static ColorsBuilder get() {
        return new ColorsBuilder();
    }

    public ColorsBuilder withUpward(String upward) {
        this.upward = upward;
        return this;
    }

    public ColorsBuilder withDownward(String downward) {
        this.downward = downward;
        return this;
    }

    public Colors build() {
        Colors colors = new Colors();
        colors.setUpward(upward);
        colors.setDownward(downward);
        return colors;
    }
}
