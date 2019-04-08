package com.github.appreciated.apexcharts.entity;

class ApexDataLabels {
    Boolean enabled;
    Number[] enabledOnSeries;
    String formatter;
    TextAnchor textAnchor;
    Number offsetX;
    Number offsetY;
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
        Number top;
        Number left;
        Number blur;
        Number opacity;
    }
}
