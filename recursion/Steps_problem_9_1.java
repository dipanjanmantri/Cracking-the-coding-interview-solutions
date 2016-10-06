package recursion;

public class Steps_problem_9_1 {

	public static void main(String[] args)
	{
		int n=5;
		int result=steps(n);
		System.out.println(result);
	}

	private static int steps(int n) {
		// TODO Auto-generated method stub
		if(n<0)
			return 0;
		if(n==0)
			return 1;
		else
			return steps(n-1)+steps(n-2)+steps(n-3);
		
		
	}
}
