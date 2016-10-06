package recursion;

public class Sum {

	public static void main(String[] args)
	{
		int n=6;
		int result=sum(n);
		System.out.println(result);
		
	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		else
			return n+sum(n-1);

	}
}
