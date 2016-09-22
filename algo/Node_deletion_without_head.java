package algo;

import java.util.Scanner;

public class Node_deletion_without_head {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		LinkedList a=new LinkedList(10,null);
		LinkedList b=new LinkedList(20,null);
		LinkedList c=new LinkedList(30,null);
		LinkedList d=new LinkedList(40,null);
		a.link=b;
		b.link=c;
		c.link=d;
		LinkedList front=a;
		
		System.out.println("The list before deletion");
		while(a!=null)
		{
			System.out.print(a.data+"---->");
			a=a.link;
		}
		
		System.out.println("null");
		
		
		System.out.println("enter the node which has access to the node that you want to delete");
		char k=s.next().charAt(0);
		if(k=='b')
		{
			LinkedList temp=b.link;
			b.link=null;
			b.link=temp.link;
			
		}
		else if(k=='c')
		{
			LinkedList temp=c.link;
			c.link=null;
			c.link=temp.link;
		}else if(k=='a')
		{
			a=front;
			LinkedList temp=a.link;
			a.link=null;
			a.link=temp.link;
		}
	
		System.out.println("after deletion");
		while(front!=null)
		{
			System.out.print(front.data+"---->");
			front=front.link;
		}
		
		System.out.println("null");
		
	}
}
