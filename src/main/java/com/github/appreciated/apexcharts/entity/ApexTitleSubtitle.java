package com.github.appreciated.apexcharts.entity;

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
    Number margin;
    Number offsetX;
    Number offsetY;
    Number floating;
    Style style;
    class Style {
        String fontSize;
        String color;
    }
}