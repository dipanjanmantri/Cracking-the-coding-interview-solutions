package subBinaryTree;

public class TestSubBinaryTree {

	public static void main(String[] args)
	{
		BinaryTree t1=new BinaryTree(1);
		t1.left=new BinaryTree(2);
		t1.right=new BinaryTree(3);
		t1.right.left=new BinaryTree(4);
		t1.right.right=new BinaryTree(5);
		
		BinaryTree t2=new BinaryTree(3);
		t2.left=new BinaryTree(4);
		t2.right=new BinaryTree(5);
		
		if(ifSubTreeRef(t1,t1.right))
			System.out.println("t2 is a subtree of t1(reference)");
		else
			System.out.println("t2 is not a subtree of t1(reference)");
		
		if(ifSubTreeVal(t1,t2))
			System.out.println("t2 is a subtree of t1(val)");
		else
			System.out.println("t2 is not a subtree of t1(val)");
		
		if(ifSubTreeVal(t1,t1.left.right))
			System.out.println("t2 is a subtree of t1(reference)");
		else
			System.out.println("t2 is not a subtree of t1(reference)");
		
		if(ifSubTreeVal(t1,t1.left))
			System.out.println("t2 is a subtree of t1(reference)");
		else
			System.out.println("t2 is not a subtree of t1(reference)");
		
		
	}
	
	public static boolean ifSubTreeVal(BinaryTree t1, BinaryTree t2)
	{
		//first we check if root values are equal 
		//if so we continue to check children values 
		//for both trees until we find a match
		//this step should be tried until a true value is returned 
		//or all the subtrees have been visited for t1
		if(t2==null)
			return true;
		if(t1==null)
			return false;
		
		//checking if both t1 and and t2's subtree are same
		if(t1.v==t2.v){
			if(ifSubTreeVal(t1.left, t2.left) && ifSubTreeVal(t1.right, t2.right))
				return true;
		}
		
		//we need to go to t1's left or right subtree to continue the equality finding
		return ifSubTreeVal(t1.left, t2) || ifSubTreeVal(t1.right, t2);//
		
		
		
	}
	
	public static boolean ifSubTreeRef(BinaryTree t1, BinaryTree t2)
	{
		//check if t1 or t2 are null before comparing 
		
		if(t2==null)
			return true;//if t1 is not null and t2 is null then we 
		                //accept t2 as a subtree of t1
		if(t1==null)
			return false;//if t1 is null and t2 is not null then 
			        //t2 can't be a subtree of t1
		//otherwise we compare if they have equal reference 
		//if not then recursively compare t1's child with t2
		return(t1==t2 || ifSubTreeRef(t1.left,t2) || ifSubTreeRef(t1.right, t2));
		
	}
	
}


