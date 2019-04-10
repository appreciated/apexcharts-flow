package com.github.appreciated.apexcharts.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapSeries  {
    String name;
    List<Double> data;

    public MapSeries(String name, ArrayList<Double> data) {
        this.name = name;
        this.data = data;
    }

    public MapSeries(String name, Double... data) {
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
