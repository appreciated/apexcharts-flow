package com.github.appreciated.apexcharts.config.plotoptions.radialbar;

public class Track {
    private Boolean show;
    private Double startAngle;
    private Double endAngle;
    private String background;
    private String strokeWidth;
    private Double opacity;
    private Double margin;
    private DropShadow dropShadow;

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Double getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(Double startAngle) {
        this.startAngle = startAngle;
    }

    public Double getEndAngle() {
        return endAngle;
    }

    public void setEndAngle(Double endAngle) {
        this.endAngle = endAngle;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(String strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public Double getOpacity() {
        return opacity;
    }

    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }

    public Double getMargin() {
        return margin;
    }

    public void setMargin(Double margin) {
        this.margin = margin;
    }

    public DropShadow getDropShadow() {
        return dropShadow;
    }

    public void setDropShadow(DropShadow dropShadow) {
        this.dropShadow = dropShadow;
    }
}
