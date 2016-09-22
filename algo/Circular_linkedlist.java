package algo;

import java.util.HashSet;

public class Circular_linkedlist {

	public static void main(String[] args)
	{
		LinkedList a=new LinkedList(10,null);
		LinkedList b=new LinkedList(20,null);
		LinkedList c=new LinkedList(30,null);
		LinkedList d=new LinkedList(40,null);
		LinkedList e=new LinkedList(50,null);
		LinkedList f=new LinkedList(60,null);
		LinkedList g=new LinkedList(70,null);
		LinkedList h=new LinkedList(80,null);
		
		a.link=b;
		b.link=c;
		c.link=d;
		d.link=e;
		e.link=f;
		f.link=g;
		g.link=h;
		h.link=d;
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		int counter=1;
		while(a!=null)
		{
			if(set.contains(a.data))
			{
				break;
			}else{
				set.add(a.data);
			}
			
			a=a.link;
		}
		
		System.out.println("The head of the circular loop is the node of value "+a.data);
	}
}
