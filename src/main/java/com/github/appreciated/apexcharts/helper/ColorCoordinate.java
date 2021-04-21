package com.github.appreciated.apexcharts.helper;

public class ColorCoordinate<String,X, Y> {
    private X x;
    private Y[] y;
    private String fillColor;
    
    public ColorCoordinate(String fillColor,X x, Y[] y) {
		this.x = x;
		this.y = y;
		this.fillColor = fillColor;
	}

    public ColorCoordinate() {
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
    
    public String getFillColor() {
 		return fillColor;
 	}

 	public void setFillColor(String fillColor) {
 		this.fillColor = fillColor;
 	}
}
