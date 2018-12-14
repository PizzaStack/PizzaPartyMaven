package com.revature.service;

import java.util.List;

import com.revature.entity.OnlineOrder;
import com.revature.entity.Order;

public class OrderService implements Runnable {
	int id;
	List<String> lineItems;
	public static int counter = 0;

	public OrderService(int id, List<String> lineItems) {
		super();
		this.id = id;
		this.lineItems = lineItems;
	}

	public Order createOrder(int id, List<String> lineItems) {
		return new OnlineOrder(id, lineItems);
	}
	
	public static synchronized void addCounter() {
		for (int i = 0; i < 10000; i++)
			counter++;
	}

	@Override
	public void run() {
		addCounter();
		System.out.println("Creating order... " + counter);
		createOrder(id, lineItems);
	}

}
