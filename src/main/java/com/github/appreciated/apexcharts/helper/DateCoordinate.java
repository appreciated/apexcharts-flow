package com.github.appreciated.apexcharts.helper;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;

public class DateCoordinate<X> extends Coordinate<X, Long> {

    public DateCoordinate(X x, LocalDate... y) {
        super();
        setX(x);
        ZoneId zoneId = ZoneId.systemDefault();
        setY(Arrays.stream(y)
                .map(localDate -> localDate.atStartOfDay(zoneId).toInstant().toEpochMilli())
                .toArray(Long[]::new));

    }

    public DateCoordinate(X x, Long... y) {
        super(x,y);
    }
}
