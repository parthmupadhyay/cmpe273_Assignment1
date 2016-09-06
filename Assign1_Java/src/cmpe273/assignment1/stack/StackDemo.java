package cmpe273.assignment1.stack;

import java.util.Stack;

public class StackDemo 
{
	private Stack<Integer> stack;
	StackDemo(Stack<Integer> stack)
	{
		this.stack=stack;
	}
	
	public void push(int number)
	{
		this.stack.push(number);
		System.out.println(number +" pushed to top of stack");
		displayStack();
	}
	
	public int pop()
	{
		int poppedNumber=this.stack.pop();
		System.out.println(poppedNumber+" popped out of stack");
		return poppedNumber;
	}
		
	public int getElementOnTop()
	{
		return this.stack.peek();
	}
	
	private void displayStack()
	{
		String result="Stack contains : ";
		if(this.stack.isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			for(int number:this.stack)
			{
				result=result.concat(number+ " ");
			}
			System.out.println(result);
		}
	}
}
