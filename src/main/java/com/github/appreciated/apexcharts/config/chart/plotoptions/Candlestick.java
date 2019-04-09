package com.github.appreciated.apexcharts.config.chart.plotoptions;

import com.github.appreciated.apexcharts.config.chart.plotoptions.candlestick.Colors;
import com.github.appreciated.apexcharts.config.chart.plotoptions.candlestick.Wick;

public class Candlestick {
    Colors colors;
    Wick wick;

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public Wick getWick() {
        return wick;
    }

    public void setWick(Wick wick) {
        this.wick = wick;
    }
}
