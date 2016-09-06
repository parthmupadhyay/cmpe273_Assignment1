package cmpe273.assignment1.queue;

import java.util.ArrayList;
import java.util.List;

public class CarMain {

	public static void main(String[] args) 
	{
		List<String> queue = new ArrayList<String>();
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
