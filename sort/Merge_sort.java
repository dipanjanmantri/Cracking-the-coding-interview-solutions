package sort;

public class Merge_sort {

	public static void main(String[] args)
	{
		int[] A={5,4,3,-9,7,6,8,2};
		merge_sort(A);
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	
	public static void merge_sort(int[] A){
		int n=A.length;
		if(n<2)
			return;
		int mid=n/2;
		int[] left=new int[mid];
		int[] right=new int[n-mid];
		for(int i=0;i<mid;i++)
		{
			left[i]=A[i];
		}
		for(int j=mid;j<n;j++)
		{
			right[j-mid]=A[j];
		}
		merge_sort(left);
		merge_sort(right);
		merge(left, right, A);
	}
	
	public static void merge(int[] left, int[] right, int[] A)
	{
		int l=left.length;
		int r=right.length;
		int i=0,j=0,k=0;
		while(i<l && j<r)
		{
			if(left[i]<right[j]){
				A[k]=left[i];
				i++;
			}else{
				A[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<l){
			A[k]=left[i];
			i++;
			k++;
		}
		while(j<r){
			A[k]=right[j];
			j++;
			k++;
		}
	}
	
	
}
