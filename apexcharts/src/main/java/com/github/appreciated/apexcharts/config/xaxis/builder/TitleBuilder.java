package com.github.appreciated.apexcharts.config.xaxis.builder;

import com.github.appreciated.apexcharts.config.xaxis.Title;
import com.github.appreciated.apexcharts.config.xaxis.title.Style;

public class TitleBuilder {
    private String text;
    private Double offsetX;
    private Double offsetY;
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

    public TitleBuilder withOffsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public TitleBuilder withOffsetY(Double offsetY) {
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
        title.setOffsetX(offsetX);
        title.setOffsetY(offsetY);
        title.setStyle(style);
        return title;
    }
}
