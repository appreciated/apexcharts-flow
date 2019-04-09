package com.github.appreciated.apexcharts.config.plotoptions;

public class Candlestick {
    Colors colors;
    Wick wick;

    class Colors {
        String upward;
        String downward;
    }

    class Wick {
        Boolean useFillColor;
    }
}
