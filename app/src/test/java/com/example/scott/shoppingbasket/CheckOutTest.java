package com.example.scott.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by scott on 26/11/2017.
 */

public class CheckOutTest {


    Item toothbrush;
    Item cologne;
    Basket basket1;
    Person person;
    CheckOut checkOut;

    @Before
    public void setup(){
        toothbrush = new Item("Toothbrush", 0.5, true);
        cologne = new Item("Cologne", 30, false);
        basket1 = new Basket();
        person = new Person(basket1);
        checkOut = new CheckOut(person);
    }

    @Test
    public void canTotalAndApplyBOGOFDiscounts(){
//        act
        person.addItem(toothbrush);
        person.addItem(toothbrush);
        person.addItem(cologne);
//        assert
        assertEquals(30.5, checkOut.getTotal());
    }

    @Test
    public void canTotalAndApplyLoyaltyDiscount(){
//        act
        person.addItem(toothbrush);
        person.addItem(toothbrush);
        person.addItem(cologne);
        person.setHasLoyalty(true);
//        assert
        assertEquals(30.5, checkOut.getTotal());

    }
}
