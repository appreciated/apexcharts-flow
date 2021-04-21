package com.github.appreciated.apexcharts.helper;

public class StringFormatter implements Formatter {

    @Override
    public String getString() {
        return "function(val) {return val.toString()}";
    }
}
