package cmpe273.assignment1.queue;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import cmpe273.assignment1.stack.TestStackDemo;

public class TestRunner {

	public static void main(String[] args) 
	{
		Result result = JUnitCore.runClasses(TestStackDemo.class);
		for(Failure failure:result.getFailures())
		{
			System.out.println("Failure:"+ failure.getMessage());
		}
		System.out.println(result.wasSuccessful());
	}

}
