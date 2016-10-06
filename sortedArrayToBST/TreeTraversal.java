package sortedArrayToBST;

import tree1.Node;

public class TreeTraversal {
	
	public static void main(String[] args)
	{
		BST bst=new BST();
		int[] arr={1,2,3,4,5,6,7,8};
		int i=0;
		while(i<arr.length)
		{
			bst.add(i);
			i++;
		}
		
		System.out.println("In order traversal");
		inOrder(bst.root);
		System.out.println();
		System.out.println("Pre order traversal");
		preOrder(bst.root);
		System.out.println();
		System.out.println("Post order traversal");
		postOrder(bst.root);
	}

	private static void postOrder(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		postOrder(root.left);
	    postOrder(root.right);
	    System.out.print(root.getData()+" ");
		
	}

	private static void preOrder(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		System.out.print(root.getData()+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}

	private static void inOrder(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.getData()+" ");
		inOrder(root.right);
		
	}
	
}
