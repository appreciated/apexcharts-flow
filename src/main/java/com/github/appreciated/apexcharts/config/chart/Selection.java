package com.github.appreciated.apexcharts.config.chart;

public class Selection {
    Boolean enabled;
    String type;
    Fill fill;
    Stroke stroke;
    Xaxis xaxis;
    Yaxis yaxis;

    class Fill {
        String color;
        Double opacity;
    }

    class Stroke {
        Double width;
        String color;
        Double opacity;
        Double dashArray;
    }

    class Xaxis {
        Double min;
        Double max;
    }

    class Yaxis {
        Double min;
        Double max;
    }
}
