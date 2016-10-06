package sort;

public class Selection_sort {

	public static void main(String[] args)
	{
		 int[] a={3,4,5,2,1};
		 selection_sort(a);
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
		 
	}
	
    //time complexity is O(n*m)
	private static void selection_sort(int[] a) {
		// TODO Auto-generated method stub
		int n=a.length;
		for(int i=0;i<=n-2;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<n;j++){
				if(a[j]<a[i]){
					minIndex=j;
				}
			}
			
			int tmp=a[minIndex];
			a[minIndex]=a[i];
			a[i]=tmp;
		}
		
	}
}
