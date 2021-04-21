package com.github.appreciated.apexcharts.config.tooltip;

import com.github.appreciated.apexcharts.config.tooltip.y.Title;

public class Y {
    private String formatter;
    private Title title;

    public Y() {
    }

    public String getFormatter() {
        return formatter;
    }

    public Title getTitle() {
        return title;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

}
