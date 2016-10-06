package computational_complexity;

public class O_1 {

	public static void main(String[] args)
	{
		System.out.println(sum(2,4));
	}

	private static int sum(int i, int j) {
		// TODO Auto-generated method stub
		
		//complexity is O(1)
		return (i+j);//Always performs one operation at a time at the worst case
		
	}
}
