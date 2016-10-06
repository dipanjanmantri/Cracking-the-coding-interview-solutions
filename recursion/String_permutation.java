package recursion;

import java.util.ArrayList;

public class String_permutation {

	public static void main(String[] args)
	{
		String s1="abcdabcdadcbcdbabbaabadc";
		int k=0;
		ArrayList<String> result=new ArrayList<String>(); 
		String str="abcd";
		result=getPerm(str);
		CharSequence[] ch=new CharSequence[result.size()];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=result.get(i);
		}
		for(int i=0;i<ch.length;i++)
		{
			if(s1.contains(ch[i])){
				k++;
			}
		}
		
		System.out.println(k);
		
		
	}

	private static ArrayList<String> getPerm(String str) {
		// TODO Auto-generated method stub
		if(str==null)
			return null;
		
		ArrayList<String> perm=new ArrayList<String>();
		if(str.length()==0){//base case
			perm.add("");
			return perm;
		}
		char first=str.charAt(0);
		String rem=str.substring(1);
		ArrayList<String> words=getPerm(rem);
		for(String word:words)
		{
			for(int j=0;j<=word.length();j++){
				String s=insertCharAt(word,first,j);
				perm.add(s);
			}
		}
		return perm;
		
	}

	private static String insertCharAt(String word, char c, int j) {
		// TODO Auto-generated method stub
		String start=word.substring(0,j);
		String end=word.substring(j);
		
		return start+c+end;
	}
	
	
}
