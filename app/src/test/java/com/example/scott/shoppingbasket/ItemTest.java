package com.example.scott.shoppingbasket;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by scott on 27/11/2017.
 */

public class ItemTest {

    Item cologne;

    @Test
    public void canGetItemName() throws Exception {
        cologne = new Item("Cologne", 30, false);
        assertEquals("Cologne", cologne.getName());
    }
}
