package com.github.appreciated.apexcharts;

import com.github.appreciated.apexcharts.config.*;
import com.github.appreciated.apexcharts.config.yaxis.ApexYAxis;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

import java.util.Map;

@Tag("apex-charts-wrapper")
@HtmlImport("frontend://com/github/appreciated/apexcharts/apexcharts-wrapper.html")
public class ApexCharts extends PolymerTemplate<ApexCharts.ApexChartModel> implements HasSize {

    ApexAnnotations annotations;
    ApexChart chart;
    String[] colors;
    ApexDataLabels dataLabels;
    ApexFill fill;
    ApexGrid grid;
    String[] labels;
    ApexLegend legend;
    ApexMarkers markers;
    ApexNoData noData;
    ApexPlotOptions plotOptions;
    ApexResponsive[] responsive;
    ApexAxisChartSeries series; //?:  | ApexNonAxisChartSeries;
    ApexStates states;
    ApexStroke stroke;
    ApexTitleSubtitle subtitle;
    ApexTheme theme;
    ApexTitleSubtitle title;
    ApexTooltip tooltip;
    ApexXAxis xaxis;
    ApexYAxis[] yaxis;
    private double[] doubleSeries;
    private Map<String, Double> mapSeries;

    public ApexCharts() {
        setWidth("300px");
        setHeight("300px");
    }

    public ApexCharts withAnnotations(ApexAnnotations annotations) {
        this.annotations = annotations;
        return this;
    }

    public ApexCharts withChart(ApexChart chart) {
        this.chart = chart;
        return this;
    }

    public ApexCharts withColors(String[] colors) {
        this.colors = colors;
        return this;
    }

    public ApexCharts withDataLabels(ApexDataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public ApexCharts withFill(ApexFill fill) {
        this.fill = fill;
        return this;
    }

    public ApexCharts withGrid(ApexGrid grid) {
        this.grid = grid;
        return this;
    }

    public ApexCharts withLabels(String ... labels) {
        this.labels = labels;
        return this;
    }

    public ApexCharts withLegend(ApexLegend legend) {
        this.legend = legend;
        return this;
    }

    public ApexCharts withMarkers(ApexMarkers markers) {
        this.markers = markers;
        return this;
    }

    public ApexCharts withNoData(ApexNoData noData) {
        this.noData = noData;
        return this;
    }

    public ApexCharts withPlotOptions(ApexPlotOptions plotOptions) {
        this.plotOptions = plotOptions;
        return this;
    }

    public ApexCharts withResponsive(ApexResponsive ... responsive) {
        this.responsive = responsive;
        return this;
    }

    public ApexCharts withSeries(double ... series) {
        this.doubleSeries = series;
        return this;
    }
    public ApexCharts withSeries(Map<String,Double> series) {
        this.mapSeries = series;
        return this;
    }

    public ApexCharts withStates(ApexStates states) {
        this.states = states;
        return this;
    }

    public ApexCharts withStroke(ApexStroke stroke) {
        this.stroke = stroke;
        return this;
    }

    public ApexCharts withSubtitle(ApexTitleSubtitle subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public ApexCharts withTheme(ApexTheme theme) {
        this.theme = theme;
        return this;
    }

    public ApexCharts withTitle(ApexTitleSubtitle title) {
        this.title = title;
        return this;
    }

    public ApexCharts withTooltip(ApexTooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public ApexCharts withXaxis(ApexXAxis xaxis) {
        this.xaxis = xaxis;
        return this;
    }

    public ApexCharts withYaxis(ApexYAxis[] yaxis) {
        this.yaxis = yaxis;
        return this;
    }

    public interface ApexChartModel extends TemplateModel {

    }
}

