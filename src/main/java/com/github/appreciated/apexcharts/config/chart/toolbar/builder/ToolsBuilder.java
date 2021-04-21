package com.github.appreciated.apexcharts.config.chart.toolbar.builder;

import com.github.appreciated.apexcharts.config.chart.toolbar.Tools;

public class ToolsBuilder {
    private String download;
    private String selection;
    private String zoom;
    private String zoomin;
    private String zoomout;
    private String pan;
    private String reset;

    private ToolsBuilder() {
    }

    public static ToolsBuilder get() {
        return new ToolsBuilder();
    }

    public ToolsBuilder withDownload(String download) {
        this.download = download;
        return this;
    }

    public ToolsBuilder withSelection(String selection) {
        this.selection = selection;
        return this;
    }

    public ToolsBuilder withZoom(String zoom) {
        this.zoom = zoom;
        return this;
    }

    public ToolsBuilder withZoomin(String zoomin) {
        this.zoomin = zoomin;
        return this;
    }

    public ToolsBuilder withZoomout(String zoomout) {
        this.zoomout = zoomout;
        return this;
    }

    public ToolsBuilder withPan(String pan) {
        this.pan = pan;
        return this;
    }

    public ToolsBuilder withReset(String reset) {
        this.reset = reset;
        return this;
    }

    public Tools build() {
        Tools tools = new Tools();
        tools.setDownload(download);
        tools.setSelection(selection);
        tools.setZoom(zoom);
        tools.setZoomin(zoomin);
        tools.setZoomout(zoomout);
        tools.setPan(pan);
        tools.setReset(reset);
        return tools;
    }
}
