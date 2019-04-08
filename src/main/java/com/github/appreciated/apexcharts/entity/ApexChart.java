package com.github.appreciated.apexcharts.entity;

import com.github.appreciated.apexcharts.entity.animations.Animations;
import com.github.appreciated.apexcharts.entity.toolbar.Toolbar;
import com.github.appreciated.apexcharts.entity.zoom.Zoom;

class ApexChart {
    String width;
    String height;
    Type type;
    String foreColor;
    String fontFamily;
    String background;
    Number offsetX;
    Number offsetY;
    DropShadow dropShadow;
    Brush brush;
    String id;
    //ApexLocale[] locales;
    String defaultLocale;
    Sparkline sparkline;
    Boolean stacked;
    StackType stackType;
    Toolbar toolbar;
    Zoom zoom;
    Selection selection;
    Animations animations;

    enum Type {
        line("line"),
        area("area"),
        bar("bar"),
        histogram("histogram"),
        pie("pie"),
        donut("donut"),
        radialBar("radialBar"),
        scatter("scatter"),
        bubble("bubble"),
        heatmap("heatmap"),
        candlestick("candlestick"),
        radar("radar");
        private String name;

        Type(String name) {
            this.name = name;
        }
    }

    enum StackType {
        normal("normal"),
        full("100%");
        private String name;

        StackType(String name) {
            this.name = name;
        }
    }

    class DropShadow {
        Boolean enabled;
        Number top;
        Number left;
        Number blur;
        Number opacity;
    }

    class Brush {
        Boolean enabled;
        Boolean autoScaleYaxis;
        String target;
    }

    class Sparkline {
        Boolean enabled;
    }

    class Selection {
        Boolean enabled;
        String type;
        Fill fill;
        Stroke stroke;
        Xaxis xaxis;
        Yaxis yaxis;

        class Fill {
            String color;
            Number opacity;
        }

        class Stroke {
            Number width;
            String color;
            Number opacity;
            Number dashArray;
        }

        class Xaxis {
            Number min;
            Number max;
        }

        class Yaxis {
            Number min;
            Number max;
        }
    }
}

