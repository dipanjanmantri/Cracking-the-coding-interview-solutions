package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Anagram_group {

	public static void main(String[] args)
	{
	    String[] str={"fridge","chair","defgri","water","gfdrie","hcria","hcari","rchai",
	    		"ground","crhia","dgnrou"};
	    
	    group(str);
	    
	}

	private static void group(String[] str) {
		// TODO Auto-generated method stub
		
		Hashtable<String, ArrayList<String>> h=new Hashtable<String, ArrayList<String>>();
		for(String s:str){
			String key=sortChars(s);
			if(!h.containsKey(key)){
				h.put(key, new ArrayList<String>());
			}
			ArrayList<String> a=h.get(key);
			a.add(s);
			h.put(key, a);
		}
		
		for(String k:h.keySet()){
			//int idx=0;
			for(String s2:h.get(k)){
				System.out.print(s2+" ");
			}
		}
	}

	private static String sortChars(String s) {
		// TODO Auto-generated method stub
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		
		return new String(ch);
	}
}
