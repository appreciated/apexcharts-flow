package com.github.appreciated.apexcharts.config.plotoptions.bar;

public class DataLabels {
    private String position;
    private Integer maxItems;
    private boolean hideOverflowingLabels;
    private String orientation;
    private Total total;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    public boolean isHideOverflowingLabels() {
        return hideOverflowingLabels;
    }

    public void setHideOverflowingLabels(boolean hideOverflowingLabels) {
        this.hideOverflowingLabels = hideOverflowingLabels;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public DataLabels(String position) {
        this.position = position;
    }

    public DataLabels() {

    }
}
