package algo;

public class String_unique {

	public static void main(String[] args)
	{
		String s="apple";
		boolean flag=false;
		char[] s1=s.toCharArray();
		int i=0;
		int[] count1=new int[s1.length];
		
		
		while(i<s1.length)
		{
			int j=0;
			int x=1;
			while(j<s1.length)
			{
				if(i!=j){
					if(s1[i]==s1[j])
				    {
						x++;
					}
				}
				
			    
				j++;
				
			}
			count1[i]=x;
			i++;
		}
		for(int k=0;k<s1.length;k++)
		{
			System.out.print(count1[k]+" ");
			
		}
	}
}
