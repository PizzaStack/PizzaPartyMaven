package com.revature.entity;

import java.util.*;

public class OnlineOrder extends Order {    

    public OnlineOrder(int orderId, List<String> lineItems) {
        super(orderId, lineItems);
    }

    public void printReceipt(){
        //Do stuff
    }

    public void calculate() {

    }
}