package com.github.appreciated.apexcharts.config.chart.toolbar;

import java.time.LocalDateTime;

public class Csv {
    private String filename;
    private String columnDelimiter;
    private String headerCategory;
    private String headerValue;
    private String dateFormatter;

    public Csv() {
    }

    public String getDateFormatter() {
        return dateFormatter;
    }

    public void setDateFormatter(String dateFormatter) {
        this.dateFormatter = dateFormatter;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getColumnDelimiter() {
        return columnDelimiter;
    }

    public void setColumnDelimiter(String columnDelimiter) {
        this.columnDelimiter = columnDelimiter;
    }

    public String getHeaderCategory() {
        return headerCategory;
    }

    public void setHeaderCategory(String headerCategory) {
        this.headerCategory = headerCategory;
    }

    public String getHeaderValue() {
        return headerValue;
    }

    public void setHeaderValue(String headerValue) {
        this.headerValue = headerValue;
    }
}
