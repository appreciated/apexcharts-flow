package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.states.Active;
import com.github.appreciated.apexcharts.config.states.Hover;
import com.github.appreciated.apexcharts.config.states.Normal;

public class States {
    Normal normal;
    Hover hover;
    Active active;

    public Normal getNormal() {
        return normal;
    }

    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    public Hover getHover() {
        return hover;
    }

    public void setHover(Hover hover) {
        this.hover = hover;
    }

    public Active getActive() {
        return active;
    }

    public void setActive(Active active) {
        this.active = active;
    }
}