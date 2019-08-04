package com.github.appreciated.apexcharts.config.yaxis.builder;

import com.github.appreciated.apexcharts.config.yaxis.Title;
import com.github.appreciated.apexcharts.config.yaxis.title.Style;

public class TitleBuilder {
    private String text;
    private Number rotate;
    private Number offsetX;
    private Number offsetY;
    private Style style;

    private TitleBuilder() {
    }

    public static TitleBuilder get() {
        return new TitleBuilder();
    }

    public TitleBuilder withText(String text) {
        this.text = text;
        return this;
    }

    public TitleBuilder withRotate(Number rotate) {
        this.rotate = rotate;
        return this;
    }

    public TitleBuilder withOffsetX(Number offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public TitleBuilder withOffsetY(Number offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public TitleBuilder withStyle(Style style) {
        this.style = style;
        return this;
    }

    public Title build() {
        Title title = new Title();
        title.setText(text);
        title.setRotate(rotate);
        title.setOffsetX(offsetX);
        title.setOffsetY(offsetY);
        title.setStyle(style);
        return title;
    }
}
