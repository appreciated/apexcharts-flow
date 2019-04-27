package com.github.appreciated.apexcharts.config.responsive.builder;

import com.github.appreciated.apexcharts.config.*;
import com.github.appreciated.apexcharts.config.responsive.Options;

public class OptionsBuilder {

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

    private OptionsBuilder() {
    }

    public static OptionsBuilder get() {
        return new OptionsBuilder();
    }

    public OptionsBuilder withApexAnnotations(Annotations apexAnnotations) {
        this.annotations = apexAnnotations;
        return this;
    }

    public OptionsBuilder withChart(Chart apexChart) {
        this.chart = apexChart;
        return this;
    }

    public OptionsBuilder withColors(String[] colors) {
        this.colors = colors;
        return this;
    }

    public OptionsBuilder withDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public OptionsBuilder withFill(Fill fill) {
        this.fill = fill;
        return this;
    }

    public OptionsBuilder withGrid(Grid grid) {
        this.grid = grid;
        return this;
    }

    public OptionsBuilder withLabels(String[] labels) {
        this.labels = labels;
        return this;
    }

    public OptionsBuilder withLegend(Legend legend) {
        this.legend = legend;
        return this;
    }

    public OptionsBuilder withMarkers(Markers markers) {
        this.markers = markers;
        return this;
    }

    public OptionsBuilder withNoData(NoData noData) {
        this.noData = noData;
        return this;
    }

    public OptionsBuilder withPlotOptions(PlotOptions plotOptions) {
        this.plotOptions = plotOptions;
        return this;
    }

    public OptionsBuilder withStates(States states) {
        this.states = states;
        return this;
    }

    public OptionsBuilder withStroke(Stroke stroke) {
        this.stroke = stroke;
        return this;
    }

    public OptionsBuilder withSubtitle(TitleSubtitle subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public OptionsBuilder withTheme(Theme theme) {
        this.theme = theme;
        return this;
    }

    public OptionsBuilder withTitle(TitleSubtitle title) {
        this.title = title;
        return this;
    }

    public OptionsBuilder withTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public OptionsBuilder withXAxis(XAxis xAxis) {
        this.xaxis = xAxis;
        return this;
    }

    public OptionsBuilder withYAxes(YAxis[] yAxes) {
        this.yaxis = yAxes;
        return this;
    }

    public Options build() {
        Options options = new Options();
        options.setAnnotations(annotations);
        options.setChart(chart);
        options.setColors(colors);
        options.setDataLabels(dataLabels);
        options.setFill(fill);
        options.setGrid(grid);
        options.setLabels(labels);
        options.setLegend(legend);
        options.setMarkers(markers);
        options.setNoData(noData);
        options.setPlotOptions(plotOptions);
        options.setStates(states);
        options.setStroke(stroke);
        options.setSubtitle(subtitle);
        options.setTheme(theme);
        options.setTitle(title);
        options.setTooltip(tooltip);
        options.setXAxis(xaxis);
        options.setYAxes(yaxis);
        return options;
    }
}
