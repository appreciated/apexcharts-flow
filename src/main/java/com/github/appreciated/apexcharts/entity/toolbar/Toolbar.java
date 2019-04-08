package com.github.appreciated.apexcharts.entity.toolbar;

public class Toolbar {
    Boolean show;
    Tools tools;
    class Tools {
        String download;
        String selection;
        String zoom;
        String zoomin;
        String zoomout;
        String pan;
        String reset;
    }
    AutoSelected autoSelected;
    enum AutoSelected {
        zoom("zoom"),
        selection("selection"),
        pan("pan");
        private String name;
        AutoSelected(String name){
            this.name = name;
        }
    }
}
