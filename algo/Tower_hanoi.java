package algo;

import java.util.ArrayList;

public class Tower_hanoi {

	public static void main(String[] args)
	{
		int n=3;
		ArrayList<Tower> towers=new ArrayList<Tower>();
		int i=0;
		while(i<n)
		{
			towers.add(new Tower(4,i));
			i++;
		}
		
		int j=4;
		while(j>=1)
		{
			towers.get(0).add(i);
			j--;
		}
	
		
		int n1=4;
		towers.get(0).moveDisks(n1, towers.get(2), towers.get(1));
		
		
	}
}
