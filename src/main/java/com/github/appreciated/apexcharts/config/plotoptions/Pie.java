package com.github.appreciated.apexcharts.config.plotoptions;

public class Pie {
    double size;
    double customScale;
    double offsetX;
    double offsetY;
    Boolean expandOnClick;
    DataLabels dataLabels;
    Donut donut;

    class Donut {
        String size;
        String background;
        Donut.Labels labels;

        class Labels {
            Boolean show;
            Donut.Labels.Name name;
            Donut.Labels.Value value;
            Donut.Labels.Total total;

            class Name {
                Boolean show;
                String fontSize;
                String fontFamily;
                String color;
                double offsetY;
            }

            class Value {
                Boolean show;
                String fontSize;
                String fontFamily;
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
}
