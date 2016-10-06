package recursion;

public class Fact {

	public static void main(String[] args)
	{
		int n=5;
		int result=fact(n);
		System.out.println(result);
		
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
		
	}
}
