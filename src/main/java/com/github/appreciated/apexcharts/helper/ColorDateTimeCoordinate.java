package com.github.appreciated.apexcharts.helper;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;

public class ColorDateTimeCoordinate<X> extends ColorCoordinate<String,X, Long> {

    public ColorDateTimeCoordinate(String fillColor, X x, LocalDateTime... y) {
        super();
        ZoneId zoneId = ZoneId.systemDefault();
        setFillColor(fillColor);
        setX(x);
        setY(Arrays.stream(y)
                .map(localDate -> localDate.atZone(zoneId).toInstant().toEpochMilli())
                .toArray(Long[]::new));
    }
    public ColorDateTimeCoordinate(String fillColor, X x, Long... y) {
        super(fillColor,x,y);
    }
}
