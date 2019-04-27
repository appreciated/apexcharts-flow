package com.github.appreciated.apexcharts.config.plotoptions.pie;

public class Name {
    private Boolean show;
    private String fontSize;
    private String fontFamily;
    private String color;
    private Double offsetY;


    public Name() {
    }

    public Boolean getShow() {
        return show;
    }

    public String getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public String getColor() {
        return color;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

}
