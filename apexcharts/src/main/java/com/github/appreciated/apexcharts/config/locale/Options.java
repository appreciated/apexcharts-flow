package com.github.appreciated.apexcharts.config.locale;

import java.util.List;

public class Options {
    private List<String> months;
    private List<String> shortMonths;
    private List<String> days;
    private List<String> shortDays;
    private Toolbar toolbar;


    public Options() {
    }

    public List<String> getMonths() {
        return months;
    }

    public List<String> getShortMonths() {
        return shortMonths;
    }

    public List<String> getDays() {
        return days;
    }

    public List<String> getShortDays() {
        return shortDays;
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    public void setMonths(List<String> months) {
        this.months = months;
    }

    public void setShortMonths(List<String> shortMonths) {
        this.shortMonths = shortMonths;
    }

    public void setDays(List<String> days) {
        this.days = days;
    }

    public void setShortDays(List<String> shortDays) {
        this.shortDays = shortDays;
    }

    public void setToolbar(Toolbar toolbar) {
        this.toolbar = toolbar;
    }

}
