package com.github.appreciated.apexcharts.config.chart.builder;

import com.github.appreciated.apexcharts.config.chart.DropShadow;

public class DropShadowBuilder {
    private Boolean enabled;
    private Double top;
    private Double left;
    private Double blur;
    private Double opacity;

    private DropShadowBuilder() {
    }

    public static DropShadowBuilder get() {
        return new DropShadowBuilder();
    }

    public DropShadowBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public DropShadowBuilder withTop(Double top) {
        this.top = top;
        return this;
    }

    public DropShadowBuilder withLeft(Double left) {
        this.left = left;
        return this;
    }

    public DropShadowBuilder withBlur(Double blur) {
        this.blur = blur;
        return this;
    }

    public DropShadowBuilder withOpacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    public DropShadow build() {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setEnabled(enabled);
        dropShadow.setTop(top);
        dropShadow.setLeft(left);
        dropShadow.setBlur(blur);
        dropShadow.setOpacity(opacity);
        return dropShadow;
    }
}
