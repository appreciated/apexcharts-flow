package com.github.appreciated.apexcharts.entity;

class ApexGrid {
    Boolean show;
    String borderColor;
    Number strokeDashArray;
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
            Number offsetX;
            Number offsetY;
        }
    }

    class Yaxis {
        Lines lines;

        class Lines {
            Boolean show;
            Number offsetX;
            Number offsetY;
        }
    }

    class Row {
        String[] colors;
        Number opacity;
    }

    class Column {
        String[] colors;
        Number opacity;
    }

    class Padding {
        Number top;
        Number right;
        Number bottom;
        Number left;
    }
}
