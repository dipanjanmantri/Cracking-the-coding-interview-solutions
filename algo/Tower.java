package algo;

public class Tower {

	private int[] arr;
	private int top=-1;
	private int size;
	int index;
	
	public Tower(int size, int index)
	{
		this.size=size;
		arr=new int[size];
		this.index=index;
	}
	
	void add(int d)
	{
		if(top+1>=size)
		{
			System.out.println("sorry the stack is full");
		}
		else{
			top++;
			arr[top]=d;
		}
	}
	
	int index()
	{
		return index;
	}
	
	int pop()
	{
		int n=arr[top];
		top--;
		arr[top]=0;
		return n;
	}
	
	void moveTopTo(Tower t)
	{
		int top_num=pop();
		t.add(top_num);
		System.out.println("Move disk "+top+" from "+index()+" to "+t.index());
	}
	
	
	void moveDisks(int n, Tower dest, Tower buffer)
	{
		if(n>0){
			moveDisks(n-1, buffer,dest);
		}
		moveTopTo(dest);
		buffer.moveDisks(n-1, dest, this);
	}
	
} 
