package com.github.appreciated.apexcharts.config.locale.builder;

import com.github.appreciated.apexcharts.config.locale.Options;
import com.github.appreciated.apexcharts.config.locale.Toolbar;

import java.util.List;

public class OptionsBuilder {
    private List<String> months;
    private List<String> shortMonths;
    private List<String> days;
    private List<String> shortDays;
    private Toolbar toolbar;

    private OptionsBuilder() {
    }

    public static OptionsBuilder get() {
        return new OptionsBuilder();
    }

    public OptionsBuilder withMonths(List<String> months) {
        this.months = months;
        return this;
    }

    public OptionsBuilder withShortMonths(List<String> shortMonths) {
        this.shortMonths = shortMonths;
        return this;
    }

    public OptionsBuilder withDays(List<String> days) {
        this.days = days;
        return this;
    }

    public OptionsBuilder withShortDays(List<String> shortDays) {
        this.shortDays = shortDays;
        return this;
    }

    public OptionsBuilder withToolbar(Toolbar toolbar) {
        this.toolbar = toolbar;
        return this;
    }

    public Options build() {
        Options options = new Options();
        options.setMonths(months);
        options.setShortMonths(shortMonths);
        options.setDays(days);
        options.setShortDays(shortDays);
        options.setToolbar(toolbar);
        return options;
    }
}
