package com.revature.entity;

public class Pizza implements Comparable<Pizza>{
	private int size;
	private String crust;
	private Sauce sauce;

	public Pizza(int size, String crust, Sauce sauce) {
		this.size = size;
		this.crust = crust;
		this.sauce = sauce;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	@Override
	public int compareTo(Pizza o) {
		if (this.size < o.size)
			return -1;
		else if (this.size > o.size)
			return 1;
		return 0;
	}

}
