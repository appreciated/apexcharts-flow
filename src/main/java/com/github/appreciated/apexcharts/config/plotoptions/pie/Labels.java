package com.github.appreciated.apexcharts.config.plotoptions.pie;

public class Labels {
    private Boolean show;
    private Name name;
    private Value value;
    private Total total;


    public Labels() {
    }

    public Boolean getShow() {
        return show;
    }

    public Name getName() {
        return name;
    }

    public Value getValue() {
        return value;
    }

    public Total getTotal() {
        return total;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

}
