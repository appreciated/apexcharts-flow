package com.github.appreciated.apexcharts.config;

public class ApexDataLabels {
    Boolean enabled;
    double[] enabledOnSeries;
    String formatter;
    TextAnchor textAnchor;
    double offsetX;
    double offsetY;
    Style style;
    DropShadow dropShadow;

    enum TextAnchor {
        start("start"),
        middle("middle"),
        end("end");
        private String name;

        TextAnchor(String name) {
            this.name = name;
        }
    }

    class Style {
        String fontSize;
        String fontFamily;
        String[] colors;
    }

    class DropShadow {
        Boolean enable;
        double top;
        double left;
        double blur;
        double opacity;
    }
}
