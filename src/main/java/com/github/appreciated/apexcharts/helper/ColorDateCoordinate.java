package com.github.appreciated.apexcharts.helper;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;

public class ColorDateCoordinate<X> extends ColorCoordinate<String,X, Long> {

    public ColorDateCoordinate(String fillColor,X x, LocalDate... y) {
        super();
        setFillColor(fillColor);
        setX(x);
        ZoneId zoneId = ZoneId.systemDefault();
        setY(Arrays.stream(y)
                .map(localDate -> localDate.atStartOfDay(zoneId).toInstant().toEpochMilli())
                .toArray(Long[]::new));

    }

    public ColorDateCoordinate(String fillColor, X x, Long... y) {
        super(fillColor,x,y);
    }
}
