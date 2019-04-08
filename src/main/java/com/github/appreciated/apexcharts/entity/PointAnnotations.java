package com.github.appreciated.apexcharts.entity;

class PointAnnotations {
    Number x;
    Number y;
    Number yAxisIndex;
    Number seriesIndex;
    Marker marker;
    AnnotationLabel label;

    class Marker {
        Number size;
        String fillColor;
        String strokeColor;
        Number strokeWidth;
        String shape;
        Number offsetX;
        Number offsetY;
        Number radius;
        String cssClass;
    }
}
