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
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

import java.util.Arrays;

@Tag("apex-charts-wrapper")
@NpmPackage(value = "apexcharts", version = "3.10.1")
@NpmPackage(value = "onecolor", version = "3.1.0")
@JsModule("./com/github/appreciated/apexcharts/apexcharts-wrapper.js")
@CssImport(value = "./com/github/appreciated/apexcharts/apexcharts-wrapper-styles.css", id = "apex-charts-style")
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

    public void setAnnotations(Annotations annotations) {
        getModel().setAnnotations(annotations);
    }

    public void setChart(Chart chart) {
        getModel().setChart(chart);
    }

    public void setColors(String... colors) {
        try {
            getModel().setColors(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(colors));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void setDataLabels(DataLabels dataLabels) {
        getModel().setDataLabels(dataLabels);
    }

    public void setFill(Fill fill) {
        getModel().setFill(fill);
    }

    public void setGrid(Grid grid) {
        getModel().setGrid(grid);
    }

    public void setLabels(String... labels) {
        getModel().setLabels(Arrays.asList(labels));
    }

    public void setLegend(Legend legend) {
        getModel().setLegend(legend);
    }

    public void setMarkers(Markers markers) {
        getModel().setMarkers(markers);
    }

    public void setNoData(NoData noData) {
        getModel().setNoData(noData);
    }

    public void setPlotOptions(PlotOptions plotOptions) {
        getModel().setPlotOptions(plotOptions);
    }

    public void setResponsive(Responsive... responsive) {
        try {
            getModel().setResponsive(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(responsive));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void setStates(States states) {
        try {
            getModel().setStates(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(states));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void setStroke(Stroke stroke) {
        getModel().setStroke(stroke);
    }

    public void setSubtitle(TitleSubtitle subtitle) {
        try {
            getModel().setSubtitle(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(subtitle));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void setTheme(Theme theme) {
        getModel().setTheme(theme);
    }

    public void setTitle(TitleSubtitle title) {
        try {
            getModel().setChartTitle(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(title));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void setTooltip(Tooltip tooltip) {
        getModel().setTooltip(tooltip);
    }

    public void setXaxis(XAxis xaxis) {
        try {
            getModel().setXaxis(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(xaxis));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void setYaxis(YAxis yaxis) {
        try {
            getModel().setYaxis(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(yaxis));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void render() {
        getElement().callJsFunction("render");
    }

    public void setDebug(boolean enabled) {
        getModel().setDebug(enabled);
    }

    public void updateSeries(Series... series) {
        setSeries(series);
        getElement().callJsFunction("updateData");
    }

    public void setSeries(Series... series) {
        try {
            getModel().setSeries(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(series));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void setSeries(Double... series) {
        try {
            getModel().setSeries(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(series));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}

