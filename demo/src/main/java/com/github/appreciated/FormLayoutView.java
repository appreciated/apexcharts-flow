package com.github.appreciated;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "form-layout")
public class FormLayoutView extends FormLayout {
    public FormLayoutView() {
        ExampleChartGenerator generator = new ExampleChartGenerator();
        for (Component component : generator.getCharts()) {
            VerticalLayout wrapper = new VerticalLayout(new Div(component));
            wrapper.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
            add(component);
        }
    }
}
