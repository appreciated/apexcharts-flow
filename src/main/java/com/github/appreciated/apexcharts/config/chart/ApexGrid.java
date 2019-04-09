package com.github.appreciated.apexcharts.config.chart;

public class ApexGrid {
    Boolean show;
    String borderColor;
    double strokeDashArray;
    Position position;
    Xaxis xaxis;
    Yaxis yaxis;
    Row row;
    Column column;
    Padding padding;

    enum Position {
        front("front"),
        back("back");
        private String name;

        Position(String name) {
            this.name = name;
        }
    }

    class Xaxis {
        Lines lines;

        class Lines {
            Boolean show;
            double offsetX;
            double offsetY;
        }
    }

    class Yaxis {
        Lines lines;

        class Lines {
            Boolean show;
            double offsetX;
            double offsetY;
        }
    }

    class Row {
        String[] colors;
        double opacity;
    }

    class Column {
        String[] colors;
        double opacity;
    }

    class Padding {
        double top;
        double right;
        double bottom;
        double left;
    }
}
