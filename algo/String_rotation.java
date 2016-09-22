package algo;

public class String_rotation{
	public static void main(String[] args)
	{
		
		String s="abcdefgh";
		String s1="efghabcd";
		int i=0;
		char c=s1.charAt(0);
		int k=0;
		while(i<s.length())
		{
			char c1=s.charAt(i);
			if(c==c1)
			{
				k=i;
			}
			i++;
		}
		String s2=s.substring(0,k);
		String s3=s.substring(k);
		System.out.println(s2);
		System.out.println(s3);
		String s4=s3+s2;
		System.out.println(s4);
		if(s4.equals(s1)){
		   System.out.println(s4+" is a rotation of "+s);
		}
	}
}