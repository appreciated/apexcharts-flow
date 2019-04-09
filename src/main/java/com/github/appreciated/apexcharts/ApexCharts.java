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

    public ApexCharts() {
        setWidth("300px");
        setHeight("300px");
    }

    public ApexCharts withAnnotations(ApexAnnotations annotations) {
        getModel().setAnnotations(annotations);
        return this;
    }

    public ApexCharts withChart(ApexChart chart) {
        getModel().setChart(chart);
        return this;
    }

    public ApexCharts withColors(String[] colors) {
        getModel().setColors(colors);
        return this;
    }

    public ApexCharts withDataLabels(ApexDataLabels dataLabels) {
        getModel().setDataLabels(dataLabels);
        return this;
    }

    public ApexCharts withFill(ApexFill fill) {
        getModel().setFill(fill);
        return this;
    }

    public ApexCharts withGrid(ApexGrid grid) {
        getModel().setGrid(grid);
        return this;
    }

    public ApexCharts withLabels(String... labels) {
        getModel().setLabels(labels);
        return this;
    }

    public ApexCharts withLegend(ApexLegend legend) {
        getModel().setLegend(legend);
        return this;
    }

    public ApexCharts withMarkers(ApexMarkers markers) {
        getModel().setMarkers(markers);
        return this;
    }

    public ApexCharts withNoData(ApexNoData noData) {
        getModel().setNoData(noData);
        return this;
    }

    public ApexCharts withPlotOptions(ApexPlotOptions plotOptions) {
        getModel().setPlotOptions(plotOptions);
        return this;
    }

    public ApexCharts withResponsive(ApexResponsive... responsive) {
        getModel().setResponsive(responsive);
        return this;
    }

    public ApexCharts withSeries(double... series) {
        getModel().setDoubleChartSeries(series);
        return this;
    }

    public ApexCharts withSeries(Map<String, Double> series) {
        getModel().setMapChartSeries(series);
        return this;
    }

    public ApexCharts withStates(ApexStates states) {
        getModel().setStates(states);
        return this;
    }

    public ApexCharts withStroke(ApexStroke stroke) {
        getModel().setStroke(stroke);
        return this;
    }

    public ApexCharts withSubtitle(ApexTitleSubtitle subtitle) {
        getModel().setSubtitle(subtitle);
        return this;
    }

    public ApexCharts withTheme(ApexTheme theme) {
        getModel().setTheme(theme);
        return this;
    }

    public ApexCharts withTitle(ApexTitleSubtitle title) {
        getModel().setTitle(title);
        return this;
    }

    public ApexCharts withTooltip(ApexTooltip tooltip) {
        getModel().setTooltip(tooltip);
        return this;
    }

    public ApexCharts withXaxis(ApexXAxis xaxis) {
        getModel().setXaxis(xaxis);
        return this;
    }

    public ApexCharts withYaxis(ApexYAxis[] yaxis) {
        getModel().setYaxis(yaxis);
        return this;
    }

    public interface ApexChartModel extends TemplateModel {
        ApexAnnotations getAnnotations();

        void setAnnotations(ApexAnnotations annotations);

        ApexChart getChart();

        void setChart(ApexChart chart);

        String[] getColors();

        void setColors(String[] colors);

        ApexDataLabels getDataLabels();

        void setDataLabels(ApexDataLabels dataLabels);

        ApexFill getFill();

        void setFill(ApexFill fill);

        ApexGrid getGrid();

        void setGrid(ApexGrid grid);

        String[] getLabels();

        void setLabels(String[] labels);

        ApexLegend getLegend();

        void setLegend(ApexLegend legend);

        ApexMarkers getMarkers();

        void setMarkers(ApexMarkers markers);

        ApexNoData getNoData();

        void setNoData(ApexNoData noData);

        ApexPlotOptions getPlotOptions();

        void setPlotOptions(ApexPlotOptions plotOptions);

        ApexResponsive[] getResponsive();

        void setResponsive(ApexResponsive[] responsive);

        ApexAxisChartSeries getSeries();

        void setSeries(ApexAxisChartSeries series);

        ApexStates getStates();

        void setStates(ApexStates states);

        ApexStroke getStroke();

        void setStroke(ApexStroke stroke);

        ApexTitleSubtitle getSubtitle();

        void setSubtitle(ApexTitleSubtitle subtitle);

        ApexTheme getTheme();

        void setTheme(ApexTheme theme);

        ApexTitleSubtitle getTitle();

        void setTitle(ApexTitleSubtitle title);

        ApexTooltip getTooltip();

        void setTooltip(ApexTooltip tooltip);

        ApexXAxis getXaxis();

        void setXaxis(ApexXAxis xaxis);

        ApexYAxis[] getYaxis();

        void setYaxis(ApexYAxis[] yaxis);

        double[] getDoubleChartSeries();

        void setDoubleChartSeries(double[] doubleChartSeries);

        Map<String, Double> getMapChartSeries();

        void setMapChartSeries(Map<String, Double> mapChartSeries);
    }
}

