package com.example.scott.shoppingbasket;

/**
 * Created by scott on 26/11/2017.
 */

public class Item {

    String name;
    double value;
    boolean bogof;

    public Item(boolean buyOneGetOneFree) {
    }

    public Item(String itemName, double itemValue, boolean buyOneGetOneFree) {
        name = itemName;
        value = itemValue;
        bogof = buyOneGetOneFree;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isBuyOneGetOneFree() {
        return bogof;
    }

    public void setBuyOneGetOneFree(boolean buyOneGetOneFree) {
        this.bogof = buyOneGetOneFree;
    }
}
