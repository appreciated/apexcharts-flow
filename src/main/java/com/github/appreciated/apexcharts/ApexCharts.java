package com.github.appreciated.apexcharts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.appreciated.apexcharts.config.*;
import com.github.appreciated.apexcharts.helper.Series;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.HasTheme;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

import java.util.Arrays;

@NpmPackage(value = "apexcharts",version = "3.8.4")
@NpmPackage(value = "onecolor",version = "3.0.5")
@JsModule("apexcharts-wrapper.js")
@Tag("apex-charts-wrapper")

public class ApexCharts extends PolymerTemplate<ApexChartsModel> implements HasSize, HasStyle, HasTheme {

    public ApexCharts() {
    }

    @Override
    public void setWidth(String width) {
        HasSize.super.setWidth(width);
        getModel().setWidth(width);
    }

    @Override
    public void setHeight(String height) {
        HasSize.super.setHeight(height);
        getModel().setHeight(height);
    }

    public ApexCharts withAnnotations(Annotations annotations) {
        getModel().setAnnotations(annotations);
        return this;
    }

    public ApexCharts withChart(Chart chart) {
        getModel().setChart(chart);
        return this;
    }

    public ApexCharts withColors(String... colors) {
        try {
            getModel().setColors(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(colors));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ApexCharts withDataLabels(DataLabels dataLabels) {
        getModel().setDataLabels(dataLabels);
        return this;
    }

    public ApexCharts withFill(Fill fill) {
        getModel().setFill(fill);
        return this;
    }

    public ApexCharts withGrid(Grid grid) {
        getModel().setGrid(grid);
        return this;
    }

    public ApexCharts withLabels(String... labels) {
        getModel().setLabels(Arrays.asList(labels));
        return this;
    }

    public ApexCharts withLegend(Legend legend) {
        getModel().setLegend(legend);
        return this;
    }

    public ApexCharts withMarkers(Markers markers) {
        getModel().setMarkers(markers);
        return this;
    }

    public ApexCharts withNoData(NoData noData) {
        getModel().setNoData(noData);
        return this;
    }

    public ApexCharts withPlotOptions(PlotOptions plotOptions) {
        getModel().setPlotOptions(plotOptions);
        return this;
    }

    public ApexCharts withResponsive(Responsive... responsive) {
        try {
            getModel().setResponsive(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(responsive));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ApexCharts withSeries(Double... series) {
        try {
            getModel().setSeries(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(series));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ApexCharts withSeries(Series... series) {
        try {
            getModel().setSeries(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(series));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ApexCharts withStates(States states) {
        getModel().setStates(states);
        return this;
    }

    public ApexCharts withStroke(Stroke stroke) {
        getModel().setStroke(stroke);
        return this;
    }

    public ApexCharts withSubtitle(TitleSubtitle subtitle) {
        try {
            getModel().setSubtitle(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(subtitle));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ApexCharts withTheme(Theme theme) {
        getModel().setTheme(theme);
        return this;
    }

    public ApexCharts withTitle(TitleSubtitle title) {
        try {
            getModel().setChartTitle(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(title));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ApexCharts withTooltip(Tooltip tooltip) {
        getModel().setTooltip(tooltip);
        return this;
    }

    public ApexCharts withXaxis(XAxis xaxis) {
        try {
            getModel().setXaxis(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(xaxis));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ApexCharts withYaxis(YAxis yaxis) {
        try {
            getModel().setYaxis(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(yaxis));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public void render(){
        getElement().callFunction("render");
    }

}

