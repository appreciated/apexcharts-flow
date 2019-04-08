package com.github.appreciated.apexcharts.entity;

class ApexFill {
    String[] colors;
    Number opacity;
    String type;
    Gradient gradient;
    Image image;
    Pattern pattern;

    class Gradient {
        String shade;
        String type;
        Number shadeIntensity;
        String[] gradientToColors;
        Boolean inverseColors;
        Number opacityFrom;
        Number opacityTo;
        Number[] stops;
    }

    class Image {
        String[] src;
        Number width;
        Number height;
    }

    class Pattern {
        String style;
        Number width;
        Number height;
        Number strokeWidth;
    }
}
