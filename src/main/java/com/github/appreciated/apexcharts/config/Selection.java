package com.github.appreciated.apexcharts.config;

public class Selection {
    Boolean enabled;
    String type;
    Fill fill;
    Stroke stroke;
    Xaxis xaxis;
    Yaxis yaxis;

    class Fill {
        String color;
        Number opacity;
    }

    class Stroke {
        Number width;
        String color;
        Number opacity;
        Number dashArray;
    }

    class Xaxis {
        Number min;
        Number max;
    }

    class Yaxis {
        Number min;
        Number max;
    }
}
