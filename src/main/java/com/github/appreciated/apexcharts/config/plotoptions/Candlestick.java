package com.github.appreciated.apexcharts.config.plotoptions;

import com.github.appreciated.apexcharts.config.plotoptions.candlestick.Colors;
import com.github.appreciated.apexcharts.config.plotoptions.candlestick.Wick;

public class Candlestick {
    private Colors colors;
    private Wick wick;

    public Candlestick() {
    }

    public Colors getColors() {
        return colors;
    }

    public Wick getWick() {
        return wick;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public void setWick(Wick wick) {
        this.wick = wick;
    }

}
