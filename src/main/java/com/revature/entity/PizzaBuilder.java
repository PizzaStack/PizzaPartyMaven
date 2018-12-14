package com.revature.entity;

public class PizzaBuilder {
	
	private int size = 12;
	private String crust = "Regular";
	private Sauce sauce = Sauce.MARINARA;
	
	public PizzaBuilder withSize(int size) {
		this.size = size;
		return this;
	}
	
	public PizzaBuilder withCrust(String crust) {
		this.crust = crust;
		return this;
	}
	
	public PizzaBuilder withSauce(Sauce sauce) {
		this.sauce = sauce;
		return this;
	}
	
	public Pizza buildPizza() {
		return new Pizza(size, crust, sauce);
	}

}
