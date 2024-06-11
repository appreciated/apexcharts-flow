package com.github.appreciated.apexcharts.helper;

import com.github.appreciated.apexcharts.config.series.SeriesType;

public class Series<T> {
	private String name;
    private SeriesType type;
    private T[] data;
    private String group;

    public Series() {

    }

    public Series(T... data) {
        this(null, data);
    }

    public Series(String name, T... data) {
    	this(name, null, null, data);
    }

    public Series(String name, String group, T... data) {
        this(name, null, group, data);
    }
    
    public Series(String name, SeriesType type, T... data) {
        this(name, type, null, data);
    }

    public Series(String name, SeriesType type, String group, T... data) {
        this.name = name;
        this.type = type;
        this.data = data;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SeriesType getType() {
		return type;
	}

	public void setType(SeriesType type) {
		this.type = type;
	}

	public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
