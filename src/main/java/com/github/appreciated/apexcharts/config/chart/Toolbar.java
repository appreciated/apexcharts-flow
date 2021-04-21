package com.github.appreciated.apexcharts.config.chart;

import com.github.appreciated.apexcharts.config.chart.toolbar.AutoSelected;
import com.github.appreciated.apexcharts.config.chart.toolbar.Tools;

public class Toolbar {
    private Boolean show;
    private Tools tools;
    private AutoSelected autoSelected;


    public Toolbar() {
    }

    public Boolean getShow() {
        return show;
    }

    public Tools getTools() {
        return tools;
    }

    public AutoSelected getAutoSelected() {
        return autoSelected;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setTools(Tools tools) {
        this.tools = tools;
    }

    public void setAutoSelected(AutoSelected autoSelected) {
        this.autoSelected = autoSelected;
    }

}
