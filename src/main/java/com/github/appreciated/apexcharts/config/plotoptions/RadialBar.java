package com.github.appreciated.apexcharts.config.plotoptions;

public class RadialBar {
    double size;
    Boolean inverseOrder;
    double startAngle;
    double endAngle;
    double offsetX;
    double offsetY;
    Hollow hollow;
    Track track;
    DataLabels dataLabels;

    class Track {
        Boolean show;
        double startAngle;
        double endAngle;
        String background;
        String strokeWidth;
        double opacity;
        double margin;
        Track.DropShadow dropShadow;

        class DropShadow {
            Boolean enabled;
            double top;
            double left;
            double blur;
            double opacity;
        }
    }

    class DataLabels {
        Boolean show;
        DataLabels.Name name;
        DataLabels.Value value;
        DataLabels.Total total;

        class Name {
            Boolean show;
            String fontSize;
            String color;
            double offsetY;
        }

        class Value {
            Boolean show;
            String fontSize;
            String color;
            double offsetY;
            String formatter;
        }

        class Total {
            Boolean show;
            String label;
            String color;
            String formatter;
        }
    }
}
