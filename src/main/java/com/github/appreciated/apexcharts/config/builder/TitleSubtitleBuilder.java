package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.TitleSubtitle;
import com.github.appreciated.apexcharts.config.subtitle.Align;
import com.github.appreciated.apexcharts.config.subtitle.Style;

public class TitleSubtitleBuilder {
    private String text;
    private Align align;
    private double margin;
    private double offsetX;
    private double offsetY;
    private double floating;
    private Style style;

    private TitleSubtitleBuilder() {
    }

    public static TitleSubtitleBuilder get() {
        return new TitleSubtitleBuilder();
    }

    public TitleSubtitleBuilder withText(String text) {
        this.text = text;
        return this;
    }

    public TitleSubtitleBuilder withAlign(Align align) {
        this.align = align;
        return this;
    }

    public TitleSubtitleBuilder withMargin(double margin) {
        this.margin = margin;
        return this;
    }

    public TitleSubtitleBuilder withOffsetX(double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public TitleSubtitleBuilder withOffsetY(double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public TitleSubtitleBuilder withFloating(double floating) {
        this.floating = floating;
        return this;
    }

    public TitleSubtitleBuilder withStyle(Style style) {
        this.style = style;
        return this;
    }

    public TitleSubtitle build() {
        TitleSubtitle titleSubtitle = new TitleSubtitle();
        titleSubtitle.setText(text);
        titleSubtitle.setAlign(align);
        titleSubtitle.setMargin(margin);
        titleSubtitle.setOffsetX(offsetX);
        titleSubtitle.setOffsetY(offsetY);
        titleSubtitle.setFloating(floating);
        titleSubtitle.setStyle(style);
        return titleSubtitle;
    }
}
