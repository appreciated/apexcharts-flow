package com.github.appreciated.apexcharts;

import com.vaadin.flow.templatemodel.ModelEncoder;

public class JsonEncoder<T> implements ModelEncoder<T,String> {
    @Override
    public String encode(T value) {
        return null;
    }

    @Override
    public T decode(String value) {
        return null;
    }
}
