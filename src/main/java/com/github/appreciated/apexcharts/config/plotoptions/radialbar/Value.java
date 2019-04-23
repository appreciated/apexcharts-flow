package com.github.appreciated.apexcharts.config.plotoptions.radialbar;

public class Value {
    private Boolean show;
    private String fontSize;
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
