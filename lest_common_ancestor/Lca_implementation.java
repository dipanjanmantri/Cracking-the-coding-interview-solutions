package lest_common_ancestor;



public class Lca_implementation {

	public static void main(String[] args)
	{

		BST bst=new BST();
		Node a=new Node(10);
		Node b=new Node(6);
		Node c=new Node(14);
		Node d=new Node(3);
		Node e=new Node(7);
		Node f=new Node(12);
		Node g=new Node(16);
		bst.add(10);
		bst.add(6);
		bst.add(14);
		bst.add(3);
		bst.add(7);
		bst.add(12);
		bst.add(16);
		
		
		Node ancestor=lca(bst.root, d,e);
		System.out.println(ancestor.data);
	}

	private static Node lca(Node root, Node n1, Node n2) {
		// TODO Auto-generated method stub
		Node result=null;
		if(root==null){
			result=null;
			return result;
		}
		if(root==n1 || root==n2){
			result=root;
		}
		Node left=lca(root.left, n1,n2);
		Node right=lca(root.right,n1,n2);
		if(left!=null && right!=null){
			result=root;
		}
		if(left==null && right==null){
			result=null;
			
		}else{
			result=left!=null?left:right;
		}
		return result;
	}

	
}
