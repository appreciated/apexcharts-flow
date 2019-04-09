package com.github.appreciated.apexcharts.config.xaxis;

public enum Type {
    categories("categories"),
    datetime("datetime"),
    numeric("numeric");
    private String name;

    Type(String name) {
        this.name = name;
    }
}
