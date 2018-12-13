package com.revature.entity;

public class OnlineOrder extends Order {    

    public OnlineOrder(int orderId, String[] lineItems) {
        super(orderId, lineItems);
    }

    public void printReceipt(){
        //Do stuff
    }

    public void calculate() {
        
    }
}