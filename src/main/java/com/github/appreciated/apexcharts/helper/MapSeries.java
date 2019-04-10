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

}
