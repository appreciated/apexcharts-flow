package com.github.appreciated.apexcharts.config.plotoptions;

public class RadialBar {
    Number size;
    Boolean inverseOrder;
    Number startAngle;
    Number endAngle;
    Number offsetX;
    Number offsetY;
    Hollow hollow;
    Track track;
    DataLabels dataLabels;

    class Track {
        Boolean show;
        Number startAngle;
        Number endAngle;
        String background;
        String strokeWidth;
        Number opacity;
        Number margin;
        Track.DropShadow dropShadow;

        class DropShadow {
            Boolean enabled;
            Number top;
            Number left;
            Number blur;
            Number opacity;
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
            Number offsetY;
        }

        class Value {
            Boolean show;
            String fontSize;
            String color;
            Number offsetY;
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
