package com.github.appreciated.apexcharts.config.xaxis.labels;

import java.util.List;

public class Style {
    private List<String> colors;
    private String fontSize;
    private String fontFamily;
    private String cssClass;


    public Style() {
    }

    public List<String> getColors() {
        return colors;
    }

    public String getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

}
