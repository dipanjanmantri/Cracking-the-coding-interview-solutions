package recursion;

import java.util.ArrayList;

public class P2 {

	public static void main(String[] args)
	{
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		ArrayList<ArrayList<Integer>> result=subSet(arr);
		
		
	}
	
	public static ArrayList<ArrayList<Integer>> subSet(ArrayList<Integer> set)
	{
		ArrayList<ArrayList<Integer>> allSub=new ArrayList<ArrayList<Integer>>();
		int k=1<<set.size();
		for(int i=0;i<k;i++)
		{
			ArrayList<Integer> res1=convert(i,set);
			allSub.add(res1);
		}
		return allSub;
	}

	private static ArrayList<Integer> convert(int x, ArrayList<Integer> set) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int idx=0;
		for(int k=x;k>0;k>>=1){
			if((k&1)==1){
				arr.add(set.get(idx));
			}
			idx++;
		}
		return arr;
	}
}
