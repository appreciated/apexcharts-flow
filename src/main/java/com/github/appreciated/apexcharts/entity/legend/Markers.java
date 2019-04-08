package com.github.appreciated.apexcharts.entity.legend;

class Markers {
    Number width;
    Number height;
    String strokeColor;
    Number strokeWidth;
    Number offsetX;
    Number offsetY;
    Number radius;
    Shape shape;
    String customHTML;

    enum Shape {
        circle("circle"),
                square("square");
        private String name;

        Shape(String name) {
            this.name = name;
        }
    }
}
