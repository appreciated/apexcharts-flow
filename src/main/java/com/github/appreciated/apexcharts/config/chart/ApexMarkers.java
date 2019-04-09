package com.github.appreciated.apexcharts.config.chart;

public class ApexMarkers {
    double size;
    String[] colors;
    String strokeColor;
    double strokeWidth;
    double strokeOpacity;
    double fillOpacity;
    ApexDiscretePoint[] discrete;
    Shape shape;
    enum Shape {
        circle("circle"),
        square("square");
        private String name;
        Shape(String name){
            this.name = name;
        }
    }
    double radius;
    double offsetX;
    double offsetY;
    Hover hover;
    class Hover {
        double size;
        double sizeOffset;
    }
}
