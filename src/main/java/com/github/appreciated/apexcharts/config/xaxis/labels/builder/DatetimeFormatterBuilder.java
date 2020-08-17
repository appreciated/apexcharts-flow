package com.github.appreciated.apexcharts.config.xaxis.labels.builder;

import com.github.appreciated.apexcharts.config.xaxis.labels.DatetimeFormatter;

public class DatetimeFormatterBuilder {
    private String year;
    private String month;
    private String day;
    private String hour;
    private String minute;
    private String second;

    private DatetimeFormatterBuilder() {
    }

    public static DatetimeFormatterBuilder get() {
        return new DatetimeFormatterBuilder();
    }

    public DatetimeFormatterBuilder withYear(String year) {
        this.year = year;
        return this;
    }

    public DatetimeFormatterBuilder withMonth(String month) {
        this.month = month;
        return this;
    }

    public DatetimeFormatterBuilder withDay(String day) {
        this.day = day;
        return this;
    }

    public DatetimeFormatterBuilder withHour(String hour) {
        this.hour = hour;
        return this;
    }

    public DatetimeFormatterBuilder withMinute(String minute) {
        this.minute = minute;
        return this;
    }

    public DatetimeFormatterBuilder withSecond(String second) {
        this.second = second;
        return this;
    }

    public DatetimeFormatter build() {
        DatetimeFormatter datetimeFormatter = new DatetimeFormatter();
        datetimeFormatter.setYear(year);
        datetimeFormatter.setMonth(month);
        datetimeFormatter.setDay(day);
        datetimeFormatter.setHour(hour);
        datetimeFormatter.setMinute(minute);
        datetimeFormatter.setSecond(second);
        return datetimeFormatter;
    }
}
