package com.github.appreciated.apexcharts.config.chart.chart;

public class Selection {
    Boolean enabled;
    String type;
    Fill fill;
    Stroke stroke;
    Xaxis xaxis;
    Yaxis yaxis;

    class Fill {
        String color;
        double opacity;
    }

    class Stroke {
        double width;
        String color;
        double opacity;
        double dashArray;
    }

    class Xaxis {
        double min;
        double max;
    }

    class Yaxis {
        double min;
        double max;
    }
}
