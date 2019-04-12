package com.github.appreciated.apexcharts.config.chart;

public class Selection {
    Boolean enabled;
    String type;
    Fill fill;
    Stroke stroke;
    Xaxis xaxis;
    Yaxis yaxis;

    public class Fill {
        String color;
        Double opacity;
    }

    public class Stroke {
        Double width;
        String color;
        Double opacity;
        Double dashArray;
    }

    public class Xaxis {
        Double min;
        Double max;
    }

    public class Yaxis {
        Double min;
        Double max;
    }
}
