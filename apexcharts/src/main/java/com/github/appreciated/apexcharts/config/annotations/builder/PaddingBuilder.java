package com.github.appreciated.apexcharts.config.annotations.builder;

import com.github.appreciated.apexcharts.config.annotations.Padding;

public class PaddingBuilder {
    private Double left;
    private Double right;
    private Double top;
    private Double bottom;

    private PaddingBuilder() {
    }

    public static PaddingBuilder get() {
        return new PaddingBuilder();
    }

    public PaddingBuilder withLeft(Double left) {
        this.left = left;
        return this;
    }

    public PaddingBuilder withRight(Double right) {
        this.right = right;
        return this;
    }

    public PaddingBuilder withTop(Double top) {
        this.top = top;
        return this;
    }

    public PaddingBuilder withBottom(Double bottom) {
        this.bottom = bottom;
        return this;
    }

    public Padding build() {
        Padding padding = new Padding();
        padding.setLeft(left);
        padding.setRight(right);
        padding.setTop(top);
        padding.setBottom(bottom);
        return padding;
    }
}
