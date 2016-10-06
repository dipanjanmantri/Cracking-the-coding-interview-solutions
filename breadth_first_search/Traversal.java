package breadth_first_search;

import java.util.LinkedList;
import java.util.Queue;
import tree1.BST;
import tree1.Node;

public class Traversal {

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
		
		System.out.print("Pre-order traversal ");
		preOrder(bst.root);
		System.out.println();
		System.out.print("In-order traversal ");
	    inOrder(bst.root);
	    System.out.println();
	    System.out.print("Post-order traversal ");
		postOrder(bst.root);
		System.out.println();
		System.out.println("prints the data according to the breadth first search");
		bfs(bst.root);
		//System.out.println("checks whether the tree is a BST or not");
		//boolean b=isBST(bst.root);
		//System.out.println(b);
		System.out.println();
		boolean b=isBalanced(bst.root);
		if(b==true){
			System.out.println("The tree is balanced");
		}else{
			System.out.println("The tree is not balanced");
		}
	}
	
	private static boolean isBalanced(Node n) {
		// TODO Auto-generated method stub
		boolean b=false;
		if(balancedHeight(n)>-1)
			b=true;
		return b;
	}
	
	
	
	private static int balancedHeight(Node n)
	{   
		int v=100;
		if(n==null){
			v=0;
			return v;
		}
			
		    
		int h1=balancedHeight(n.left);
		int h2=balancedHeight(n.right);
		//if(h1==-1 || h2==-1){
			//v=-1;
		//}
		//if(Math.abs(h1-h2)>1){
			//v=-1;
		//}
		if(h1>h2){
			v=h1+1;
		}else{
			v=h2+1;
		}
		v=h1+1;
		return v;
		
	}
	
	

	private static boolean isBST(Node root) {
		// TODO Auto-generated method stub
		
		boolean b=false;
		if(root==null){
			b=true;
		}
		if(isSubTreeLesser(root.left, root.data) && isSubTreeGreater(root.right, root.data)
				&& isBST(root.left) && isBST(root.right))
			b=true;
		
		return b;
		
	}

	
	
	private static boolean isSubTreeLesser(Node root, int data) {
		// TODO Auto-generated method stub
		boolean b=false;
		if(root==null){
			b=true;
			return b;
		}
		if(root.data<=data && isSubTreeLesser(root.left, data) && 
				isSubTreeLesser(root.right, data)){
			b=true;
		}
		return b;
		
	}

	
	
	private static boolean isSubTreeGreater(Node root, int data) {
		// TODO Auto-generated method stub
		boolean b=false;
		if(root==null){
			b=true;
			return b;
		}
		if(root.data>=data && isSubTreeGreater(root.left, data) && 
				isSubTreeGreater(root.right, data)){
			b=true;
		}
		return b;
		
	}

	private static void bfs(Node root) {
		// TODO Auto-generated method stub
		
		if(root==null)
			return;
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		System.out.println();
		while(!q.isEmpty())
		{
			Node current=q.peek();
			//System.out.println();
			System.out.print(current.getData()+" ");
			if(current.left!=null){
				q.add(current.left);
			}
			if(current.right!=null){
				q.add(current.right);
			}
			q.remove();//removing the element from the front
			
		}
		
	}

	private static void postOrder(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.getData()+" ");
	}

	private static void inOrder(Node root) {
		// TODO Auto-generated method stub
		if(root==null){
		    return;	
		}
		inOrder(root.left);
		System.out.print(root.getData()+" ");
		inOrder(root.right);
	}

	static void preOrder(Node root)
	{
		if(root==null){ 
			return;
		}
		System.out.print(root.getData()+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
}
