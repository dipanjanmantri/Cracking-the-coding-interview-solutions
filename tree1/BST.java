package tree1;

public class BST {

	public Node root;
	public BST()
	{
		root=null;
	}
	
	int visit()
	{
		return root.getData();
	}
	
	public void add(int v)
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
