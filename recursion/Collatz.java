package recursion;

public class Collatz {

	public static void main(String[] args)
	{
		int n=4;
		int result=collatz(n);
		System.out.println(result);
	}

	private static int collatz(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 0;
		else if(n%2==0)
			return 1+collatz(n/2);
		else 
			return 1+collatz(3*n+1);
	}
}
