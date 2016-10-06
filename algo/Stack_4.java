package algo;

public class Stack_4 {

	int[] arr;
	int size;
	int top=-1;
	
	int max=0;
	
	public Stack_4(int size)
	{
		this.size=size;
		arr=new int[size];
	}
	
	void push(int num)
	{
		if(top+1>=size){
			System.out.println("sorry the stack is full");
		}else{
			top++;
			arr[top]=num;
		}
	}
	
	int pop()
	{
		int num=0;
		if(top<0){
			System.out.println("sorry the stack is empty");
		}else{
			num=arr[top];
			top--;
			
		}
		
		return num;
	}
	
	void display()
	{
		int val=top;
		while(val>=0){
			System.out.print(arr[val]+" ");
			val--;
		}
		System.out.println();
	}
	
	void push1(int num)
	{
	    if(top+1==0 && arr[top]==0){
	    	++top;
	    	arr[top]=num;
	    }
	}
	
	void check_greater(int num)
	{
		
	}
	
	int max()
	{
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		
		return max;
	}
	
	int peek()
	{
		int n=0;
		if(top==-1){
			n=0;
		}else{
			n=arr[top];
		}
		return n;
	}
	boolean isEmpty()
	{
		boolean b=false;
		int num=0;
		if(top==-1){
			b=true;
		}
		
		return b;
	}
}
