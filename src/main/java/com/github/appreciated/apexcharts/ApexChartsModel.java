package com.github.appreciated.apexcharts;

import com.github.appreciated.apexcharts.config.*;
import com.github.appreciated.apexcharts.config.encoders.*;
import com.vaadin.flow.templatemodel.Encode;
import com.vaadin.flow.templatemodel.TemplateModel;

import java.util.List;

public interface ApexChartsModel extends TemplateModel {

    ApexAnnotations getAnnotations();

    @Encode(ApexAnnotationsEncoder.class)
    void setAnnotations(ApexAnnotations annotations);

    ApexChart getChart();

    @Encode(ApexChartEncoder.class)
    void setChart(ApexChart chart);

    List<String> getColors();

    void setColors(List<String> colors);

    ApexDataLabels getDataLabels();

    @Encode(ApexDataLabelsEncoder.class)
    void setDataLabels(ApexDataLabels dataLabels);

    ApexFill getFill();

    @Encode(ApexFillEncoder.class)
    void setFill(ApexFill fill);

    ApexGrid getGrid();

    @Encode(ApexGridEncoder.class)
    void setGrid(ApexGrid grid);

    List<String> getLabels();

    void setLabels(List<String> labels);

    ApexLegend getLegend();

    @Encode(ApexLegendEncoder.class)
    void setLegend(ApexLegend legend);

    ApexMarkers getMarkers();

    @Encode(ApexMarkersEncoder.class)
    void setMarkers(ApexMarkers markers);

    ApexNoData getNoData();

    @Encode(ApexNoDataEncoder.class)
    void setNoData(ApexNoData noData);

    ApexPlotOptions getPlotOptions();

    @Encode(ApexPlotOptionsEncoder.class)
    void setPlotOptions(ApexPlotOptions plotOptions);

    List<ApexResponsive> getResponsive();

    void setResponsive(List<ApexResponsive> responsive);

    ApexStates getStates();

    void setStates(ApexStates states);

    ApexStroke getStroke();

    @Encode(ApexStrokeEncoder.class)
    void setStroke(ApexStroke stroke);

    ApexTitleSubtitle getSubtitle();

    @Encode(value = ApexTitleSubtitleEncoder.class)
    void setSubtitle(ApexTitleSubtitle subtitle);

    ApexTheme getTheme();

    @Encode(ApexThemeEncoder.class)
    void setTheme(ApexTheme theme);

    ApexTitleSubtitle getTitle();

    @Encode(value = ApexTitleSubtitleEncoder.class)
    void setTitle(ApexTitleSubtitle title);

    ApexTooltip getTooltip();

    @Encode(ApexTooltipEncoder.class)
    void setTooltip(ApexTooltip tooltip);

    String getYaxis();

    void setYaxis(String  yaxis);

    String getMapChartSeries();

    void setMapChartSeries(String mapChartSeries);

    void setDoubleChartSeries(List<Double> series);
}
