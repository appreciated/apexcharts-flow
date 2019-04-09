package com.github.appreciated.apexcharts.config;

public class ApexXAxis {
    Type type;
    Number[] categories;
    String[] labels;
    AxisBorder axisBorder;
    AxisTicks axisTicks;
    Number tickAmount;
    Number min;
    Number max;
    Number range;
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
        Number rotate;
        Boolean rotateAlways;
        Boolean hideOverlappingLabels;
        Boolean showDuplicates;
        Boolean trim;
        Number minHeight;
        Number maxHeight;
        Style style;
        Number offsetX;
        Number offsetY;
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
        Number offsetX;
        Number offsetY;
        Number strokeWidth;
    }

    class AxisTicks {
        Boolean show;
        String borderType;
        String color;
        Number height;
        Number offsetX;
        Number offsetY;
    }

    class Title {
        String text;
        Number offsetX;
        Number offsetY;
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
        Number opacity;
        Stroke stroke;
        Fill fill;
        DropShadow dropShadow;

        class Stroke {
            String color;
            Number width;
            Number dashArray;
        }

        class Fill {
            String type;
            String color;
            Gradient gradient;

            class Gradient {
                String colorFrom;
                String colorTo;
                Number[] stops;
                Number opacityFrom;
                Number opacityTo;
            }
        }

        class DropShadow {
            Boolean enabled;
            Number top;
            Number left;
            Number blur;
            Number opacity;
        }
    }

    class Tooltip {
        Boolean enabled;
        Number offsetY;
    }
}
