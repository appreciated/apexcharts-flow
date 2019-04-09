package com.github.appreciated.apexcharts.config.chart;

class XAxisAnnotations {
    double x;
    double x2;
    double strokeDashArray;
    String fillColor;
    String borderColor;
    double opacity;
    double offsetX;
    double offsetY;
    Label label;

    class Label {
        String borderColor;
        double borderWidth;
        String text;
        String textAnchor;
        String position;
        String orientation;
        double offsetX;
        double offsetY;
        AnnotationStyle style;
    }
}
