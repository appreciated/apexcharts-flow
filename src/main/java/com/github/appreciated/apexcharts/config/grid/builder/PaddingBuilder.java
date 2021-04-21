package com.github.appreciated.apexcharts.config.grid.builder;

import com.github.appreciated.apexcharts.config.grid.Padding;

public class PaddingBuilder {
    private Double top;
    private Double right;
    private Double bottom;
    private Double left;

    private PaddingBuilder() {
    }

    public static PaddingBuilder get() {
        return new PaddingBuilder();
    }

    public PaddingBuilder withTop(Double top) {
        this.top = top;
        return this;
    }

    public PaddingBuilder withRight(Double right) {
        this.right = right;
        return this;
    }

    public PaddingBuilder withBottom(Double bottom) {
        this.bottom = bottom;
        return this;
    }

    public PaddingBuilder withLeft(Double left) {
        this.left = left;
        return this;
    }

    public Padding build() {
        Padding padding = new Padding();
        padding.setTop(top);
        padding.setRight(right);
        padding.setBottom(bottom);
        padding.setLeft(left);
        return padding;
    }
}
