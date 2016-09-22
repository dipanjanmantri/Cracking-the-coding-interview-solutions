package algo;

public class Duplicate_deletion {

	public static void main(String[] args)
	{
		int[] a={1,2,3,2,3,1,4,4,5,6,5};
		int len=a.length;
		int i=0;
		int j=0;
		while(i<len)
		{
			j=i+1;
			//int d=a[i];
			while(j<len)
			{
				if(a[i]==a[j])
				{
					a[j]=a[len-1];
					--len;
				}
				j++;
			}
			
			i++;
		}
		
		int k=0;
		while(k<len)
		{
			System.out.print(a[k]+" ");
			k++;
		}
		System.out.println();
	}
}
