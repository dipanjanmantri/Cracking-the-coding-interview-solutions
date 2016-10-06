package algo;

import java.util.Scanner;

public class Stack_implementation {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Stack_1 stack=new Stack_1(9);
		char ch;
		System.out.println("please enter the stack on which you want to push");
	    ch=s.next().charAt(0);
	    if(ch=='a')
	    {
	          stack.push1(9);
	          stack.push1(8);
	          stack.push1(7);
	          stack.display_stack1();
	        
	          
	    }else if(ch=='b')
	    {
	    	stack.push2(6);
	    	stack.push2(5);
	    	stack.push2(4);
	    	stack.display_stack2();
	    }else if(ch=='c')
	    {
	    	stack.push3(3);
	    	stack.push3(2);
	    	stack.push3(1);
	    	stack.display_stack3();
	    }
	    
	    System.out.println("say if you would like to pop");
	    char ch1=s.next().charAt(0);
	    if(ch1=='y')
	    {
	    	System.out.println("which stack you wanna pop");
	    	char ch2=s.next().charAt(0);
	    	if(ch2=='a')
	    	{
	    		stack.pop1();
	    		stack.display_stack1();
	    	}
	    	if(ch2=='b')
	    	{
	    		stack.pop2();
	    		stack.display_stack2();
	    	}
	    	if(ch2=='c')
	    	{
	    		stack.pop3();
	    		stack.display_stack3();
	    	}
	    	
	    }
	    
	    
	    
		
	}
}
