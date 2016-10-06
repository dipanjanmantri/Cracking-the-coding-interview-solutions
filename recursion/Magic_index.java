package recursion;

public class Magic_index {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -1, 0, 1, 3, 7, 5};
		int result=search(arr,0,arr.length-1);
		System.out.println(result);
	}

	private static int search(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start<=end){
			int mid=(start+end)/2;
			if(mid==arr[mid])
				return mid;
			else if(mid>arr[mid])
				return search(arr,mid+1,end);
			else
				return search(arr,start,mid-1);
			
			}
		return 0;
			
		}
		
	}

