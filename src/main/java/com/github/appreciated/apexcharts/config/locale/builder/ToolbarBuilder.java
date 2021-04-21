package com.github.appreciated.apexcharts.config.locale.builder;

import com.github.appreciated.apexcharts.config.locale.Toolbar;

public class ToolbarBuilder {
    private String exportToSVG;
    private String exportToPNG;
    private String menu;
    private String selection;
    private String selectionZoom;
    private String zoomIn;
    private String zoomOut;
    private String pan;
    private String reset;

    private ToolbarBuilder() {
    }

    public static ToolbarBuilder get() {
        return new ToolbarBuilder();
    }

    public ToolbarBuilder withExportToSVG(String exportToSVG) {
        this.exportToSVG = exportToSVG;
        return this;
    }
    
    public ToolbarBuilder withExportToPNG(String exportToPNG) {
        this.exportToPNG = exportToPNG;
        return this;
    }
    
    public ToolbarBuilder withMenu(String menu) {
        this.menu = menu;
        return this;
    }

    public ToolbarBuilder withSelection(String selection) {
        this.selection = selection;
        return this;
    }

    public ToolbarBuilder withSelectionZoom(String selectionZoom) {
        this.selectionZoom = selectionZoom;
        return this;
    }

    public ToolbarBuilder withZoomIn(String zoomIn) {
        this.zoomIn = zoomIn;
        return this;
    }

    public ToolbarBuilder withZoomOut(String zoomOut) {
        this.zoomOut = zoomOut;
        return this;
    }

    public ToolbarBuilder withPan(String pan) {
        this.pan = pan;
        return this;
    }

    public ToolbarBuilder withReset(String reset) {
        this.reset = reset;
        return this;
    }

    public Toolbar build() {
        Toolbar toolbar = new Toolbar();
        toolbar.setExportToSVG(exportToSVG);
        toolbar.setExportToPNG(exportToPNG);
        toolbar.setMenu(menu);
        toolbar.setSelection(selection);
        toolbar.setSelectionZoom(selectionZoom);
        toolbar.setZoomIn(zoomIn);
        toolbar.setZoomOut(zoomOut);
        toolbar.setPan(pan);
        toolbar.setReset(reset);
        return toolbar;
    }
}
