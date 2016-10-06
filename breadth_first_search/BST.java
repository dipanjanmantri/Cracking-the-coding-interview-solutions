package breadth_first_search;

import tree1.Node;

public class BST {

	Node root;
	BST()
	{
		root=null;
	}
	
	int visit()
	{
		return root.getData();
	}
	
	void add(int v)
	{
		root=add(root,v);
	}
	
	Node add(Node root, int v)
	{
		if(root==null)
		{
			root=new Node(v);
		}else if(v<root.getData())
		{
			root.left=add(root.left,v);
		}else if(v>root.getData())
		{
			root.right=add(root.right, v);
		}
		return root;
		
		
	}
	
	
}
