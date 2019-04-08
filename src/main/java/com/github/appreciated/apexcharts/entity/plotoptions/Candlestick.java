package com.github.appreciated.apexcharts.entity.plotoptions;

class Candlestick {
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
