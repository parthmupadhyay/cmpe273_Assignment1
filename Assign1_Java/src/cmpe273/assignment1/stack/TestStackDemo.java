package cmpe273.assignment1.stack;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class TestStackDemo 
{
	StackDemo testStack = new StackDemo(new Stack<Integer>());
	@Test
	public void testPush()
	{
		testStack.push(30);
		assertEquals(testStack.getElementOnTop(),30);
	}
	
	@Test
	public void testPop()
	{
		testStack.push(43);
		testStack.push(67);
		assertEquals(testStack.pop(),67);
		assertEquals(testStack.pop(),43);
	}
}
