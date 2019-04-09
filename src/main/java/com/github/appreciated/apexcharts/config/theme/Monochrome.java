package com.github.appreciated.apexcharts.config.theme;

public class Monochrome {
    Boolean enabled;
    String color;
    ShadeTo shadeTo;
    double shadeIntensity;

    enum ShadeTo {
        light("light"),
        dark("dark");
        private String name;

        ShadeTo(String name) {
            this.name = name;
        }
    }
}
