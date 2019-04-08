package com.github.appreciated.apexcharts.entity.plotoptions;

class Radar {
    Number size;
    Number offsetX;
    Number offsetY;
    Polygons polygons;

    class Polygons {
        String[] strokeColor;
        String[] connectorColors;
        Polygons.Fill fill;
        class Fill {
            String[] colors;
        }
    }
}
