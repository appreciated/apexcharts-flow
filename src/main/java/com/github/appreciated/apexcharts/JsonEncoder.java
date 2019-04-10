package com.github.appreciated.apexcharts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.flow.templatemodel.ModelEncoder;

public class JsonEncoder<T> implements ModelEncoder<T,String> {
    @Override
    public String encode(T value) {
        try {
           return  new ObjectMapper().writeValueAsString(value);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T decode(String value) {
        return null;
    }
}
