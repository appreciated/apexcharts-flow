package com.github.appreciated.apexcharts.config.plotoptions.radialbar.builder;

import com.github.appreciated.apexcharts.config.chart.DropShadow;
import com.github.appreciated.apexcharts.config.plotoptions.radialbar.Track;

public class TrackBuilder {
    private Boolean show;
    private Double startAngle;
    private Double endAngle;
    private String background;
    private String strokeWidth;
    private Double opacity;
    private Double margin;
    private DropShadow dropShadow;

    private TrackBuilder() {
    }

    public static TrackBuilder get() {
        return new TrackBuilder();
    }

    public TrackBuilder withShow(Boolean show) {
        this.show = show;
        return this;
    }

    public TrackBuilder withStartAngle(Double startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public TrackBuilder withEndAngle(Double endAngle) {
        this.endAngle = endAngle;
        return this;
    }

    public TrackBuilder withBackground(String background) {
        this.background = background;
        return this;
    }

    public TrackBuilder withStrokeWidth(String strokeWidth) {
        this.strokeWidth = strokeWidth;
        return this;
    }

    public TrackBuilder withOpacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    public TrackBuilder withMargin(Double margin) {
        this.margin = margin;
        return this;
    }

    public TrackBuilder withDropShadow(DropShadow dropShadow) {
        this.dropShadow = dropShadow;
        return this;
    }

    public Track build() {
        Track track = new Track();
        track.setShow(show);
        track.setStartAngle(startAngle);
        track.setEndAngle(endAngle);
        track.setBackground(background);
        track.setStrokeWidth(strokeWidth);
        track.setOpacity(opacity);
        track.setMargin(margin);
        track.setDropShadow(dropShadow);
        return track;
    }
}
