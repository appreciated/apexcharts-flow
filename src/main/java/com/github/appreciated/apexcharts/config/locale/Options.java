package com.github.appreciated.apexcharts.config.locale;

import java.util.List;

public class Options {
    private List<String> months;
    private List<String> shortMonths;
    private List<String> days;
    private List<String> shortDays;
    private Toolbar toolbar;

    public List<String> getMonths() {
        return months;
    }

    public void setMonths(List<String> months) {
        this.months = months;
    }

    public List<String> getShortMonths() {
        return shortMonths;
    }

    public void setShortMonths(List<String> shortMonths) {
        this.shortMonths = shortMonths;
    }

    public List<String> getDays() {
        return days;
    }

    public void setDays(List<String> days) {
        this.days = days;
    }

    public List<String> getShortDays() {
        return shortDays;
    }

    public void setShortDays(List<String> shortDays) {
        this.shortDays = shortDays;
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    public void setToolbar(Toolbar toolbar) {
        this.toolbar = toolbar;
    }
}
