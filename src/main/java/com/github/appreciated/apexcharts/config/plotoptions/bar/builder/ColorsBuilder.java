package com.github.appreciated.apexcharts.config.plotoptions.bar.builder;

import com.github.appreciated.apexcharts.config.plotoptions.bar.Colors;
import com.github.appreciated.apexcharts.config.plotoptions.bar.Ranges;

import java.util.Arrays;
import java.util.List;

public class ColorsBuilder {
    private List<Ranges> ranges;
    private List<String> backgroundBarColors;
    private Double backgroundBarOpacity;
    private Double backgroundBarRadius;

    private ColorsBuilder() {
    }

    public static ColorsBuilder get() {
        return new ColorsBuilder();
    }

    public ColorsBuilder withRanges(List<Ranges> ranges) {
        this.ranges = ranges;
        return this;
    }

    public ColorsBuilder withRanges(Ranges... ranges) {
        this.ranges = Arrays.asList(ranges);
        return this;
    }

    public ColorsBuilder withBackgroundBarColors(String... backgroundBarColors) {
        this.backgroundBarColors = Arrays.asList(backgroundBarColors);
        return this;
    }

    public ColorsBuilder withBackgroundBarOpacity(Double backgroundBarOpacity) {
        this.backgroundBarOpacity = backgroundBarOpacity;
        return this;
    }

    public ColorsBuilder withBackgroundBarRadius(Double backgroundBarRadius) {
        this.backgroundBarRadius = backgroundBarRadius;
        return this;
    }

    public Colors build() {
        Colors colors = new Colors();
        colors.setRanges(ranges);
        colors.setBackgroundBarColors(backgroundBarColors);
        colors.setBackgroundBarOpacity(backgroundBarOpacity);
        colors.setBackgroundBarRadius(backgroundBarRadius);
        return colors;
    }
}
