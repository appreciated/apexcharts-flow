package com.github.appreciated.apexcharts;

import com.github.appreciated.apexcharts.config.*;
import com.github.appreciated.apexcharts.config.toolbar.Toolbar;
import com.github.appreciated.apexcharts.config.zoom.Zoom;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("apex-charts-wrapper")
@HtmlImport("frontend://com/github/appreciated/apexcharts/apexcharts-wrapper.html")
public class ApexCharts extends PolymerTemplate<ApexCharts.ApexChartModel> implements HasSize {

    Type type;
    String foreColor;
    String fontFamily;
    String background;
    Number offsetX;
    Number offsetY;
    DropShadow dropShadow;
    Brush brush;
    String id;
    //ApexLocale[] locales;
    String defaultLocale;
    Sparkline sparkline;
    Boolean stacked;
    StackType stackType;
    Toolbar toolbar;
    Zoom zoom;
    Selection selection;
    Animations animations;

    public ApexCharts() {
        setWidth("300px");
        setHeight("300px");
    }

    public interface ApexChartModel extends TemplateModel {

    }
}

