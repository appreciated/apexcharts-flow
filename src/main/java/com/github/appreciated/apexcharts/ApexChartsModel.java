package com.github.appreciated.apexcharts;

import com.github.appreciated.apexcharts.config.chart.*;
import com.github.appreciated.apexcharts.config.chart.yaxis.ApexYAxis;
import com.vaadin.flow.templatemodel.TemplateModel;

import java.util.Map;

public interface ApexChartsModel extends TemplateModel {
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

    //double[] getDoubleChartSeries();

    //void setDoubleChartSeries(double[] doubleChartSeries);

    Map<String, Double> getMapChartSeries();

    void setMapChartSeries(Map<String, Double> mapChartSeries);
}
