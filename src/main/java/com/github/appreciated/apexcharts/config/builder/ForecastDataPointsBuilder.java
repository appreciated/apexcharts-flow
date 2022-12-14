package com.github.appreciated.apexcharts.config.builder;

import com.github.appreciated.apexcharts.config.ForecastDataPoints;

public class ForecastDataPointsBuilder {
    private Integer count;

    public static ForecastDataPointsBuilder get() {
        return new ForecastDataPointsBuilder();
    }


    public ForecastDataPointsBuilder withCount(Integer count) {
        this.count = count;
        return this;
    }


    public ForecastDataPoints build() {
        ForecastDataPoints forecast = new ForecastDataPoints();
        if (count != null) {
            forecast.setCount(count);
        }
        return forecast;
    }

}
