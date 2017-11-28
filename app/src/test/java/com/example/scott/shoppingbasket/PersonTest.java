package com.example.scott.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by scott on 26/11/2017.
 */

public class PersonTest {

    Person person;
    Item cologne;
    Item toothbrush;
    Basket basket1;
//    ArrayList<Item> itemList;

    @Before
    public void setUp(){
        toothbrush = new Item("Toothbrush", 0.5, false);
        cologne = new Item("Cologne", 30, false);
//        itemList = new ArrayList<>();
        basket1 = new Basket();
        person = new Person(basket1);
    }

    @Test
    public void canGetFunds(){
//        arrange
//        act
//        assert
        assertEquals(100, person.getFunds());
    }

    @Test
    public void canAddItemToBasket(){
//        act
        person.addItem(cologne);
//        assert
        assertEquals("Cologne", person.getBasketItemNameByIndex(0));
        assertEquals(30.0, person.getBasketItemValueByIndex(0));
    }


}
