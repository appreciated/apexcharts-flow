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
@NpmPackage(value = "apexcharts", version = "3.17.0")
@NpmPackage(value = "onecolor", version = "3.1.0")
@JsModule("./com/github/appreciated/apexcharts/apexcharts-wrapper.js")
@CssImport(value = "./com/github/appreciated/apexcharts/apexcharts-wrapper-styles.css", id = "apex-charts-style")
public class ApexCharts extends PolymerTemplate<ApexChartsModel> implements HasSize, HasStyle, HasTheme {
    private ObjectMapper objectMapper;

    public ApexCharts() {
        this.objectMapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
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
            getModel().setColors(objectMapper.writeValueAsString(colors));
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
            getModel().setResponsive(objectMapper.writeValueAsString(responsive));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void setStates(States states) {
        try {
            getModel().setStates(objectMapper.writeValueAsString(states));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void setStroke(Stroke stroke) {
        getModel().setStroke(stroke);
    }

    public void setSubtitle(TitleSubtitle subtitle) {
        try {
            getModel().setSubtitle(objectMapper.writeValueAsString(subtitle));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void setTheme(Theme theme) {
        getModel().setTheme(theme);
    }

    public void setTitle(TitleSubtitle title) {
        try {
            getModel().setChartTitle(objectMapper.writeValueAsString(title));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void setTooltip(Tooltip tooltip) {
        getModel().setTooltip(tooltip);
    }

    public void setXaxis(XAxis xaxis) {
        try {
            getModel().setXaxis(objectMapper.writeValueAsString(xaxis));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void setYaxis(YAxis yaxis) {
        try {
            getModel().setYaxis(objectMapper.writeValueAsString(yaxis));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method will be called automatically and does not require to be called manually
     */
    public void render() {
        getElement().callJsFunction("render");
    }

    /**
     * To enable client-side debug logs
     * @param enabled
     */
    public void setDebug(boolean enabled) {
        getModel().setDebug(enabled);
    }

    /**
     * Method to set update the data for all chart types except {@link com.github.appreciated.apexcharts.config.chart.Type#pie} and {@link com.github.appreciated.apexcharts.config.chart.Type#donut}.
     * For these both types use setSeries{@link #setSeries(Double[])}
     * @param series the data series to update to the Chart with
     */
    public void updateSeries(Double... series) {
        setSeries(series);
        getElement().callJsFunction("updateData");
    }

    /**
     * Method to set update the data for all chart types except {@link com.github.appreciated.apexcharts.config.chart.Type#pie} and {@link com.github.appreciated.apexcharts.config.chart.Type#donut}.
     * For all other chart types use setSeries{@link #setSeries(Series[])}
     * @param series the data series to update to the Chart with
     */
    public void updateSeries(Series... series) {
        setSeries(series);
        getElement().callJsFunction("updateData");
    }
    /**
     * Method to set update the data for all chart types except {@link com.github.appreciated.apexcharts.config.chart.Type#pie} and {@link com.github.appreciated.apexcharts.config.chart.Type#donut}.
     * For all other chart types use setSeries{@link #setSeries(Series[])}
     * @param animate sets the animation while updating, either false (off) or true (on)
     * @param series the data series to update to the Chart with
     */
    public void updateSeries(Boolean animate, Series... series) {
        setSeries(series);
        getElement().callJsFunction("updateData", animate);
    }

    /**
     * Method to set the data for all chart types except {@link com.github.appreciated.apexcharts.config.chart.Type#pie} and {@link com.github.appreciated.apexcharts.config.chart.Type#donut}.
     * For these both types use setSeries{@link #setSeries(Double[])}
     * @param series the data series to assign to the Chart
     */
    public void setSeries(Series... series) {
        try {
            getModel().setSeries(objectMapper.writeValueAsString(series));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to set the data for {@link com.github.appreciated.apexcharts.config.chart.Type#pie} and {@link com.github.appreciated.apexcharts.config.chart.Type#donut}.
     * For all other chart types use setSeries{@link #setSeries(Series[])}
     * @param series the data series to assign to the Chart
     */
    public void setSeries(Double... series) {
        try {
            getModel().setSeries(objectMapper.writeValueAsString(series));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to set a custom {@link ObjectMapper} used for customizing object serialization.
     * Usually, this objectMapper should set {@link JsonInclude.Include#NON_NULL}.
     *
     * @param objectMapper the objectMapper to use
     */
    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
}

