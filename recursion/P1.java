package recursion;

public class P1 {

	public static void main(String[] args)
	{
		int n=5;
		f1(8);
		
	}

	private static void f1(int k) {
		// TODO Auto-generated method stub
		if(k<=0){
			System.out.println("bye");
			return;
		}
		
		System.out.println("hi");
		f1(k-1);
	}
}
