package com.example.scott.shoppingbasket;

/**
 * Created by scott on 26/11/2017.
 */

public class Person {

    private int funds;
    Basket myBasket;
    boolean hasLoyalty;

    public Person(Basket basket) {
        myBasket = basket;
        this.funds = 100;
        this.hasLoyalty = false;
    }

    public boolean isHasLoyalty() {
        return hasLoyalty;
    }

    public void setHasLoyalty(boolean hasLoyalty) {
        this.hasLoyalty = hasLoyalty;
    }

    public int getFunds() {
        return funds;
    }

    public void addFunds(int funds) {
        this.funds += funds;
    }

    public String getBasketItemNameByIndex(int i) {
        return myBasket.getItemList().get(i).getName();
    }

    public double getBasketItemValueByIndex(int i) {
        return myBasket.getItemList().get(i).getValue();
    }

    public void addItem(Item item) {
        myBasket.addItem(item);
    }
}
