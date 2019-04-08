package com.github.appreciated.apexcharts.entity.theme;

class ApexTheme {
    Mode mode;
    String palette;
    Monochrome monochrome;

    enum Mode {
        light("light"),
        dark("dark");
        private String name;

        Mode(String name) {
            this.name = name;
        }
    }

}
