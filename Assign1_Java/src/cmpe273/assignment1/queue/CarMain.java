package cmpe273.assignment1.queue;

import java.util.LinkedList;
import java.util.Queue;

public class CarMain {

	public static void main(String[] args) 
	{
		Queue<String> queue = new LinkedList<String>();
		CarWasher carWasher = new CarWasher(queue);
		carWasher.addCarToQueue("Honda City");
		carWasher.addCarToQueue("Toyota Prius");
		
		CarMain obj = new CarMain();
		obj.runCarWash(carWasher);
		
	}
	
	public void runCarWash(CarWasher cars)
	{
		int lenght=cars.getQueueLength();
		for(int i=0;i<lenght;i++)
		{
			cars.wash();
			cars.exitCarQueue();
		}
	}

}
