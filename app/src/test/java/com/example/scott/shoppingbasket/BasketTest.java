package com.example.scott.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by scott on 26/11/2017.
 */

public class BasketTest {

    Item cologne;
    Item toothbrush;
    Basket basket1;


    @Before
    public void setup(){

        toothbrush = new Item("Toothbrush", 0.5, false);
        cologne = new Item("Cologne", 30, false);
        basket1 = new Basket();

    }

    @Test
    public void canAddItem(){
//        act
        basket1.addItem(cologne);
        basket1.addItem(toothbrush);

//        assert
        assertEquals("Cologne", basket1.getBasketItemNameByIndex(0));
        assertEquals("Toothbrush", basket1.getBasketItemNameByIndex(1));
    }

    @Test
    public void canGetBasketTotal(){
//        act
        basket1.addItem(cologne);
        basket1.addItem(toothbrush);
//        assert
        assertEquals(30.5, basket1.getTotal());
    }

}
