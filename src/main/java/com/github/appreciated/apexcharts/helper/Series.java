package com.github.appreciated.apexcharts.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Series<T> {
    private String name;
    private List<T> data;

    public Series() {

    }

    public Series(String name, ArrayList<T> data) {
        this.name = name;
        this.data = data;
    }

    public Series(T... data) {
        this(null, data);
    }

    public Series(String name, T... data) {
        this.name = name;
        this.data = Arrays.asList(data);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
