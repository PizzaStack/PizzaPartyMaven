package com.revature.entity;

import java.util.List;

public abstract class Order implements Calculatable {
    protected int orderId;
    protected double orderPrice;
    protected List<String> lineItems;

    public Order(int orderId, List<String> lineItems) {
        this.orderId = orderId;
        this.lineItems = lineItems;
        orderPrice = 0;
    }

    public Order() {
        
    }

    public abstract void printReceipt();
    
}
