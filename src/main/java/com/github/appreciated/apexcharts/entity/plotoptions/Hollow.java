package com.github.appreciated.apexcharts.entity.plotoptions;

class Hollow {
    Number margin;
    String size;
    String background;
    String image;
    Number width;
    Number height;
    Number offsetX;
    Number offsetY;
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
