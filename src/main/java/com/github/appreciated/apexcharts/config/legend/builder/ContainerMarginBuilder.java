package com.github.appreciated.apexcharts.config.legend.builder;

import com.github.appreciated.apexcharts.config.legend.ContainerMargin;

public class ContainerMarginBuilder {
    private Double left;
    private Double top;

    private ContainerMarginBuilder() {
    }

    public static ContainerMarginBuilder get() {
        return new ContainerMarginBuilder();
    }

    public ContainerMarginBuilder withLeft(Double left) {
        this.left = left;
        return this;
    }

    public ContainerMarginBuilder withTop(Double top) {
        this.top = top;
        return this;
    }

    public ContainerMargin build() {
        ContainerMargin containerMargin = new ContainerMargin();
        containerMargin.setLeft(left);
        containerMargin.setTop(top);
        return containerMargin;
    }
}
