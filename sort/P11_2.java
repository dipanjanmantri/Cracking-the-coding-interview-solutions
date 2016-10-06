package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

public class P11_2 {

	public static void main(String[] args)
	{
		
		String[] s={"chair","fridge","hcria","rhcai","riahc","ground"};
	    sort(s);	
	    
	    //LinkedList<String> ls=new LinkedList<String>();
	    //ls.push("cat");
	    
	    int key_num=0;
	    
	}

	private static void sort(String[] s) {
		// TODO Auto-generated method stub
		HashMap<String, ArrayList<String>> h=new HashMap<String, ArrayList<String>>();
		for(String s1:s){
			String key=sortChars(s1);
			if(!h.containsKey(key)){
			   h.put(key, new ArrayList<String>());
			   
			}
			ArrayList<String> anagrams=h.get(key);
			anagrams.add(s1);
			h.put(key, anagrams);
		}
		
		int key_number=0;
		for(String key:h.keySet()){
			key_number++;
		}
		
		int index=0;
		String[] arr=new String[s.length];
		for(String key:h.keySet())
		{
			ArrayList<String> a=h.get(key);
			for(String s5:a){
				arr[index]=s5;
				index++;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
	}

	private static String sortChars(String s1) {
		// TODO Auto-generated method stub
		char[] ch=s1.toCharArray();
		Arrays.sort(ch);
		String s2=new String(ch);
		return s2;
	}
}
