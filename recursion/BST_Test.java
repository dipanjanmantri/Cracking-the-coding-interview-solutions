package recursion;

import tree1.BST;
import tree1.Node;

public class BST_Test {

	public static void main(String[] args)
	{
		BST bst=new BST();
		bst.add(7);
		bst.add(1);
		bst.add(0);
		bst.add(3);
		bst.add(2);
		bst.add(5);
		bst.add(4);
		bst.add(6);
		bst.add(9);
		bst.add(8);
		bst.add(10);
		
		System.out.println("before changing nodes");
		inOrder(bst.root);
		
		change_nodes(bst.root);
		System.out.println();
		System.out.println("after changing nodes");
		inOrder(bst.root);
		
		
	}

	private static void inOrder(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}

	private static void change_nodes(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		root.data=1;
		change_nodes(root.left);
		change_nodes(root.right);
		
	}
}
