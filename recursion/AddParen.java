package recursion;

import java.util.ArrayList;

public class AddParen {

	public static void main(String[] args)
	{
		ArrayList<String> result=new ArrayList<String>();
		int n=3;
		result=genParen(3);
		
	}

	private static ArrayList<String> genParen(int count) {
		// TODO Auto-generated method stub
		char[] str=new char[2*count];
		ArrayList<String> list=new ArrayList<String>();
		addParen(list,count,count,str,0);
		return list;
	}

	private static void addParen(ArrayList<String> list, int left, int right, char[] str, int count) {
		// TODO Auto-generated method stub
		
		if(left<0 || right<0)
			return;
		if(left==0 && right==0){
			String s=String.copyValueOf(str);
			list.add(s);
		}
		else{
			if(left>0){
				str[count]='(';
				addParen(list,left-1,right,str,count+1);
			}
			if(right>left){
				str[count]=')';
				addParen(list,left,right-1,str,count+1);
			}
		}
	}
}
