package com.example.scott.shoppingbasket;

/**
 * Created by scott on 26/11/2017.
 */

public class CheckOut {


    Person person;
    double total;

    public CheckOut(Person personInstance) {
        person = personInstance;
        total = 0;
    }



    public double getTotal() {

        return total;
    }
}
