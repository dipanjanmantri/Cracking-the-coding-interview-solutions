package algo;

import java.util.Scanner;

public class Doubly_implementation {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Doubly_linkedlist d1=new Doubly_linkedlist(10, null, null);
		char c;
		int counter=1;
		Doubly_linkedlist temp=new Doubly_linkedlist(0,null,null);
		temp=d1;
		//prompts the user to enter yes or no
		//if n or N the loop quits and stops adding nodes
		//if y the loop continues the add nodes
		//the linking logic is implemented within the loop
		while(true)
	    { 
			 System.out.println("enter n or N to stop adding");
			 
			 c=s.next().charAt(0);
			 if(c=='n' || c=='N'){
				 break;
			 }
			 System.out.println("enter the data of the node");
			 int data=s.nextInt();
			 
			 Doubly_linkedlist l1=new Doubly_linkedlist(data,d1, null);
			 d1.link2=l1;
			 l1.link1=d1;
			 d1=l1;
			 counter++;
			 
			 
		}
		
		d1=temp;
		
		
		//traverses through the list and prints the nodes
		while(d1!=null)
		{
			System.out.print(d1.data+"<------->");
			d1=d1.link2;
			
		}
		
		
	    System.out.println("null");
	    
		System.out.println("say if you would like to delete a node");
		char c1=s.next().charAt(0);
		//prompts the user to delete a node at an index
		//based on the user choice the program deletes the node
		//the code implements the logic for deletion at the beginning
		//the code implements the logic for deletion at the end
		//the code implements the logic for deletion at the middle
		if(c1=='d')
		{
			System.out.println("enter the position of the node that you would like to delete");
			int pos=s.nextInt();
			d1=temp;
			if(pos==1)
			{
				
				d1=d1.link2;
				d1.link1=null;
			}
			else if(pos==counter)
			{
				int j=1;
				while(j<pos-1)
				{
					d1=d1.link2;
					j++;
				}
				
				d1.link2=null;
				d1=temp;
			}
			else if(pos<counter && pos!=1)
			{
				int j=1;
				while(j<pos-1)
				{
					d1=d1.link2;
					j++;
				}
				
				Doubly_linkedlist current=d1.link2;
				d1.link2=current.link2;
				current.link2.link1=d1;
				
				d1=temp;
			}
				
		}
		
		System.out.println("after deletion the remaining nodes are");
	    
		//traverses through the list and prints the list
	    while(d1!=null)
	    {
	    	System.out.print(d1.data+"<----->");
	    	d1=d1.link2;
	    }
		System.out.println("null");
		
		
		//prompts the user to add a node at the beginning or at the middle
		//the code implements the logic for adding a node at the beginning
		//the code implements the logic for adding a node at the middle
		System.out.println("say if you want to add a node at the beginning or at the middle");
		char c2=s.next().charAt(0);
		if(c2=='y' || c2=='Y')
		{
			System.out.println("enter the position at which you would like to add the node");
			int pos1=s.nextInt();
			if(pos1==1)
			{
				System.out.println("enter the data of the node");
				int data1=s.nextInt();
				Doubly_linkedlist d2=new Doubly_linkedlist(data1, null, null);
				d1=temp;
				d2.link2=d1;
				d1.link1=d2;
				d1=d2;
			}
			
			if(pos1>1 && pos1<counter)
			{
				System.out.println("enter the data of the node");
				int data1=s.nextInt();
				Doubly_linkedlist d2=new Doubly_linkedlist(data1, null, null);
				int k=1;
				d1=temp;
				while(k<pos1-1)
				{
					d1=d1.link2;
					k++;
				}
				d2.link2=d1.link2;
				d1.link2.link1=d2;
				d1.link2=d2;
				d2.link1=d1;
				d1=temp;
			}
			
			while(d1!=null)
			{
				System.out.print(d1.data+"<----->");
				d1=d1.link2;
			}
			System.out.println("null");
			
			
			
		}
		
		
	}
}
