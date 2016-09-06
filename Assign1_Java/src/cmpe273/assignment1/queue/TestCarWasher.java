package cmpe273.assignment1.queue;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class TestCarWasher 
{
	@Test
	public void testAddCarToQueue()
	{
		List<String> testQueue= new ArrayList<String>();
		CarWasher washerTest=new CarWasher(testQueue);
		String testCar="Nissan Micra";
		washerTest.addCarToQueue(testCar);
		assertEquals(washerTest.exitCarQueue(),testCar);
	}
	
	@Test
	public void testExitCarQueue()
	{
		List<String> testQueue= new ArrayList<String>();
		CarWasher washerTest=new CarWasher(testQueue);
		String testCar1="Nissan Micra";
		String testCar2="Toyota Prius";
		washerTest.addCarToQueue(testCar1);
		washerTest.addCarToQueue(testCar2);
		assertEquals(washerTest.exitCarQueue(),testCar1);
		assertEquals(washerTest.exitCarQueue(),testCar2);
	}
}
