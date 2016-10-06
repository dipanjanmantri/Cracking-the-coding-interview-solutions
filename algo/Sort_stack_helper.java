package algo;

import java.util.Scanner;

public class Sort_stack_helper {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Stack_4 stack=new Stack_4(5);
		Stack_4 helper=new Stack_4(5);
		
		int temp;
		int temp1;
		int index=0;;
		
		for(int i=1;i<=stack.size;i++)
		{
			System.out.println("enter the number that you want to push");
			int num=s.nextInt();
			stack.push(num);
		}
		
		stack.display();
	    int max=stack.max();
	    //int v1=stack.size;
	    System.out.println(max);
	    while(!stack.isEmpty()){
	    	int tmp=stack.pop();
	    	while(!helper.isEmpty() && helper.peek()>tmp){
	    		stack.push(helper.pop());
	    	}
	    	
	    	helper.push(tmp);
	    }
	    
	    helper.display();
	    
	}
}
