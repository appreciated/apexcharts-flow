package com.github.appreciated.apexcharts.config.xaxis.labels;

public class DatetimeFormatter {
    private String year;
    private String month;
    private String day;
    private String hour;
    private String minute;
    private String second;


    public DatetimeFormatter() {
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getHour() {
        return hour;
    }

    public String getMinute() {
        return minute;
    }

    public String getSecond() {
        return second;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public void setSecond(String second) {
        this.second = second;
    }
}
