package tree1;

import java.util.ArrayList;
import java.util.Scanner;



public class BST_Traversal {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
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
		
	    //bst.add(15);
	   
	    System.out.print("Pre-order traversal ");
		preOrder(bst.root);
		System.out.println();
		System.out.print("In-order traversal ");
	    inOrder(bst.root);
	    System.out.println();
	    System.out.print("Post-order traversal ");
		postOrder(bst.root);
		System.out.println("breadth first search");
		bfs(bst.root);		
		System.out.println();
		
		System.out.println("say if you would like to search a node");
		int n=s.nextInt();
		findNode(bst.root,n);
	    System.out.println("say if you would like to delete a node");
		int n1=s.nextInt();
		Node N=delete(bst.root,n1);
		System.out.println();
		inOrder(bst.root);
		System.out.println();
		System.out.println("say if you would like to find the min or max of the BST");
		char ch=s.next().charAt(0);
		if(ch=='m'){
			Node min=findMin(bst.root);
			System.out.println(min.getData());
		}else if(ch=='M'){
			Node max=findMax(bst.root);
			System.out.println(max.getData());
		}
	//Queue<Node> q1=new Queue<Node>();	
	System.out.println("say if you want to find the height of the tree");
	char ch1=s.next().charAt(0);
	if(ch1=='y'){
		
		int height=findHeight(bst.root);
		System.out.println("The height of the BST is "+height);
	}
	
	}
	
	
	
	private static void bfs(Node root) {
		// TODO Auto-generated method stub
		ArrayList<Node> queue=new ArrayList<Node>();
		if(root==null)
			return;
		queue.add(root);
		int i=0;
		while(!queue.isEmpty())
		{
			Node current=queue.get(0);
			if(current.left!=null)
				queue.add(current.left);
			if(current.right!=null)
				queue.add(current.right);
	        Node N=queue.get(i);
	        System.out.print(N.data+" ");
			i++;
		}
		
		
	}



	private static int findHeight(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return -1;
		
		
		return max(findHeight(root.left),findHeight(root.right))+1;
		
	}

	
	
	
	
	private static int max(int height1, int height2) {
		// TODO Auto-generated method stub
		return height1>height2?height1:height2; 
	}



	private static Node findMin(Node root) {
		//iterative
		//Node tmp=root;
		//while(root!=null){
			//tmp=root;
			//root=root.left;
		//}
		//return tmp;
	
		
		//lets do recursive
		Node tmp1=root;
		while(root!=null){
			tmp1=root;
			root=findMin(root.left);
		}
	  return tmp1;	
	}
	
	
	
	
	
	
	private static Node findMax(Node root) {
		//iterative
		//Node tmp=root;
		//while(root!=null){
			//tmp=root;
			//root=root.right;
		//}
		//return tmp;
		//lets do recursive
		Node tmp1=root;
		while(root!=null){
			tmp1=root;
			root=findMax(root.right);
		}
		return tmp1;
	}

	
	
	
	
	private static Node delete(Node root, int n1) {
		// TODO Auto-generated method stub
		if(root==null){
			return root;
		}
		else if(n1<root.data){
			root.left=delete(root.left,n1);
			
		}else if(n1>root.data){
			root.right=delete(root.right,n1);
		}else {
			if(root.left==null && root.right==null){
				root=null;
			}else if(root.left==null && root.right!=null){
				Node tmp=root;
				root=root.right;
				tmp=null;
				
			}else if(root.right==null && root.left!=null){
				Node tmp=root;
				root=root.left;
				tmp=null;
			}
			else {
				Node tmp=findMin(root.right);
				root.data=tmp.data;
				root.right=delete(root.right, tmp.data);
			}
		}
		return root;
		
			

		
		
	}

	
	
	
	
	

	private static void findNode(Node root, int n) {
		if(root==null)
		{
			System.out.println("data not found");
			return;
		}
		else if(n==root.data){
			System.out.println("found the data");
		}else if(n<root.data){
			findNode(root.left,n);
		}else if(n>root.data){
			findNode(root.right, n);
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
