package com.github.appreciated.apexcharts.config.xaxis;

public class Crosshairs {
    Boolean show;
    String width;
    String position;
    double opacity;
    Stroke stroke;
    Fill fill;
    DropShadow dropShadow;

    class Stroke {
        String color;
        double width;
        double dashArray;
    }

    class Fill {
        String type;
        String color;
        Fill.Gradient gradient;

        class Gradient {
            String colorFrom;
            String colorTo;
            double[] stops;
            double opacityFrom;
            double opacityTo;
        }
    }

    class DropShadow {
        Boolean enabled;
        double top;
        double left;
        double blur;
        double opacity;
    }
}
