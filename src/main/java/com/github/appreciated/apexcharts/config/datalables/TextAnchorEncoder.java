package com.github.appreciated.apexcharts.config.datalables;

import com.vaadin.flow.templatemodel.ModelEncoder;

import java.util.Optional;

public class TextAnchorEncoder implements ModelEncoder<TextAnchor, String> {

    @Override
    public String encode(TextAnchor modelValue) {
        return Optional.ofNullable(modelValue).map(Object::toString).orElse(null);
    }

    @Override
    public TextAnchor decode(String presentationValue) {
        return Optional.ofNullable(presentationValue).map(TextAnchor::valueOf).orElse(null);
    }
}
