package com.github.appreciated.apexcharts;

import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("apex-charts")
@HtmlImport("frontend://com/github/appreciated/apexcharts/apexcharts.html")
public class ApexChart extends PolymerTemplate<ApexChart.ApexChartModel> implements HasSize {

    public ApexChart() {
            setWidth("200px");
            setHeight("200px");
    }

    public interface ApexChartModel extends TemplateModel {
       // double getAnimate();

       // void setAnimate(double progress);
    }
}

