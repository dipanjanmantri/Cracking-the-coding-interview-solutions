package recursion;

public class Fibonacci {

	public static void main(String[] args)
	{
		int n=6;
		int result=fib(n);
		System.out.println(result);
		
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		else return fib(n-1)+fib(n-2);
	}
}
