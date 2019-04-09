package com.github.appreciated.apexcharts.config.plotoptions;

public class Radar {
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
