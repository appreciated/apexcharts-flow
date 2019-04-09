package com.github.appreciated.apexcharts.config;

class XAxisAnnotations {
    Number x;
    Number x2;
    Number strokeDashArray;
    String fillColor;
    String borderColor;
    Number opacity;
    Number offsetX;
    Number offsetY;
    Label label;

    class Label {
        String borderColor;
        Number borderWidth;
        String text;
        String textAnchor;
        String position;
        String orientation;
        Number offsetX;
        Number offsetY;
        AnnotationStyle style;
    }
}
