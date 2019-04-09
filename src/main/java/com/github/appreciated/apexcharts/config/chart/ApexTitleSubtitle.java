package com.github.appreciated.apexcharts.config.chart;

public class ApexTitleSubtitle {
    String text;
    Align align;
    enum Align {
        left("left"),
        center("center"),
        right("right");
        private String name;
        Align(String name){
            this.name = name;
        }
    }
    double margin;
    double offsetX;
    double offsetY;
    double floating;
    Style style;
    class Style {
        String fontSize;
        String color;
    }
}