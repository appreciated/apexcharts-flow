package com.github.appreciated.apexcharts;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class ExampleHolderView  extends HorizontalLayout {


    private final HorizontalLayout holder;

    public ExampleHolderView() {
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        holder = new HorizontalLayout();
        holder.setWidth("500px");
        holder.setHeight("500px");
        add(holder);
    }


    public HorizontalLayout getHolder() {
        return holder;
    }
}
