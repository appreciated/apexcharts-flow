package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.fill.Gradient;
import com.github.appreciated.apexcharts.config.fill.Image;
import com.github.appreciated.apexcharts.config.fill.Pattern;

import java.util.List;

public class Fill {
    private List<String> colors;
    private Double[] opacity;
    private String[] type;
    private Gradient gradient;
    private Image[] image;
    private Pattern[] pattern;

    public Fill() {
    }

    public List<String> getColors() {
        return colors;
    }

    public Double[] getOpacity() {
        return opacity;
    }

    public String[] getType() {
        return type;
    }

    public Gradient getGradient() {
        return gradient;
    }

    public Image[] getImage() {
        return image;
    }

    public Pattern[] getPattern() {
        return pattern;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public void setOpacity(Double... opacity) {
        this.opacity = opacity;
    }

    public void setType(String... type) {
        this.type = type;
    }

    public void setGradient(Gradient gradient) {
        this.gradient = gradient;
    }

    public void setImage(Image... image) {
        this.image = image;
    }

    public void setPattern(Pattern... pattern) {
        this.pattern = pattern;
    }

}
