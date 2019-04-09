package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.theme.Mode;
import com.github.appreciated.apexcharts.config.theme.Monochrome;

public class ApexTheme {
    Mode mode;
    String palette;
    Monochrome monochrome;

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public String getPalette() {
        return palette;
    }

    public void setPalette(String palette) {
        this.palette = palette;
    }

    public Monochrome getMonochrome() {
        return monochrome;
    }

    public void setMonochrome(Monochrome monochrome) {
        this.monochrome = monochrome;
    }
}
