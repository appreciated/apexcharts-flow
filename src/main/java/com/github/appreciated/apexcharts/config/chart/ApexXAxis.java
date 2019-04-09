package com.github.appreciated.apexcharts.config.chart;

public class ApexXAxis {
    Type type;
    double[] categories;
    String[] labels;
    AxisBorder axisBorder;
    AxisTicks axisTicks;
    double tickAmount;
    double min;
    double max;
    double range;
    Boolean floating;
    String position;
    Title title;
    Crosshairs crosshairs;
    Tooltip tooltip;

    enum Type {
        categories("categories"),
        datetime("datetime"),
        numeric("numeric");
        private String name;

        Type(String name) {
            this.name = name;
        }
    }

    class Labels {
        Boolean show;
        double rotate;
        Boolean rotateAlways;
        Boolean hideOverlappingLabels;
        Boolean showDuplicates;
        Boolean trim;
        double minHeight;
        double maxHeight;
        Style style;
        double offsetX;
        double offsetY;
        String format;

        String formatter;
        DatetimeFormatter datetimeFormatter;

        class DatetimeFormatter {
            String year;
            String month;
            String day;
            String hour;
            String minute;
        }

        class Style {
            String[] colors;
            String fontSize;
            String fontFamily;
            String cssClass;
        }
    }

    class AxisBorder {
        Boolean show;
        String color;
        double offsetX;
        double offsetY;
        double strokeWidth;
    }

    class AxisTicks {
        Boolean show;
        String borderType;
        String color;
        double height;
        double offsetX;
        double offsetY;
    }

    class Title {
        String text;
        double offsetX;
        double offsetY;
        Style style;

        class Style {
            String color;
            String fontSize;
            String cssClass;
        }
    }

    class Crosshairs {
        Boolean show;
        String width;
        String position;
        double opacity;
        Stroke stroke;
        Fill fill;
        DropShadow dropShadow;

        class Stroke {
            String color;
            double width;
            double dashArray;
        }

        class Fill {
            String type;
            String color;
            Gradient gradient;

            class Gradient {
                String colorFrom;
                String colorTo;
                double[] stops;
                double opacityFrom;
                double opacityTo;
            }
        }

        class DropShadow {
            Boolean enabled;
            double top;
            double left;
            double blur;
            double opacity;
        }
    }

    class Tooltip {
        Boolean enabled;
        double offsetY;
    }
}
