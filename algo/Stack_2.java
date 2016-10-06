package algo;

public class Stack_2 {

	int[] arr;
	int size;
	int top=-1;
	
	public Stack_2(int size)
	{
		this.size=size;
		arr=new int[size];
	}
	
	void push(int num)
	{
		if((top+1)>=(arr.length-1))
		{
			System.out.println("The stack is full");
		    
		}else{
			if(top==-1)
			{
				top++;
				arr[top]=num;
			}else if(top>=0)
			{
				if(arr[top]>num)
				{
					top++;
					arr[top]=num;
				}else if(arr[top]<num)
				{
					int temp=arr[top];
					arr[top]=num;
					top++;
					arr[top]=temp;
				}
			}
			
		}
	}
	
	int min()
	{ 
		int x=0;
		if(top>=0)
		{
			x= arr[top];
		}
		return x;
		
	}
	
	int pop()
	{
		int n=arr[top];
		arr[top]=0;
		top--;
		return n;
		
	}
	
	void display()
	{
		int k=top;
		while(k>=0)
		{
			System.out.print(arr[k]+" ");
			k--;
		}
		
		System.out.println();
    }
}
