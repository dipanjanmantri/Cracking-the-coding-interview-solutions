package computational_complexity;

public class O_n {

	public static void main(String[] args)
	{
		//to find an element from the array the worst time complexity is O(n)
		int[] arr={1,2,12,10,22,20,6,9};
		
		int n=12;
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1){
			System.out.println("found");
		}else{
			System.out.println("not found");
		}
		
	}
}
