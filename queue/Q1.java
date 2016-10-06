package queue;

import java.util.Queue;

import java.util.LinkedList;

public class Q1 {

	public static void main(String[] args)
	{
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(12);
		q.add(24);
		q.add(36);
		q.add(48);
		System.out.println(q.size());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.size());
		
	}
}
