package com.github.appreciated.apexcharts;

import com.github.appreciated.apexcharts.config.*;
import com.github.appreciated.apexcharts.config.encoders.*;
import com.vaadin.flow.templatemodel.Encode;
import com.vaadin.flow.templatemodel.TemplateModel;

import java.util.List;
import java.util.Map;

public interface ApexChartsModel extends TemplateModel {

    ApexAnnotations getAnnotations();

    //@Encode(JsonEncoder.class)
    void setAnnotations(ApexAnnotations annotations);

    ApexChart getChart();

    //@Encode(JsonEncoder.class)
    void setChart(ApexChart chart);

    List<String> getColors();

    void setColors(List<String> colors);

    ApexDataLabels getDataLabels();

    //@Encode(JsonEncoder.class)
    void setDataLabels(ApexDataLabels dataLabels);

    ApexFill getFill();

   // @Encode(JsonEncoder.class)
    void setFill(ApexFill fill);

    ApexGrid getGrid();

  //  @Encode(JsonEncoder.class)
    void setGrid(ApexGrid grid);

    List<String> getLabels();

    void setLabels(List<String> labels);

    ApexLegend getLegend();

    @Encode(ApexLegendEncoder.class)
    void setLegend(ApexLegend legend);

    ApexMarkers getMarkers();

   // @Encode(JsonEncoder.class)
    void setMarkers(ApexMarkers markers);

    ApexNoData getNoData();


    //@Encode(JsonEncoder.class)
    void setNoData(ApexNoData noData);

    ApexPlotOptions getPlotOptions();

    @Encode(ApexPlotOptionsEncoder.class)
    void setPlotOptions(ApexPlotOptions plotOptions);

    List<ApexResponsive> getResponsive();

    //@Encode(JsonEncoder.class)
    void setResponsive(List<ApexResponsive> responsive);

    ApexStates getStates();

    //@Encode(JsonEncoder.class)
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

    ApexXAxis getXaxis();

    //@Encode(JsonEncoder.class)
    void setXaxis(ApexXAxis xaxis);

    String getYaxis();

    void setYaxis(String  yaxis);

    //double[] getDoubleChartSeries();

    //void setDoubleChartSeries(double[] doubleChartSeries);

    Map<String, Double> getMapChartSeries();

   // @Encode(JsonEncoder.class)
    void setMapChartSeries(Map<String, Double> mapChartSeries);
}
