package com.github.appreciated.apexcharts.config.chart.legend;

public class Markers {
    double width;
    double height;
    String strokeColor;
    double strokeWidth;
    double offsetX;
    double offsetY;
    double radius;
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
