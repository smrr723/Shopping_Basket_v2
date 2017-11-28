package com.example.scott.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by scott on 26/11/2017.
 */

public class Basket {

    ArrayList<Item> itemList;
    double total;

    public Basket() {
        itemList = new ArrayList<>();
        total = 0;
    }

    public void addItem(Item item) {
        itemList.add(item);
        this.total += item.getValue();
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public String getBasketItemNameByIndex(int i) {
        return this.getItemList().get(i).getName();
    }

    public double getBasketItemValueByIndex(int i) {
        return this.getItemList().get(i).getValue();
    }

    public double getTotal() {
        return total;
//        add BOGOF discount logic here, or in addItem
//        loop through arrayList, for each item, if BOGOF = true for said item,
//        divide total by 2 & add 1 if there's a remainder using % operator.
    }
}
