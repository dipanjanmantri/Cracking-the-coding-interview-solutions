package sort;

public class Insertion_sort {

	//time complexity is O(n2)
	public static void main(String[] args)
	{
		int[] a={6,5,4,3,2,1};
		for(int i=1;i<a.length;i++)
		{
			int e=a[i];
			int j=i;
			while(j>0 && a[j-1]>e)
			{
				a[j]=a[j-1];
				j--;
			}
			
			a[j]=e;
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
