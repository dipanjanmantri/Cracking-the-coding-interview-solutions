package sort;

public class QuickSort {

	
	//time complexity is O(n*log(n)) for best and average case
	//and for the worst case its O(n*m)
	public static void main(String[] args)
	{
	
		int[] a={10,12,5,4,2};
		quicksort(a,0,4);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	private static void quicksort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end)
		{
			int pIndex=partition(a,start,end);
			quicksort(a,start,pIndex-1);
			quicksort(a,pIndex+1,end);
			
		}
	}

	private static int partition(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		int pivot=a[end];
		int pIndex=start;
		for(int i=start;i<end;i++){
			if(a[i]<=pivot){
				int tmp=a[i];
				a[i]=a[pIndex];
				a[pIndex]=tmp;
				pIndex++;
			}
		}
		int tmp1=a[pIndex];
		a[pIndex]=a[end];
		a[end]=tmp1;
		return pIndex;
		
	}
	

}
