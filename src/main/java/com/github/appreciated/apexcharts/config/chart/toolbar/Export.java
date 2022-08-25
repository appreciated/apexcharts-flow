package com.github.appreciated.apexcharts.config.chart.toolbar;

public class Export {
    private Csv csv;
    private Svg svg;
    private Png png;

    public Export() {
    }

    public Csv getCsv() {
        return csv;
    }

    public void setCsv(Csv csv) {
        this.csv = csv;
    }

    public Svg getSvg() {
        return svg;
    }

    public void setSvg(Svg svg) {
        this.svg = svg;
    }

    public Png getPng() {
        return png;
    }

    public void setPng(Png png) {
        this.png = png;
    }
}
