package com.github.appreciated.apexcharts.config.plotoptions;

public class Pie {
    Number size;
    Number customScale;
    Number offsetX;
    Number offsetY;
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
                Number offsetY;
            }

            class Value {
                Boolean show;
                String fontSize;
                String fontFamily;
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
}
