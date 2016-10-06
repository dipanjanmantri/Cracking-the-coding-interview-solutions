package tree;

public class BinaryTree {

	Node root;
	
	public void add(int data){
		 Node nodeToAdd=new Node(data);
		 if(root==null){
			 root=nodeToAdd;
		 }
		 
		 //if data<node traverse left else traverse right 
		 //until we hit a node that we can't traverse 
		 else{
			 traverseAndAddNode(root, nodeToAdd);
		 }
		 
		 
	}

	private void traverseAndAddNode(Node node, Node nodeToAdd) {
		
		if(nodeToAdd.data<node.data)
		{
			if(node.left==null)
			{
				node.left=nodeToAdd;
			}
			else
			{
				traverseAndAddNode(node.left, nodeToAdd);
			}
			 
		 }
		else if(nodeToAdd.data>node.data)
		 {
			 if(node.right==null)
			 {
				 node.right=nodeToAdd;
			 }
			 else
			 {
				 traverseAndAddNode(node.right, nodeToAdd);
			 }
			 
		 }
	}
	
	public void traverse()
	{
	   //in-order traversal 
	   if(root!=null)
	   {
		   Node nodeToTraverse=root;
		   if(nodeToTraverse.left==null && nodeToTraverse.right==null)
		   {
			   System.out.println(nodeToTraverse.data);
		   }else
		   {
			   if(nodeToTraverse.left!=null)
			   {
				   inOrderTraverse(nodeToTraverse.left);
			   }
			   if(nodeToTraverse.right!=null)
			   {
				   inOrderTraverse(nodeToTraverse.right);
			   }   
		   }
		   
		  
	   }
	}

	private void inOrderTraverse(Node node) {
		// TODO Auto-generated method stub
		if(node.left!=null)
		{
			inOrderTraverse(node.left);
		}
		
		System.out.println(node.data);
		
		if(node.right!=null)
		{
			inOrderTraverse(node.right);
		}
		
	
		
		
	}
}
