package cmpe273.assignment1.queue;

import static org.junit.Assert.*;

import java.util.LinkedList;

import java.util.Queue;

import org.junit.*;

public class TestCarWasher 
{
	@Test
	public void testAddCarToQueue()
	{
		Queue<String> testQueue= new LinkedList<String>();
		CarWasher washerTest=new CarWasher(testQueue);
		String testCar="Nissan Micra";
		washerTest.addCarToQueue(testCar);
		assertEquals(washerTest.exitCarQueue(),testCar);
	}
	
	@Test
	public void testExitCarQueue()
	{
		Queue<String> testQueue= new LinkedList<String>();
		CarWasher washerTest=new CarWasher(testQueue);
		String testCar1="Nissan Micra";
		String testCar2="Toyota Prius";
		washerTest.addCarToQueue(testCar1);
		washerTest.addCarToQueue(testCar2);
		assertEquals(washerTest.exitCarQueue(),testCar1);
		assertEquals(washerTest.exitCarQueue(),testCar2);
	}
}
