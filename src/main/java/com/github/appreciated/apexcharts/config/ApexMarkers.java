package com.github.appreciated.apexcharts.config;

public class ApexMarkers {
    Number size;
    String[] colors;
    String strokeColor;
    Number strokeWidth;
    Number strokeOpacity;
    Number fillOpacity;
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
    Number radius;
    Number offsetX;
    Number offsetY;
    Hover hover;
    class Hover {
        Number size;
        Number sizeOffset;
    }
}
