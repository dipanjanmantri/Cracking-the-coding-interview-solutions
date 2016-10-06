package recursion;

public class Dict_v1 {

	public static void main(String[] args)
	{
        CharSequence[] dict={"and","apple","are","do","flowers","how","I","like","mango","you"};
		
		CharSequence s="Ilikemango";
		CharSequence s1="doyoulikeapple";
		
		String result=breakString(s,dict);
		System.out.println(result);
		
	}

	private static String breakString(CharSequence s,CharSequence[] dict) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<s.length();i++)
		{
			CharSequence left=s.subSequence(0, i);
            CharSequence right=s.subSequence(i,s.length());
            
            
		}
		
		return null;
		
	}
}
