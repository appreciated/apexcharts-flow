package com.github.appreciated.apexcharts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.appreciated.apexcharts.config.Annotations;
import com.github.appreciated.apexcharts.config.Chart;
import com.github.appreciated.apexcharts.config.DataLabels;
import com.github.appreciated.apexcharts.config.Fill;
import com.github.appreciated.apexcharts.config.Grid;
import com.github.appreciated.apexcharts.config.Legend;
import com.github.appreciated.apexcharts.config.Markers;
import com.github.appreciated.apexcharts.config.NoData;
import com.github.appreciated.apexcharts.config.PlotOptions;
import com.github.appreciated.apexcharts.config.Responsive;
import com.github.appreciated.apexcharts.config.States;
import com.github.appreciated.apexcharts.config.Stroke;
import com.github.appreciated.apexcharts.config.Theme;
import com.github.appreciated.apexcharts.config.TitleSubtitle;
import com.github.appreciated.apexcharts.config.Tooltip;
import com.github.appreciated.apexcharts.config.XAxis;
import com.github.appreciated.apexcharts.config.YAxis;
import com.github.appreciated.apexcharts.helper.Series;

public class ApexChartsBuilder {

    private Chart chart;
    private Annotations annotations;
    private String[] colors;
    private DataLabels dataLabels;
    private Fill fill;
    private Grid grid;
    private String[] labels;
    private Legend legend;
    private Markers markers;
    private NoData noData;
    private PlotOptions plotOptions;
    private Responsive[] responsive;
    private States states;
    private Stroke stroke;
    private TitleSubtitle subtitle;
    private Theme theme;
    private TitleSubtitle title;
    private Tooltip tooltip;
    private XAxis xaxis;
    private YAxis[] yaxis;
    private Series[] series;
    private Double[] doubleSeries;
    private boolean debug;
    private ObjectMapper objectMapper;

    public ApexChartsBuilder() {
    }

    public ApexChartsBuilder(ApexCharts apexCharts) {
    }

    public static ApexChartsBuilder get(ApexCharts apexCharts) {
        return new ApexChartsBuilder();
    }

    public static ApexChartsBuilder get() {
        return new ApexChartsBuilder();
    }

    public ApexChartsBuilder withAnnotations(Annotations annotations) {
        this.annotations = annotations;
        return this;
    }

    public ApexChartsBuilder withChart(Chart chart) {
        this.chart = chart;
        return this;
    }

    /**
     *
     * @param colors a string containing a color in hex or rgb/rgba format. Color names are not supported.
     * @return ApexChartsBuilder
     */
    public ApexChartsBuilder withColors(String... colors) {
        this.colors = colors;
        return this;
    }

    public ApexChartsBuilder withDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public ApexChartsBuilder withFill(Fill fill) {
        this.fill = fill;
        return this;
    }

    public ApexChartsBuilder withGrid(Grid grid) {
        this.grid = grid;
        return this;
    }

    public ApexChartsBuilder withLabels(String... labels) {
        this.labels = labels;
        return this;
    }

    public ApexChartsBuilder withLegend(Legend legend) {
        this.legend = legend;
        return this;
    }

    public ApexChartsBuilder withMarkers(Markers markers) {
        this.markers = markers;
        return this;
    }

    public ApexChartsBuilder withNoData(NoData noData) {
        this.noData = noData;
        return this;
    }

    public ApexChartsBuilder withPlotOptions(PlotOptions plotOptions) {
        this.plotOptions = plotOptions;
        return this;
    }

    public ApexChartsBuilder withResponsive(Responsive... responsive) {
        this.responsive = responsive;
        return this;
    }

    public ApexChartsBuilder withStates(States states) {
        this.states = states;
        return this;
    }

    public ApexChartsBuilder withStroke(Stroke stroke) {
        this.stroke = stroke;
        return this;
    }

    public ApexChartsBuilder withSubtitle(TitleSubtitle subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public ApexChartsBuilder withTheme(Theme theme) {
        this.theme = theme;
        return this;
    }

    public ApexChartsBuilder withDebug(boolean debug) {
        this.debug = debug;
        return this;
    }

    public ApexChartsBuilder withTitle(TitleSubtitle title) {
        this.title = title;
        return this;
    }

    public ApexChartsBuilder withTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public ApexChartsBuilder withXaxis(XAxis xaxis) {
        this.xaxis = xaxis;
        return this;
    }

    public ApexChartsBuilder withYaxis(YAxis... yaxis) {
        this.yaxis = yaxis;
        return this;
    }

    /**
     * Method to set the data for all chart types except {@link com.github.appreciated.apexcharts.config.chart.Type#pie} and
     * {@link com.github.appreciated.apexcharts.config.chart.Type#donut}.
     * For these both types use withSeries{@link #withSeries(Double[])}
     * 
     * @param series the date series to assign to the Chart
     * @return the builder
     */
    public ApexChartsBuilder withSeries(Series... series) {
        this.series = series;
        return this;
    }

    /**
     * Method to set the data for {@link com.github.appreciated.apexcharts.config.chart.Type#pie} and
     * {@link com.github.appreciated.apexcharts.config.chart.Type#donut}.
     * For all other chart types use withSeries{@link #withSeries(Series[])}
     * 
     * @param series the date series to assign to the Chart
     * @return the builder
     */
    public ApexChartsBuilder withSeries(Double... series) {
        doubleSeries = series;
        return this;
    }

    /**
     * Method to set a custom {@link ObjectMapper} used for customizing object serialization.
     * Usually, this objectMapper should set {@link JsonInclude.Include#NON_NULL}.
     *
     * @param objectMapper the objectMapper to use
     * @return ApexChartsBuilder the fluent instance
     */
    public ApexChartsBuilder withObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        return this;
    }

    public ApexCharts build() {
        ApexCharts apexCharts = objectMapper == null ? new ApexCharts() : new ApexCharts(objectMapper);
        if (annotations != null) {
            apexCharts.setAnnotations(annotations);
        }
        if (chart != null) {
            apexCharts.setChart(chart);
        }
        if (colors != null) {
            apexCharts.setColors(colors);
        }
        if (dataLabels != null) {
            apexCharts.setDataLabels(dataLabels);
        }
        if (fill != null) {
            apexCharts.setFill(fill);
        }
        if (grid != null) {
            apexCharts.setGrid(grid);
        }
        if (labels != null) {
            apexCharts.setLabels(labels);
        }
        if (legend != null) {
            apexCharts.setLegend(legend);
        }
        if (markers != null) {
            apexCharts.setMarkers(markers);
        }
        if (noData != null) {
            apexCharts.setNoData(noData);
        }
        if (plotOptions != null) {
            apexCharts.setPlotOptions(plotOptions);
        }
        if (responsive != null) {
            apexCharts.setResponsive(responsive);
        }
        if (states != null) {
            apexCharts.setStates(states);
        }
        if (stroke != null) {
            apexCharts.setStroke(stroke);
        }
        if (subtitle != null) {
            apexCharts.setSubtitle(subtitle);
        }
        if (theme != null) {
            apexCharts.setTheme(theme);
        }
        if (title != null) {
            apexCharts.setTitle(title);
        }
        if (tooltip != null) {
            apexCharts.setTooltip(tooltip);
        }
        if (xaxis != null) {
            apexCharts.setXaxis(xaxis);
        }
        if (yaxis != null) {
            apexCharts.setYaxis(yaxis);
        }
        apexCharts.setDebug(debug);
        if (series != null) {
            apexCharts.setSeries(series);
        } else if (doubleSeries != null) {
            apexCharts.setSeries(doubleSeries);
        }
        return apexCharts;
    }
}
