package algo;

public class Stack_1 {

	int[] arr;
	int size;
	int size1,size2,size3;
	int[] stack_top={-1,-1,-1};
	int array_top1=6;
	int array_top2=3;
	int array_top3=0;
	public Stack_1(int size)
	{
		this.size=size;
		arr=new int[size];
		size1=size2=size3=size/3;
	}
	
	void display_stack1()
	{
	    int k=size-1;
	    while(k>=(size-size1))
	    {
	    	System.out.print(arr[k]+" ");
	    	k--;
	    }
	    
	    System.out.println();
	}
	
	void display_stack2()
	{
		int k=size-1-3;
	    while(k>=(size-(size1+size2)))
	    {
	    	System.out.print(arr[k]+" ");
	    	k--;
	    
	    }
	}
	
	
	void display_stack3()
	{
		int k=size-1-3-3;
	    while(k>=(size-(size1+size2+size3)))
	    {
	    	System.out.print(arr[k]+" ");
	    	k--;
	    
	    }
	}
	
	void push1(int num)
	{
		if(stack_top[0]>=size1)
		{
			System.out.println("sorry, the stack1 is full");
		}
		arr[array_top1]=num;
		stack_top[0]++;
		array_top1++;
	}
	int pop1()
	{
		array_top1--;
		int n=arr[array_top1];
	    arr[array_top1]=0;
	    return n;
    }
	void push2(int num)
	{
	
		if(stack_top[1]>=size2)
		{
			System.out.println("sorry, stack2 is full");
		}else{
			stack_top[1]++;
			arr[array_top2]=num;
			array_top2++;
		}
		
	}
	int pop2()
	{
		return 0;
	}
	void push3(int num)
	{
		
		if((stack_top[2]+1)>size2)
		{
			System.out.println("sorry, stack3 is out of size");
		}else{
			stack_top[2]++;
			arr[array_top3]=num;
			array_top3++;
		}
		
		
	}
	int pop3()
	{
		return 0;
	}
	
	int peek1()
	{
		return 0;
	}
	
	int peek2()
	{
		return 0;
	}
	
	int peek3()
	{
		return 0;
	}
}
