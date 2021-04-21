package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.theme.Mode;
import com.github.appreciated.apexcharts.config.theme.Monochrome;

public class Theme {
    private Mode mode;
    private String palette;
    private Monochrome monochrome;


    public Theme() {
    }

    public Mode getMode() {
        return mode;
    }

    public String getPalette() {
        return palette;
    }

    public Monochrome getMonochrome() {
        return monochrome;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setPalette(String palette) {
        this.palette = palette;
    }

    public void setMonochrome(Monochrome monochrome) {
        this.monochrome = monochrome;
    }

}
