package com.github.appreciated.apexcharts.config.xaxis;

import com.github.appreciated.apexcharts.config.xaxis.crosshairs.DropShadow;
import com.github.appreciated.apexcharts.config.xaxis.crosshairs.Fill;
import com.github.appreciated.apexcharts.config.xaxis.crosshairs.Stroke;

public class Crosshairs {
    Boolean show;
    String width;
    String position;
    double opacity;
    Stroke stroke;
    Fill fill;
    DropShadow dropShadow;

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getOpacity() {
        return opacity;
    }

    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public Fill getFill() {
        return fill;
    }

    public void setFill(Fill fill) {
        this.fill = fill;
    }

    public DropShadow getDropShadow() {
        return dropShadow;
    }

    public void setDropShadow(DropShadow dropShadow) {
        this.dropShadow = dropShadow;
    }
}
