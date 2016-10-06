package recursion;

public class Dictionary_problem {

	public static void main(String[] args)
	{
		CharSequence[] dict={"and","apple","are","do","flowers","how","I","like","mango","you"};
		
		String s="Ilikemango";
		String s1="doyoulikeapple";
		
		CharSequence[] ch1=new CharSequence[dict.length];
		CharSequence[] ch2=new CharSequence[dict.length];
		
		
		
		for(int i=0;i<dict.length;i++){
			if(s.contains(dict[i])){
				ch1[i]=dict[i];
			}
			if(s1.contains(dict[i])){
				ch2[i]=dict[i];
				System.out.print(dict[i]+" ");
				
			}
		}
		System.out.println();
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=null)
			{
				System.out.print(ch1[i]+" ");
			}
			
		}
		
		System.out.println();
		
	//	for(int i=0;i<ch2.length;i++)
		//{
			//if(ch2[i]!=null){
				//System.out.print(ch2[i]+" ");
			//}
				
		
		}
			
		
	}

