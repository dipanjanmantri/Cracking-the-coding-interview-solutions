package sort;

public class Bubble_sort {
	
	
    // time complexity is in the order of O(n^2) 
	//more specifically the complexity is O(n*m)
	//best case O(n)
	//average and worst case is O(n^2)
	public static void main(String[] args)
	{
		int[] a={5,4,3,2,1};
		int k=a.length;
		int k1=k-2;
		
		
		for(int i=1;i<=k-1;i++)
		{
			int flag=0;
			for(int j=0;j<=k-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int tmp=a[j+1];
					a[j+1]=a[j];
					a[j]=tmp;
					flag=1;
				}
			}
			
			if(flag==0)
				break;
		}
		
	   for(int i=0;i<a.length;i++){
		   
		   System.out.print(a[i]+" ");
	   }
		
	}

	
		
	
}
