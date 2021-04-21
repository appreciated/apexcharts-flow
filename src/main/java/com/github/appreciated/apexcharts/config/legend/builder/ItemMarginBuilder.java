package com.github.appreciated.apexcharts.config.legend.builder;

import com.github.appreciated.apexcharts.config.legend.ItemMargin;

public class ItemMarginBuilder {
    private Double horizontal;
    private Double vertical;

    private ItemMarginBuilder() {
    }

    public static ItemMarginBuilder get() {
        return new ItemMarginBuilder();
    }

    public ItemMarginBuilder withHorizontal(Double horizontal) {
        this.horizontal = horizontal;
        return this;
    }

    public ItemMarginBuilder withVertical(Double vertical) {
        this.vertical = vertical;
        return this;
    }

    public ItemMargin build() {
        ItemMargin itemMargin = new ItemMargin();
        itemMargin.setHorizontal(horizontal);
        itemMargin.setVertical(vertical);
        return itemMargin;
    }
}
