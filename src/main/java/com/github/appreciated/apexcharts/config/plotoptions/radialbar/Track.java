package com.github.appreciated.apexcharts.config.plotoptions.radialbar;

import com.github.appreciated.apexcharts.config.chart.DropShadow;

public class Track {
    private Boolean show;
    private Double startAngle;
    private Double endAngle;
    private String background;
    private String strokeWidth;
    private Double opacity;
    private Double margin;
    private DropShadow dropShadow;


    public Track() {
    }

    public Boolean getShow() {
        return show;
    }

    public Double getStartAngle() {
        return startAngle;
    }

    public Double getEndAngle() {
        return endAngle;
    }

    public String getBackground() {
        return background;
    }

    public String getStrokeWidth() {
        return strokeWidth;
    }

    public Double getOpacity() {
        return opacity;
    }

    public Double getMargin() {
        return margin;
    }

    public DropShadow getDropShadow() {
        return dropShadow;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setStartAngle(Double startAngle) {
        this.startAngle = startAngle;
    }

    public void setEndAngle(Double endAngle) {
        this.endAngle = endAngle;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public void setStrokeWidth(String strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }

    public void setMargin(Double margin) {
        this.margin = margin;
    }

    public void setDropShadow(DropShadow dropShadow) {
        this.dropShadow = dropShadow;
    }

}
