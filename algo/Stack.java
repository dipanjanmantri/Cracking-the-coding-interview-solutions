package algo;

import java.util.Arrays;

public class Stack {

	private String[] stackArray;
	private int stackSize;
	private int top=-1;
	
	public Stack(int dim)
	{
		this.stackSize=dim;
		stackArray=new String[dim];
		
		Arrays.fill(stackArray, "Hi");
		 
	}
	
	public void push(String input)
	{
		if(top+1<stackSize)
		{
			top++;
			stackArray[top]=input;
		}else{
			System.out.println("sorry, no space the stack is full");
		}
		
	}
	
	public String pop()
	{
		String s="";
		if(top>=0)
		{
			s=stackArray[top];
			top--;
			
		}else
		{
			System.out.println("sorry, the stack is empty");
			s="-1";
		}
		return s;
		
	}
	
	public String peek()
	{
		return stackArray[top];
	}

	void display() {
		while(top>=0)
		{
			System.out.println(stackArray[top]);
			top--;
		}
		
	}
	
	
}
