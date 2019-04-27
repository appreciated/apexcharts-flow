package com.github.appreciated.apexcharts.config.xaxis;

import com.github.appreciated.apexcharts.config.chart.DropShadow;
import com.github.appreciated.apexcharts.config.xaxis.crosshairs.Fill;
import com.github.appreciated.apexcharts.config.xaxis.crosshairs.Stroke;

public class Crosshairs {
    private Boolean show;
    private String width;
    private String position;
    private Double opacity;
    private Stroke stroke;
    private Fill fill;
    private DropShadow dropShadow;


    public Crosshairs() {
    }

    public Boolean getShow() {
        return show;
    }

    public String getWidth() {
        return width;
    }

    public String getPosition() {
        return position;
    }

    public Double getOpacity() {
        return opacity;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public Fill getFill() {
        return fill;
    }

    public DropShadow getDropShadow() {
        return dropShadow;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public void setFill(Fill fill) {
        this.fill = fill;
    }

    public void setDropShadow(DropShadow dropShadow) {
        this.dropShadow = dropShadow;
    }

}
