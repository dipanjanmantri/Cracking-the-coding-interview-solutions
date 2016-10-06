package algo;

public class Queue {

	int[] arr;
	int size;
	int front,rear=-1;
	int num_items=0;
	
	public Queue(int size)
	{
		this.size=size;
		arr=new int[size];
	}
	
	void insert(int num)
	{
		if(num_items<=size)
		{
			rear++;
			arr[rear]=num;
			
			num_items++;
			if(rear==0){
				front=rear;
			}
			
		}else{
			System.out.println("the queue is full");
		}
	}
	
	void remove()
	{
		if(num_items>0)
		{
			System.out.println(arr[front]+" was removed from the queue");
			
			front++;
			num_items--;
		}else{
			System.out.println("the queue is empty");
		}
	}
	
	void peek()
	{
		System.out.println("The first element is "+arr[front]);
	}
	
	void display()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		
		System.out.println();
	}
}

