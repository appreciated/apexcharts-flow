package com.github.appreciated.apexcharts.helper;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;

public class DateTimeCoordinate<X> extends Coordinate<X, Long> {

    public DateTimeCoordinate(X x, LocalDateTime... y) {
        super();
        ZoneId zoneId = ZoneId.systemDefault();
        setX(x);
        setY(Arrays.stream(y)
                .map(localDate -> localDate.atZone(zoneId).toInstant().toEpochMilli())
                .toArray(Long[]::new));
    }
    public DateTimeCoordinate(X x, Long... y) {
        super(x,y);
    }
}
