package com.github.appreciated.apexcharts.entity.yaxis;

class ApexYAxis {
    Boolean show;
    Boolean showAlways;
    String seriesName;
    Boolean opposite;
    Boolean logarithmic;
    Number tickAmount;
    Boolean forceNiceScale;
    Number min;
    Number max;
    Boolean floating;
    Number decimalsInFloat;
    Labels labels;
    AxisBorder axisBorder;
    AxisTicks axisTicks;
    Title title;
    Crosshairs crosshairs;
    Tooltip tooltip;

    class AxisBorder {
        Boolean show;
        String color;
        Number offsetX;
        Number offsetY;
    }

    class AxisTicks {
        Boolean show;
        String color;
        Number width;
        Number offsetX;
        Number offsetY;
    }

    class Title {
        String text;
        Number rotate;
        Number offsetX;
        Number offsetY;
        Style style;

        class Style {
            String color;
            String fontSize;
            String fontFamily;
            String cssClass;
        }
    }

    class Crosshairs {
        Boolean show;
        String position;
        Stroke stroke;

        class Stroke {
            String color;
            Number width;
            Number dashArray;
        }
    }

    class Tooltip {
        Boolean enabled;
        Number offsetX;
    }
}
