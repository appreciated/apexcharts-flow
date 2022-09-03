package com.github.appreciated.apexcharts.config.chart.toolbar.builder;

import com.github.appreciated.apexcharts.config.chart.toolbar.Csv;
import com.github.appreciated.apexcharts.helper.Formatter;

public class CsvBuilder {
    private String filename;
    private String columnDelimiter;
    private String headerCategory;
    private String headerValue;
    private String dataFormatter;

    private CsvBuilder() {
    }

    public static CsvBuilder get() {
        return new CsvBuilder();
    }

    public CsvBuilder withDataFormatter(String dataFormatter) {
        this.dataFormatter = dataFormatter;
        return this;
    }

    public CsvBuilder withDataFormatter(Formatter dataFormatter) {
        this.dataFormatter = dataFormatter.getString();
        return this;
    }

    public CsvBuilder withFilename(String filename) {
        this.filename = filename;
        return this;
    }

    public CsvBuilder withColumnDelimiter(String columnDelimiter) {
        this.columnDelimiter = columnDelimiter;
        return this;
    }

    public CsvBuilder withHeaderCategory(String headerCategory) {
        this.headerCategory = headerCategory;
        return this;
    }

    public CsvBuilder withHeaderValue(String headerValue) {
        this.headerValue = headerValue;
        return this;
    }

    public Csv build() {
        Csv csv = new Csv();
        csv.setFilename(filename);
        csv.setColumnDelimiter(columnDelimiter);
        csv.setHeaderCategory(headerCategory);
        csv.setHeaderValue(headerValue);
        csv.setDateFormatter(dataFormatter);
        return csv;
    }
}
