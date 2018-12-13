package com.revature.entity;

public abstract class Order implements Calculatable {
    protected int orderId;
    protected double orderPrice;
    protected String[] lineItems;

    public Order(int orderId, String[] lineItems) {
        this.orderId = orderId;
        this.lineItems = lineItems;
        orderPrice = 0;
    }

    public Order() {
        
    }

    public abstract void printReceipt();
    
}
