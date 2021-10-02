package com.github.appreciated.apexcharts.config.xaxis;

public enum TickPlacement {
    between("between"),
    on("on");
    private final String name;

    TickPlacement(String name) {
        this.name = name;
    }
}
