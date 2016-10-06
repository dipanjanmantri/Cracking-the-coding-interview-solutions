package algo;

public class Tower_of_hanoi {

	public static void main(String[] args)
	{
		tower(3,'s','d','a');
		
	}

	private static void tower(int i, char src, char dest, char aux) {
     
		if(i==0){
			return;
		}
		
		tower(i-1, src,aux,dest);
		System.out.println("move the disk "+i+" from "+src+" to "+dest);
		tower(i-1, aux,dest,src);
		
		
	}
}
