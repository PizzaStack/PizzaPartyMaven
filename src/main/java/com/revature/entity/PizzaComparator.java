package com.revature.entity;

import java.util.Comparator;

public class PizzaComparator implements Comparator<Pizza>{

	@Override
	public int compare(Pizza o1, Pizza o2) {
		if(o1.getSize() < o2.getSize())
			return -1;
		else if (o1.getSize() > o2.getSize())
			return 1;
		else 
			return 0;
	}

}
