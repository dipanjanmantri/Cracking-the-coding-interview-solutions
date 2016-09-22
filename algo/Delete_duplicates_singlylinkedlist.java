package algo;

import java.util.HashSet;
import java.util.Scanner;

public class Delete_duplicates_singlylinkedlist {

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
		
		System.out.println("say if you want to remove duplicates from the list");
		char c4=s.next().charAt(0);
		
		//this code implements the logic of the deletion of the duplicate nodes
		//by using HashSet which is a buffer
		if(c4=='r')
		{
			front=temp;
			HashSet<Integer> set=new HashSet<Integer>();
			LinkedList prev=null;
			prev=front;
			while(front!=null)
			{
			      if(set.contains(front.data))
			      {
			    	  prev.link=front.link;
			      }else
			      {
			    	  set.add(front.data);
			    	  prev=front;
			    	  
			      }
			      
			      front=front.link;
			    		  
			}
			
			
			front=temp;
			System.out.println("The list after duplicate deletion by using a buffer: ");
			while(front!=null)
			{
				System.out.print(front.data+"---->");
				front=front.link;
			}
			System.out.println("null");
		}
		//this code implements the logic of the deletion of the duplicate nodes
		//without using s buffer
		else if(c4=='R')
		{
			front=temp;
		    LinkedList prev=null;
			LinkedList current=null;
			while(front!=null)
			{
				prev=front;
				current=front.link;
				while(current!=null)
				{
					if(front.data==current.data)
					{
						prev.link=current.link;
					}else{
						prev=current;
					}
					current=current.link;
				}
				front=front.link;
			}
			front=temp;
		    System.out.println("The list after duplicate deletion without using a buffer");
		    while(front!=null)
		    {
		    	System.out.print(front.data+"---->");
		    	front=front.link;
		    }
		    System.out.println("null");
		}
		   
		    
		    
		}
		
		
}

