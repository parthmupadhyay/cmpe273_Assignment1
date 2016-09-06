package cmpe273.assignment1.interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCoffeeVendingMachine 
{
	CoffeeVendingMachine machineTest= new CoffeeVendingMachine();
	@Test
	public void testInsertMoney() 
	{
		machineTest.insertMoney(12);
		machineTest.insertMoney(30);
		machineTest.insertMoney(12.34645);
		assertEquals(12+30+12.34645, machineTest.getInsertedMoney(),0);
	}
	
	@Test
	public void testSelectItem()
	{
		machineTest.selectItem("xyz");
		machineTest.selectItem(Coffee.AMERICANO.name());
		for(String item : machineTest.getSelectedItems())
		{
			if(item.equals("xyz"))
			{
				fail("Invalid item added to cart");
			}
			else 			
			{
				assertEquals(Coffee.AMERICANO.name(),item);
			}	
		}
	}
	
	@Test
	public void testTotalCost()
	{
		machineTest.clear();
		machineTest.selectItem(Coffee.CAPPUCCINO.name());
		machineTest.selectItem(Coffee.EXPRESSO.name());
		
		double expectedCost= Coffee.CAPPUCCINO.price+Coffee.EXPRESSO.price;
		assertEquals(expectedCost,machineTest.getTotalCost(),0);
		machineTest.insertMoney(5);
		assertEquals(expectedCost-5,machineTest.getTotalCost(),0);
	}

}
