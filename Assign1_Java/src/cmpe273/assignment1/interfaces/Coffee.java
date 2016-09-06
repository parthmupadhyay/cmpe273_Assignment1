package cmpe273.assignment1.interfaces;

import java.util.ArrayList;
import java.util.List;

public enum Coffee 
{
	EXPRESSO(3),
	LATTE(2.95),
	CAPPUCCINO(2.15),
	MOCHA(3.95),
	AMERICANO(2.75);
	
	
	Coffee(double price)
	{
		this.price=price;
	}
	
	double price;
	
	public static List<String> coffeeProducts()
	{
		List<String> coffeeList = new ArrayList<String>();
		Coffee coffee[]=values();
		for (int i = 0; i < coffee.length; i++) {
	        coffeeList.add(coffee[i].name());
	    }
		return coffeeList;
	}
}
