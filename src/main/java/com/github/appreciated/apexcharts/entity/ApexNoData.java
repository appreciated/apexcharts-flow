package com.github.appreciated.apexcharts.entity;

class ApexNoData {
    String text;
    Align align;
    enum Align {
        left("left"),
        right("right"),
        center("center");
        private String name;
        Align(String name){
            this.name = name;
        }
    }
    VerticalAlign verticalAlign;
    enum VerticalAlign {
        top("top"),
        middle("middle"),
        bottom("bottom");
        private String name;
        VerticalAlign(String name){
            this.name = name;
        }
    }
    Number offsetX;
    Number offsetY;
    Style style;
    class Style {
        String color;
        String fontSize;
        String fontFamily;
    }
}
