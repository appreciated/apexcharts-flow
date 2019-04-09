package com.github.appreciated.apexcharts.config;

import java.util.List;

class ApexLocale {
    String name;
    Options options;

    class Options {
        List<String> months;
        List<String> shortMonths;
        List<String> days;
        List<String> shortDays;
        Toolbar toolbar;

        class Toolbar {
            String download;
            String selection;
            String selectionZoom;
            String zoomIn;
            String zoomOut;
            String pan;
            String reset;
        }
    }
}
