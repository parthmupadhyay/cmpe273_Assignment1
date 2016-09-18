package cmpe273.assignment1.queue;

import java.util.Queue;

public class CarWasher 
{
	private Queue<String> carQueue;
	CarWasher(Queue<String> carQueue)
	{
		this.carQueue= carQueue;
	}
	
	public void addCarToQueue(String car)
	{
		this.carQueue.add(car);
		System.out.println(car + " Added to car wash queue");
	}
	
	public void wash()
	{
		Object car=this.carQueue.peek();
		System.out.println("Washing car"+car.toString());
	}

	public String exitCarQueue()
	{
		System.out.println(this.carQueue.peek()+" is exiting carwash");
		return this.carQueue.remove();
	}
	
	public int getQueueLength()
	{
		return this.carQueue.size();
	}
}
