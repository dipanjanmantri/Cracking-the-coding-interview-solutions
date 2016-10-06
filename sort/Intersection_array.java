package sort;

public class Intersection_array {

	public static void main(String[] args)
	{
		int[] a1={1,2,3,4,5,6};
		int[] a2={4,5,6,7,8,9};
		
		int size_intersection=0;
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j]){
					size_intersection++;
				}
			}
		}
		
		System.out.println(size_intersection);
	}
}
