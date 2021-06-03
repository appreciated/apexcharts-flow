package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.chart.*;

public class Chart {
    private Type type;
    private String foreColor;
    private String fontFamily;
    private String background;
    private Double offsetX;
    private Double offsetY;
    private String width;
    private String height;
    private DropShadow dropShadow;
    private Brush brush;
    private String id;
    Locale[] locales;
    private String defaultLocale;
    private Sparkline sparkline;
    private Boolean stacked;
    private StackType stackType;
    private Toolbar toolbar;
    private Zoom zoom;
    private Selection selection;
    private Animations animations;
    private String group;
    private Events events;

    public Chart() {
    }

    public Type getType() {
        return type;
    }

    public String getForeColor() {
        return foreColor;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public String getBackground() {
        return background;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public DropShadow getDropShadow() {
        return dropShadow;
    }

    public Brush getBrush() {
        return brush;
    }

    public String getId() {
        return id;
    }

    public String getDefaultLocale() {
        return defaultLocale;
    }

    public Sparkline getSparkline() {
        return sparkline;
    }

    public Boolean getStacked() {
        return stacked;
    }

    public StackType getStackType() {
        return stackType;
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    public Zoom getZoom() {
        return zoom;
    }

    public Selection getSelection() {
        return selection;
    }

    public Animations getAnimations() {
        return animations;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setForeColor(String foreColor) {
        this.foreColor = foreColor;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public void setDropShadow(DropShadow dropShadow) {
        this.dropShadow = dropShadow;
    }

    public void setBrush(Brush brush) {
        this.brush = brush;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    public void setSparkline(Sparkline sparkline) {
        this.sparkline = sparkline;
    }

    public void setStacked(Boolean stacked) {
        this.stacked = stacked;
    }

    public void setStackType(StackType stackType) {
        this.stackType = stackType;
    }

    public void setToolbar(Toolbar toolbar) {
        this.toolbar = toolbar;
    }

    public void setZoom(Zoom zoom) {
        this.zoom = zoom;
    }

    public void setSelection(Selection selection) {
        this.selection = selection;
    }

    public void setAnimations(Animations animations) {
        this.animations = animations;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setHeight(String height) {
        this.height = height;
    }

	public Locale[] getLocales() {
		return locales;
	}

	public void setLocales(Locale[] locales) {
		this.locales = locales;
	}
    
	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }
}


