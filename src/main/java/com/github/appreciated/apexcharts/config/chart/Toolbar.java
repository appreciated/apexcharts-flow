package com.github.appreciated.apexcharts.config.chart;

import com.github.appreciated.apexcharts.config.chart.toolbar.AutoSelected;
import com.github.appreciated.apexcharts.config.chart.toolbar.Export;
import com.github.appreciated.apexcharts.config.chart.toolbar.Tools;

public class Toolbar {
    private Boolean show;
    private Tools tools;
    private Export export;
    private AutoSelected autoSelected;


    public Toolbar() {
    }

    public Boolean getShow() {
        return show;
    }

    public Tools getTools() {
        return tools;
    }

    public Export getExport() {
        return export;
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

    public void setExport(Export export) {
        this.export = export;
    }

    public void setAutoSelected(AutoSelected autoSelected) {
        this.autoSelected = autoSelected;
    }

}
