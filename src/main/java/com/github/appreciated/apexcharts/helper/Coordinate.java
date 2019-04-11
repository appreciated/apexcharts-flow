package com.github.appreciated.apexcharts.helper;

public class Coordinate<X, Y> {
    X x;
    Y[] y;

    public Coordinate(X x, Y... y) {
        this.x = x;
        this.y = y;
    }


    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public Y[] getY() {
        return y;
    }

    public void setY(Y[] y) {
        this.y = y;
    }
}
