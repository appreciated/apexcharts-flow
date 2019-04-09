package com.github.appreciated.apexcharts.config.plotoptions;

class Hollow {
    double margin;
    String size;
    String background;
    String image;
    double width;
    double height;
    double offsetX;
    double offsetY;
    Boolean clipped;
    Position position;

    enum Position {
        front("front"),
        back("back");
        private String name;

        Position(String name) {
            this.name = name;
        }
    }
}
