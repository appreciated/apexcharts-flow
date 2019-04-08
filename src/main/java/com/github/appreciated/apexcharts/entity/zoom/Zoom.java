package com.github.appreciated.apexcharts.entity.zoom;

public class Zoom {
    Boolean enabled;
    Type type;
    enum Type {
        x("x"),
        y("y"),
        xy("xy");
        private String name;
        Type(String name){
            this.name = name;
        }
    }
    ZoomedArea zoomedArea;
    class ZoomedArea {
        Fill fill;
        class Fill {
            String color;
            Number opacity;
        }
        Stroke stroke;
        class Stroke {
            String color;
            Number opacity;
            Number width;
        }
    }
}