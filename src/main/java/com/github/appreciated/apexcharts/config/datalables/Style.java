package com.github.appreciated.apexcharts.config.datalables;

import java.util.List;

public class Style {
    private String fontSize;
    private String fontFamily;
    private List<String> colors;


    public Style() {
    }

    public String getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

}
