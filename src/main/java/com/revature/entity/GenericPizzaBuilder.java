package com.revature.entity;

import java.util.function.Consumer;

public class GenericPizzaBuilder {
	public int size = 12;
	public String crust = "Regular";
	public Sauce sauce = Sauce.MARINARA;
	
	public GenericPizzaBuilder with(Consumer<GenericPizzaBuilder> builderFunction) {
		builderFunction.accept(this);
		return this;
	}
	
	public Pizza buildPizza() {
		return new Pizza(size, crust, sauce);
	}

}
