package com.github.appreciated.apexcharts.config.xaxis;

public enum XAxisType {
    categories("categories"),
    datetime("datetime"),
    numeric("numeric");
    private String name;

    XAxisType(String name) {
        this.name = name;
    }
}
