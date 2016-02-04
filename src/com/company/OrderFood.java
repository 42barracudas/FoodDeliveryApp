package com.company;

/**
 * Created by Vitaliy on 2/3/2016.
 */
public class OrderFood {

    private String ordered = "";

    public OrderFood(String ordered) {
        this.ordered = ordered;
    }

    private OrderFood orderFood(String orderName){
        this.ordered += orderName;
        return new OrderFood(ordered);
    }
}
