package com.github.appreciated.apexcharts.helper;

public class IntFormatter implements Formatter {

    @Override
    public String getString() {
        return "function(val) {return parseInt(val);}";
    }
}
