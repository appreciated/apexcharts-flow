package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.chart.*;
import com.github.appreciated.apexcharts.config.chart.toolbar.Toolbar;
import com.github.appreciated.apexcharts.config.chart.zoom.Zoom;

public class Chart {
    Type type;
    String foreColor;
    String fontFamily;
    String background;
    double offsetX;
    double offsetY;
    DropShadow dropShadow;
    Brush brush;
    String id;
    //ApexLocale[] locales;
    String defaultLocale;
    Sparkline sparkline;
    Boolean stacked;
    StackType stackType;
    Toolbar toolbar;
    Zoom zoom;
    Selection selection;
    Animations animations;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getForeColor() {
        return foreColor;
    }

    public void setForeColor(String foreColor) {
        this.foreColor = foreColor;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(double offsetX) {
        this.offsetX = offsetX;
    }

    public double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(double offsetY) {
        this.offsetY = offsetY;
    }

    public DropShadow getDropShadow() {
        return dropShadow;
    }

    public void setDropShadow(DropShadow dropShadow) {
        this.dropShadow = dropShadow;
    }

    public Brush getBrush() {
        return brush;
    }

    public void setBrush(Brush brush) {
        this.brush = brush;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDefaultLocale() {
        return defaultLocale;
    }

    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    public Sparkline getSparkline() {
        return sparkline;
    }

    public void setSparkline(Sparkline sparkline) {
        this.sparkline = sparkline;
    }

    public Boolean getStacked() {
        return stacked;
    }

    public void setStacked(Boolean stacked) {
        this.stacked = stacked;
    }

    public StackType getStackType() {
        return stackType;
    }

    public void setStackType(StackType stackType) {
        this.stackType = stackType;
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    public void setToolbar(Toolbar toolbar) {
        this.toolbar = toolbar;
    }

    public Zoom getZoom() {
        return zoom;
    }

    public void setZoom(Zoom zoom) {
        this.zoom = zoom;
    }

    public Selection getSelection() {
        return selection;
    }

    public void setSelection(Selection selection) {
        this.selection = selection;
    }

    public Animations getAnimations() {
        return animations;
    }

    public void setAnimations(Animations animations) {
        this.animations = animations;
    }
}


