package com.github.appreciated.apexcharts.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Series {
    String name;
    List<Double> data;

    public Series() {

    }

    public Series(String name, ArrayList<Double> data) {
        this.name = name;
        this.data = data;
    }

    public Series(Double... data) {
        this(null, data);
    }

    public Series(String name, Double... data) {
        this.name = name;
        this.data = Arrays.asList(data);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getData() {
        return data;
    }

    public void setData(List<Double> data) {
        this.data = data;
    }
}
