package com.github.appreciated.apexcharts.entity.theme;

class Monochrome {
    Boolean enabled;
    String color;
    ShadeTo shadeTo;
    Number shadeIntensity;

    enum ShadeTo {
        light("light"),
        dark("dark");
        private String name;

        ShadeTo(String name) {
            this.name = name;
        }
    }
}
