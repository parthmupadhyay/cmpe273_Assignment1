package cmpe273.assignment1.queue;

import java.util.List;

public class CarWasher 
{
	private List<String> carQueue;
	CarWasher(List<String> carQueue)
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
		Object car=this.carQueue.get(0);
		System.out.println("Washing car"+car.toString());
	}

	public String exitCarQueue()
	{
		System.out.println(this.carQueue.get(0)+" is exiting carwash");
		return this.carQueue.remove(0);
	}
	
	public int getQueueLength()
	{
		return this.carQueue.size();
	}
}
