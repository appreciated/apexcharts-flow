package com.github.appreciated.apexcharts.config.annotations;

public class AnnotationStyle {
    private String background;
    private String color;
    private String fontSize;
    private String cssClass;
    private Padding padding;

    public AnnotationStyle() {
    }

    public String getBackground() {
        return background;
    }

    public String getColor() {
        return color;
    }

    public String getFontSize() {
        return fontSize;
    }

    public String getCssClass() {
        return cssClass;
    }

    public Padding getPadding() {
        return padding;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public void setPadding(Padding padding) {
        this.padding = padding;
    }

}
