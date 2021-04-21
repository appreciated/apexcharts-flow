package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.Theme;
import com.github.appreciated.apexcharts.config.theme.Mode;
import com.github.appreciated.apexcharts.config.theme.Monochrome;

public class ThemeBuilder {
    private Mode mode;
    private String palette;
    private Monochrome monochrome;

    private ThemeBuilder() {
    }

    public static ThemeBuilder get() {
        return new ThemeBuilder();
    }

    public ThemeBuilder withMode(Mode mode) {
        this.mode = mode;
        return this;
    }

    public ThemeBuilder withPalette(String palette) {
        this.palette = palette;
        return this;
    }

    public ThemeBuilder withMonochrome(Monochrome monochrome) {
        this.monochrome = monochrome;
        return this;
    }

    public Theme build() {
        Theme theme = new Theme();
        theme.setMode(mode);
        theme.setPalette(palette);
        theme.setMonochrome(monochrome);
        return theme;
    }
}
