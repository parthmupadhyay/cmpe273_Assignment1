package cmpe273.assignment1.multithreading;

public class MultithreadingDemo extends Thread
{
	private Thread t;
	private Alphabet alphabet;
	private String threadName;
	
	public MultithreadingDemo(Alphabet alphabet,String name) 
	{
		this.alphabet=alphabet;
		this.threadName=name;
	}
	
	@Override
	public void run() 
	{
		System.out.println(this.threadName+" Started");
		synchronized (alphabet) 
		{
			alphabet.printAlphabets();
		}
		System.out.println("Thread:"+ this.threadName +" completed");
	}
	@Override
	public synchronized void start() 
	{
		t= new Thread(this,threadName);
		t.start();
	}

}
