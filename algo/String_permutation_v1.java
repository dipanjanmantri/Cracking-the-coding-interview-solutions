package algo;

public class String_permutation_v1 {

	public static void main(String[] args)
	{
		String s="watermelon";
		char[] c=s.toCharArray();
		int[] count=new int[s.length()];
		int i=0;
		
		int k=0;
		while(i<c.length)
		{ 
			int x=1;
			int j=0;
			while(j<c.length)
			{
				
				if(i==j)
					continue;
				if(c[i]==c[j]){
					x++;
				}
				
				j++;
			}
			count[i]=x;
			i++;
		}
		
		for(int m=0;m<count.length;i++)
		{
			System.out.print(count[m]+" ");
		}
	}
}
