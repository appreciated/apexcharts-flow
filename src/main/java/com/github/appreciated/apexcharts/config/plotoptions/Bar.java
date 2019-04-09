package com.github.appreciated.apexcharts.config.plotoptions;

public class Bar {
    Boolean horizontal;
    String columnWidth;
    String barHeight;
    Boolean distributed;
    Colors colors;
    DataLabels dataLabels;

    class Colors {
        Colors.Ranges ranges;
        String[] backgroundBarColors;
        Number backgroundBarOpacity;

        class Ranges {
            Number from;
            Number to;
            String color;
        }
    }

    class DataLabels {
        String position;
    }
}
