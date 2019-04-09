package com.github.appreciated.apexcharts.config.chart;

public class ApexTooltip {
    Boolean enabled;
    Boolean shared;
    Boolean followCursor;
    Boolean intersect;
    Boolean inverseOrder;
    OnDatasetHover onDatasetHover;
    X x;
    Y y;
    Z z;
    Marker marker;
    Items items;
    Fixed fixed;

    String custom; // TODO
    Boolean fillSeriesColor;
    String theme;
    Style style;

    class Style {
        String fontSize;
        String fontFamily;
    }

    class OnDatasetHover {
        Boolean highlightDAtaSeries;
    }

    class X {
        Boolean show;
        String format;

        String formatter;
    }

    class Y {
        String formatter;
        Title title;

        class Title {
            String formatter;
        }
    }

    class Z {
        String formatter;
        String title;
    }

    class Marker {
        Boolean show;
    }

    class Items {
        String display;
    }

    class Fixed {
        Boolean enabled;
        String position;
        double offsetX;
        double offsetY;
    }
}
