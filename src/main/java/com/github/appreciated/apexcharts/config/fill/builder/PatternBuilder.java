package com.github.appreciated.apexcharts.config.fill.builder;

import com.github.appreciated.apexcharts.config.fill.Pattern;

public class PatternBuilder {
    private String style;
    private Double width;
    private Double height;
    private Double strokeWidth;

    private PatternBuilder() {
    }

    public static PatternBuilder get() {
        return new PatternBuilder();
    }

    public PatternBuilder withStyle(String style) {
        this.style = style;
        return this;
    }

    public PatternBuilder withWidth(Double width) {
        this.width = width;
        return this;
    }

    public PatternBuilder withHeight(Double height) {
        this.height = height;
        return this;
    }

    public PatternBuilder withStrokeWidth(Double strokeWidth) {
        this.strokeWidth = strokeWidth;
        return this;
    }

    public Pattern build() {
        Pattern pattern = new Pattern();
        pattern.setStyle(style);
        pattern.setWidth(width);
        pattern.setHeight(height);
        pattern.setStrokeWidth(strokeWidth);
        return pattern;
    }
}
