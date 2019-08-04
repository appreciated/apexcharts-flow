package com.github.appreciated.apexcharts.helper;

public class Series<T> {
    private String name;
    private T[] data;

    public Series() {

    }

    public Series(T... data) {
        this(null, data);
    }

    public Series(String name, T... data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }
}
