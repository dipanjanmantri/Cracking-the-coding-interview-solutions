package tree;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public static void main(String[] args)
	{
		BinaryTree tree=new BinaryTree();
		
		tree.add(50);
		tree.add(25);
		tree.add(75);
		tree.add(60);
		tree.add(20);
		tree.add(15);
		tree.add(18);
		tree.add(22);
		tree.add(5);
		tree.add(95);
		
		//System.out.println(tree.root.right.right.data);
		
		tree.traverse();
	}
}
