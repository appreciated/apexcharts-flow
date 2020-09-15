package com.github.appreciated.apexcharts.helper;

public class SuffixFormatter implements Formatter {

    private String suffix;

    public SuffixFormatter(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public String getString() {
        return "function (val, opts) { return val + \"" +suffix+"\"}";
    }
}
