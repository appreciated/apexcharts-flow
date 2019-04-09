package com.github.appreciated.apexcharts.config.xaxis;

public class Labels {
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
