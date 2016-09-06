package cmpe273.assignment1.multithreading;

public class MultithreadingMain {

	public static void main(String[] args) 
	{
		Alphabet alpha = new Alphabet();
		MultithreadingDemo thread1 = new MultithreadingDemo(alpha,"Thread1");
		MultithreadingDemo thread2 = new MultithreadingDemo(alpha,"Thread2");
		thread1.start();
		thread2.start();
	}

}
