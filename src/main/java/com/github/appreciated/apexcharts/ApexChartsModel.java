package com.github.appreciated.apexcharts;

import com.github.appreciated.apexcharts.config.*;
import com.github.appreciated.apexcharts.encoders.*;
import com.vaadin.flow.templatemodel.Encode;
import com.vaadin.flow.templatemodel.TemplateModel;

import java.util.List;

public interface ApexChartsModel extends TemplateModel {

    Annotations getAnnotations();

    @Encode(AnnotationsEncoder.class)
    void setAnnotations(Annotations annotations);

    Chart getChart();

    @Encode(ChartEncoder.class)
    void setChart(Chart chart);

    String getColors();

    void setColors(String colors);

    DataLabels getDataLabels();

    @Encode(DataLabelsEncoder.class)
    void setDataLabels(DataLabels dataLabels);

    Fill getFill();

    @Encode(FillEncoder.class)
    void setFill(Fill fill);

    Grid getGrid();

    @Encode(GridEncoder.class)
    void setGrid(Grid grid);

    List<String> getLabels();

    void setLabels(List<String> labels);

    Legend getLegend();

    @Encode(LegendEncoder.class)
    void setLegend(Legend legend);

    Markers getMarkers();

    @Encode(MarkersEncoder.class)
    void setMarkers(Markers markers);

    NoData getNoData();

    @Encode(NoDataEncoder.class)
    void setNoData(NoData noData);

    PlotOptions getPlotOptions();

    @Encode(PlotOptionsEncoder.class)
    void setPlotOptions(PlotOptions plotOptions);

    String getResponsive();

    void setResponsive(String responsive);

    String getStates();

    void setStates(String states);

    Stroke getStroke();

    @Encode(StrokeEncoder.class)
    void setStroke(Stroke stroke);

    String getSubtitle();

    void setSubtitle(String subtitle);

    Theme getTheme();

    @Encode(ThemeEncoder.class)
    void setTheme(Theme theme);

    String getChartTitle();

    void setChartTitle(String chartTitle);

    Tooltip getTooltip();

    @Encode(TooltipEncoder.class)
    void setTooltip(Tooltip tooltip);

    String getYaxis();

    void setYaxis(String yaxis);

    String getSeries();

    void setSeries(String series);

    String getWidth();

    void setWidth(String width);

    String getHeight();

    void setHeight(String height);

    void setXaxis(String xaxis);

    String getXaxis();

    boolean getDebug();

    void setDebug(boolean responsive);
}
