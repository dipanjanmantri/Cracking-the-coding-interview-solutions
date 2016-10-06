package algo;

public class Stack_with_queue {

	public static void main(String[] args)
	{
		Stack_4 stack1=new Stack_4(4);
		Stack_4 stack2=new Stack_4(4);
		
		
		for(int i=1;i<=4;i++)
		{
			stack1.push(i);
		}
		
		stack1.display();
		//System.out.println(stack2.top);
		for(int i=1;i<=4;i++)
		{
			int num=stack1.pop();
			stack2.push(num);
		}
		stack2.display();
		
		System.out.println("Implementation of a queue using two stacks");
		System.out.println("The program shows that FIFO is still valid using two stacks");
		
	    for(int i=1;i<=4;i++)
	    {
	    	int num=stack2.pop();
	    	System.out.print(num+" ");
	    }
	    
	    System.out.println();
	    
	    
	
		
	}
}
