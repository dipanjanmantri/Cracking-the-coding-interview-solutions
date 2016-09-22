package algo;

public class String_permutation {

	public static void main(String[] args)
	{
		String s="apple";
		String s1="mango";
		String s2="leapp";
		char[] c=s.toCharArray();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		java.util.Arrays.sort(c);
		java.util.Arrays.sort(c1);
		java.util.Arrays.sort(c2);
		String s3=new String(c);
		String s4=new String(c1);
		String s5=new String(c2);
		if(s3.equals(s4) || s3.equals(s5) || s4.equals(s5))
		{
			System.out.println("one of the string is permutation of the other");
		}
	}
}
