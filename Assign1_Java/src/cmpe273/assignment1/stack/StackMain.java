package cmpe273.assignment1.stack;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) 
	{	
		Stack<Integer> stack= new Stack<Integer>();
		StackDemo demo = new StackDemo(stack);
		demo.push(10);
		demo.push(7);
		demo.push(77);
		System.out.println("Element on top of stack:"+demo.getElementOnTop());
		demo.pop();
		
	}

}
