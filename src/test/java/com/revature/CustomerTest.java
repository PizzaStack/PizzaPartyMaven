package com.revature;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.revature.entity.*;

public class CustomerTest {
	
	@Test
	public void customerCanMakeOrder() {
		Customer customer = new Customer();
		customer.makeOrder();
	}
	
	@Test
	public void makeOrderWillCreateOrderObject() {
		Customer customer = new Customer();
		Order order = customer.makeOrder();
	}
	
	@Test
	public void customerGetsName() {
		Customer customer = new Customer();
		String testName = "Sam";
		customer.setName(testName);
//		assertEquals(customer.getName(), testName);
	}
	
	@Test
	public void customerGetsOrderId() {
		Customer customer = new Customer();
		Order order = customer.makeOrder();
//		order.getId();
	}
}
