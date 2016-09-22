package algo;
import java.util.Scanner;


public class LinkedList_implementation {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		LinkedList front=new LinkedList(10,null);
		char c;
		LinkedList temp=new LinkedList(0,null);
		temp=front;
		int counter=1;
		//add nodes until user enters n or N
		//nodes automatically gets linked while creation
		while(true)
		{
			System.out.println("enter the y or n");
			c=s.next().charAt(0);
			if(c=='n' || c=='N'){
				break;
			}
			
			System.out.println("enter the data for the node");
			int v=s.nextInt();
			LinkedList node1=new LinkedList(v,null);
			front.link=node1;
			front=node1;
			counter++;
			
		}
		
		front=temp;
		//print nodes 
		while(front!=null)
		{
			System.out.print(front.data+"---->");
			front=front.link;
			
		}
		
		//front=temp;
		
		
		System.out.println("null");
		
		// prints the length of the LinkedList
		System.out.println("The length of the LikedList is "+counter);
		
		
		
		System.out.println("say if you would like to delete a node");
		char c1=s.next().charAt(0);
		// deletes the node at the desired position 
		// implements the logic for all types of position
		// if the position is at the end then the logic is different 
		// compared to that at the beginning or in the middle
		if(c1=='d')
		{
			System.out.println("enter the position");
			int pos=s.nextInt();
		
			
			front=temp;
			LinkedList previous;
			LinkedList current;
			previous=current=front;
			
			if(pos<counter && pos!=1)
			{
				int i=1;
				pos=pos-1;
				while(i<pos)
				{
					front=front.link;
					i++;
				}
				
				previous=front;
				current=front.link;
				front.link=current.link;
				current.link=null;
			}
			
			if(pos==counter)
			{
				int j=1;
				front=temp;
				while(j<pos-1)
				{
					front=front.link;
					j++;
				}
				
				front.link=null;
			}
			if(pos==1)
			{
			     //LinkedList temp1=front;
                 front=front.link;
                 //temp1=null;
			}
			
			
				
	     }
		
		//front=temp;
		System.out.println("The nodes after deletion");
		// prints the node after successful deletion of a node
		while(front!=null)
		{
			System.out.print(front.data+"---->");
			front=front.link;
			
		}
		
		System.out.println("null");
		
	   
		
	}
}
