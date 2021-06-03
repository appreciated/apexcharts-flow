package com.github.appreciated.apexcharts.config.chart.builder;

import com.github.appreciated.apexcharts.config.chart.Events;

public class EventsBuilder {
    private String animationEnd;
    private String beforeMount;
    private String mounted;
    private String updated;
    private String click;
    private String mouseMove;
    private String legendClick;
    private String markerClick;
    private String selection;
    private String dataPointSelection;
    private String dataPointMouseEnter;
    private String dataPointMouseLeave;
    private String beforeZoom;
    private String beforeResetZoom;
    private String zoomed;
    private String scrolled;

    private EventsBuilder() {
    }

    public static EventsBuilder get() {
        return new EventsBuilder();
    }

    public EventsBuilder withAnimationEnd(String animationEnd) {
        this.animationEnd = animationEnd;
        return this;
    }

    public EventsBuilder withBeforeMount(String beforeMount) {
        this.beforeMount = beforeMount;
        return this;
    }

    public EventsBuilder withMounted(String mounted) {
        this.mounted = mounted;
        return this;
    }

    public EventsBuilder withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    public EventsBuilder withClick(String click) {
        this.click = click;
        return this;
    }

    public EventsBuilder withMouseMove(String mouseMove) {
        this.mouseMove = mouseMove;
        return this;
    }

    public EventsBuilder withLegendClick(String legendClick) {
        this.legendClick = legendClick;
        return this;
    }

    public EventsBuilder withMarkerClick(String markerClick) {
        this.markerClick = markerClick;
        return this;
    }

    public EventsBuilder withSelection(String selection) {
        this.selection = selection;
        return this;
    }

    public EventsBuilder withDataPointSelection(String dataPointSelection) {
        this.dataPointSelection = dataPointSelection;
        return this;
    }

    public EventsBuilder withDataPointMouseEnter(String dataPointMouseEnter) {
        this.dataPointMouseEnter = dataPointMouseEnter;
        return this;
    }

    public EventsBuilder withDataPointMouseLeave(String dataPointMouseLeave) {
        this.dataPointMouseLeave = dataPointMouseLeave;
        return this;
    }

    public EventsBuilder withBeforeZoom(String beforeZoom) {
        this.beforeZoom = beforeZoom;
        return this;
    }

    public EventsBuilder withBeforeResetZoom(String beforeResetZoom) {
        this.beforeResetZoom = beforeResetZoom;
        return this;
    }

    public EventsBuilder withZoomed(String zoomed) {
        this.zoomed = zoomed;
        return this;
    }

    public EventsBuilder withScrolled(String scrolled) {
        this.scrolled = scrolled;
        return this;
    }

    public Events build() {
        Events events = new Events();
        events.setAnimationEnd(animationEnd);
        events.setBeforeMount(beforeMount);
        events.setMounted(mounted);
        events.setUpdated(updated);
        events.setClick(click);
        events.setMouseMove(mouseMove);
        events.setLegendClick(legendClick);
        events.setMarkerClick(markerClick);
        events.setSelection(selection);
        events.setDataPointSelection(dataPointSelection);
        events.setDataPointMouseEnter(dataPointMouseEnter);
        events.setDataPointMouseLeave(dataPointMouseLeave);
        events.setBeforeZoom(beforeZoom);
        events.setBeforeResetZoom(beforeResetZoom);
        events.setZoomed(zoomed);
        events.setScrolled(scrolled);
        return events;
    }
}
