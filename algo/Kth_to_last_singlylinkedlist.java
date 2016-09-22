package algo;

import java.util.Scanner;

public class Kth_to_last_singlylinkedlist {

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
		
		System.out.println("say which element you want to find from last");
		int e=s.nextInt();
		
		front=temp;
		LinkedList end=temp;
		int i=0;
		while(i<e-1)
		{
			end=end.link;
			i++;
		}
		
		while(end.link!=null)
		{
			end=end.link;
			front=front.link;
		}
		System.out.println("The eth element from the last is "+front.data);
		
		
	}
}

