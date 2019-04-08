package com.github.appreciated.apexcharts.entity;

class ApexLocale {
    String name;
    Options options;

    class Options {
        String[] months;
        String[] shortMonths;
        String[] days;
        String[] shortDays;
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
