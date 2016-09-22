package algo;

import java.util.Scanner;

public class Delete_unsortedLinkedList {

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
	    
	    d1=temp;
	    while(d1!=null)
	    {
	    	int d=d1.data;
	    	Doubly_linkedlist k=d1.link2;
	    	while(k!=null)
	    	{
	    		if(d==k.data)
	    		{
	    			if(k.link2==null)
	    			{
	    			    Doubly_linkedlist k1=k.link1;
	    			    k1.link2=null;
	    			}else if(k.link2!=null)
	    			{
	    				Doubly_linkedlist k2=k.link1;
	    				k2.link2=k.link2;
	    				k2.link2.link1=k2;
	    				k2.link2=null;
	    			}
	    		}
	    		k=k.link2;
	    	}
	    	d1=d1.link2;
	    }
	    
	    d1=temp;
	    while(d1!=null)
	    {
	    	System.out.print(d1.data+"<----->");
	    	d1=d1.link2;
	    }
	    System.out.println("null");
	}
	
	
}
