package com.github.appreciated.apexcharts.config.yaxis;

public class Crosshairs {
    private Boolean show;
    private String position;
    private Stroke stroke;


    public Crosshairs() {
    }

    public Boolean getShow() {
        return show;
    }

    public String getPosition() {
        return position;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

}
