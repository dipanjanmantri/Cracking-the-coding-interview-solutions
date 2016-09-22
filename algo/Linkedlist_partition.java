package algo;

import java.util.HashSet;
import java.util.Scanner;

public class Linkedlist_partition {

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
		
		HashSet<Integer> less=new HashSet<Integer>();
		HashSet<Integer> greater=new HashSet<Integer>();
		
		
		System.out.println("enter the partition number");
		int pivot=s.nextInt();
		front=temp;
		while(front!=null)
		{
			if(front.data<pivot)
			{
				less.add(front.data);
			}else if(front.data>pivot){
				greater.add(front.data);
			}
			front=front.link;
		}
		
		LinkedList dummy=new LinkedList(0,null);
		LinkedList temp1=dummy;
		
		for(int d:less)
		{
			LinkedList l1=new LinkedList(d,null);
			dummy.link=l1;
			dummy=l1;
			
		}
		
		LinkedList l2=new LinkedList(pivot,null);
		dummy.link=l2;
		dummy=l2;
		for(int d1:greater)
		{
			LinkedList l4=new LinkedList(d1,null);
			dummy.link=l4;
			dummy=l4;
		}
		dummy=temp1;
		dummy=dummy.link;
		
		System.out.println("The list after partition");
		while(dummy!=null)
		{
			System.out.print(dummy.data+"----->");
			dummy=dummy.link;
		}
		
		System.out.println("null");
		
	}
}
