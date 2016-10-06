package sort;

public class Solution {

	public static void main(String[] args)
	{
		int[] a={-1,3,-4,5,1,-6,2,1};
		int result2=solution2(a);//implements the algorithm with complexity O(n^2)
		int result1=solution1(a);//implements the algorithm with complexity O(n)
		System.out.println(result2);
		System.out.println(result1);
		
	}

	private static int solution2(int[] a) {
		// TODO Auto-generated method stub
		int n=a.length;
		for(int i=0;i<n;i++){
			int leftsum=0;
			int rightsum=0;
			for(int j=0;j<i;j++){
				leftsum+=a[j];
			}
			for(int j=i+1;j<n;j++){
				rightsum+=a[j];
			}
			if(leftsum==rightsum){
				return i;
			}
		}
		return -1;
	}

	private static int solution1(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		
	    int leftsum=0;
	   // int rightsum=0;
	    for(int i=0;i<a.length;i++)
	    {
	    	sum-=a[i];
	    	if(leftsum==sum)
	    	{
	    		return i;
	    	}
	    	leftsum+=a[i];
	    }
		return -1;
	}

	
}