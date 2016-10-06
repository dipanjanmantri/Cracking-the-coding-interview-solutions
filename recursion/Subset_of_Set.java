package recursion;

import java.util.ArrayList;

public class Subset_of_Set {

	public static void main(String[] args)
	{
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		arr.add("d");
		ArrayList<ArrayList<String>> result=new ArrayList<ArrayList<String>>();
		int k=1<<arr.size();
		for(int i=0;i<k;i++)
		{
			ArrayList<String> str=new ArrayList<String>();
			str=convert(i,arr);
			result.add(str);
		}
		
		System.out.println(result.get(11).toString());
		
		
		
	}

	private static ArrayList<String> convert(int x, ArrayList<String> arr) {
		// TODO Auto-generated method stub
		ArrayList<String> str=new ArrayList<String>();
		int idx=0;
		for(int k=x;k>0;k>>=1){
			if((k&1)==1){
				str.add(arr.get(idx));
			}
			idx++;
		}
		return str;
	}

	
}
