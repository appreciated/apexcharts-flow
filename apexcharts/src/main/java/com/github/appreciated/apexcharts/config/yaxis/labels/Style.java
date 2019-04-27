package com.github.appreciated.apexcharts.config.yaxis.labels;

public class Style {
    private String color;
    private String fontSize;
    private String fontFamily;
    private String cssClass;


    public Style() {
    }

    public String getColor() {
        return color;
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

    public void setColor(String color) {
        this.color = color;
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
