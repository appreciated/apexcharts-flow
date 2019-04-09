package com.github.appreciated.apexcharts.config.chart;

public class ApexFill {
    String[] colors;
    double opacity;
    String type;
    Gradient gradient;
    Image image;
    Pattern pattern;

    class Gradient {
        String shade;
        String type;
        double shadeIntensity;
        String[] gradientToColors;
        Boolean inverseColors;
        double opacityFrom;
        double opacityTo;
        double[] stops;
    }

    class Image {
        String[] src;
        double width;
        double height;
    }

    class Pattern {
        String style;
        double width;
        double height;
        double strokeWidth;
    }
}
