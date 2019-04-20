package com.github.appreciated.apexcharts.config.responsive;

import com.github.appreciated.apexcharts.config.*;

public class Options {
    private Annotations annotations;
    private Chart chart;
    private String[] colors;
    private DataLabels dataLabels;
    private Fill fill;
    private Grid grid;
    private String[] labels;
    private Legend legend;
    private Markers markers;
    private NoData noData;
    private PlotOptions plotOptions;
    private States states;
    private Stroke stroke;
    private TitleSubtitle subtitle;
    private Theme theme;
    private TitleSubtitle title;
    private Tooltip tooltip;
    private XAxis xaxis;
    private YAxis[] yaxis;

    public Options() {
    }

    public Annotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Annotations annotations) {
        this.annotations = annotations;
    }

    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public DataLabels getDataLabels() {
        return dataLabels;
    }

    public void setDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
    }

    public Fill getFill() {
        return fill;
    }

    public void setFill(Fill fill) {
        this.fill = fill;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public String[] getLabels() {
        return labels;
    }

    public void setLabels(String[] labels) {
        this.labels = labels;
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public Markers getMarkers() {
        return markers;
    }

    public void setMarkers(Markers markers) {
        this.markers = markers;
    }

    public NoData getNoData() {
        return noData;
    }

    public void setNoData(NoData noData) {
        this.noData = noData;
    }

    public PlotOptions getPlotOptions() {
        return plotOptions;
    }

    public void setPlotOptions(PlotOptions plotOptions) {
        this.plotOptions = plotOptions;
    }

    public States getStates() {
        return states;
    }

    public void setStates(States states) {
        this.states = states;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public TitleSubtitle getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(TitleSubtitle subtitle) {
        this.subtitle = subtitle;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public TitleSubtitle getTitle() {
        return title;
    }

    public void setTitle(TitleSubtitle title) {
        this.title = title;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

    public XAxis getXAxis() {
        return xaxis;
    }

    public void setXAxis(XAxis xAxis) {
        this.xaxis = xAxis;
    }

    public YAxis[] getYAxes() {
        return yaxis;
    }

    public void setYAxes(YAxis[] yAxes) {
        this.yaxis = yAxes;
    }

}
