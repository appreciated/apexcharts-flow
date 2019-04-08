package com.github.appreciated.apexcharts.entity.yaxis;

class Labels {
    Boolean show;
    Number minWidth;
    Number maxWidth;
    Number offsetX;
    Number offsetY;
    Number rotate;
    Align align;
    Number padding;
    Style style;
    String formatter;

    enum Align {
        left("left"),
        center("center"),
        right("right");
        private String name;

        Align(String name) {
            this.name = name;
        }
    }

    class Style {
        String color;
        String fontSize;
        String fontFamily;
        String cssClass;
    }
}
