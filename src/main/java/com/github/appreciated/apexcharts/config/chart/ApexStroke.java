package com.github.appreciated.apexcharts.config.chart;

public class ApexStroke {
    Boolean show;
    Curve curve;
    LineCap lineCap;
    String colors;
    Number width;
    Number[] dashArray;
    enum Curve {
        smooth("smooth"),
        straight("straight"),
        stepline("stepline");
        private String name;

        Curve(String name) {
            this.name = name;
        }
    }
    enum LineCap {
        butt("butt"),
        square("square"),
        round("round");
        private String name;

        LineCap(String name) {
            this.name = name;
        }
    }
}
