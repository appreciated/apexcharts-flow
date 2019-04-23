package com.github.appreciated.apexcharts.config.plotoptions.pie;

public class Value {
    private Boolean show;
    private String fontSize;
    private String fontFamily;
    private String color;
    private Double offsetY;
    private String formatter;


    public Value() {
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

    public String getFormatter() {
        return formatter;
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

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

}
